package com.example.conversormonedas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter.createFromResource(this, R.array.monedas, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = adapter
        spinner2.adapter = adapter


        boton_convertir.setOnClickListener {
        // Pressing the button executes this function
            if(et_valor.text.toString() == ""){
                resultado.text = "Debes ingresar un valor a convertir"
            }
            else if(spinner.selectedItem.toString() == "Pesos" && spinner2.selectedItem.toString() == "Pesos"){
                var numero_string = et_valor.text.toString()
                var numero_de = numero_string.toDouble()
                var numero_para = numero_string.toDouble()
                resultado.text = numero_de.toString() + " COP " + " = " + numero_para.toString() + " COP " + "\n" + "1" + " COP " + " = " + "1" + " COP "
            }
            else if(spinner.selectedItem.toString() == "Pesos" && spinner2.selectedItem.toString() == "Dolares"){
                var numero_string = et_valor.text.toString()
                var numero_de = numero_string.toDouble()
                var numero_para = numero_string.toDouble()*0.0003125
                resultado.text = numero_de.toString() + " COP " + "\n" + " = " + numero_para.toString() + " USD " + "\n" + "1" + " COP " + " = " + "0,0003125" + " USD "
            }
            else if(spinner.selectedItem.toString() == "Pesos" && spinner2.selectedItem.toString() == "Euros"){
                var numero_string = et_valor.text.toString()
                var numero_de = numero_string.toDouble()
                var numero_para = numero_string.toDouble()*0.0002787
                resultado.text = numero_de.toString() + " COP " + "\n" + " = " + numero_para.toString() + " EUR " + "\n" + "1" + " COP " + " = " + "0,0002787" + " EUR "
            }
            else if(spinner.selectedItem.toString() == "Pesos" && spinner2.selectedItem.toString() == "Libra Esterlina"){
                var numero_string = et_valor.text.toString()
                var numero_de = numero_string.toDouble()
                var numero_para = numero_string.toDouble()*0.0002518
                resultado.text = numero_de.toString() + " COP " + "\n" + " = " + numero_para.toString() + " GPB " + "\n" + "1" + " COP " + " = " + "0,0002518" + " GPB "
            }
            else if(spinner.selectedItem.toString() == "Dolares" && spinner2.selectedItem.toString() == "Pesos"){
                var numero_string = et_valor.text.toString()
                var numero_de = numero_string.toDouble()
                var numero_para = numero_string.toDouble()*3200
                resultado.text = numero_de.toString() + " USD " + " = " + numero_para.toString() + " COP " + "\n" + "1" + " USD " + " = " + "3200" + " COP "
            }
            else if(spinner.selectedItem.toString() == "Dolares" && spinner2.selectedItem.toString() == "Dolares"){
                var numero_string = et_valor.text.toString()
                var numero_de = numero_string.toDouble()
                var numero_para = numero_string.toDouble()
                resultado.text = numero_de.toString() + " USD " + " = " + numero_para.toString() + " USD " + "\n" + "1" + " USD " + " = " + "1" + " USD "
            }
            else if(spinner.selectedItem.toString() == "Dolares" && spinner2.selectedItem.toString() == "Euros"){
                var numero_string = et_valor.text.toString()
                var numero_de = numero_string.toDouble()
                var numero_para = numero_string.toDouble()*0.89
                resultado.text = numero_de.toString() + " USD " + " = " + numero_para.toString() + " EUR " + "\n" + "1" + " USD " + " = " + "0,89" + " EUR "
            }
            else if(spinner.selectedItem.toString() == "Dolares" && spinner2.selectedItem.toString() == "Libra Esterlina"){
                var numero_string = et_valor.text.toString()
                var numero_de = numero_string.toDouble()
                var numero_para = numero_string.toDouble()*0.81
                resultado.text = numero_de.toString() + " USD " + " = " + numero_para.toString() + " GPB " + "\n" + "1" + " USD " + " = " + "0,81" + " GPB "
            }
            else if(spinner.selectedItem.toString() == "Euros" && spinner2.selectedItem.toString() == "Pesos"){
                var numero_string = et_valor.text.toString()
                var numero_de = numero_string.toDouble()
                var numero_para = numero_string.toDouble()*3588
                resultado.text = numero_de.toString() + " EUR " + " = " + numero_para.toString() + " COP " + "\n" + "1" + " EUR " + " = " + "3588" + " COP "
            }
            else if(spinner.selectedItem.toString() == "Euros" && spinner2.selectedItem.toString() == "Dolares"){
                var numero_string = et_valor.text.toString()
                var numero_de = numero_string.toDouble()
                var numero_para = numero_string.toDouble()*1.1235955
                resultado.text = numero_de.toString() + " EUR " + " = " + numero_para.toString() + " USD " + "\n" + "1" + " EUR " + " = " + "1.1235955" + " USD "
            }
            else if(spinner.selectedItem.toString() == "Euros" && spinner2.selectedItem.toString() == "Euros"){
                var numero_string = et_valor.text.toString()
                var numero_de = numero_string.toDouble()
                var numero_para = numero_string.toDouble()
                resultado.text = numero_de.toString() + " EUR " + " = " + numero_para.toString() + " EUR " + "\n" + "1" + " EUR " + " = " + "1" + " EUR "
            }
            else if(spinner.selectedItem.toString() == "Euros" && spinner2.selectedItem.toString() == "Libra Esterlina"){
                var numero_string = et_valor.text.toString()
                var numero_de = numero_string.toDouble()
                var numero_para = numero_string.toDouble()*0.9
                resultado.text = numero_de.toString() + " EUR " + " = " + numero_para.toString() + " GPB " + "\n" + "1" + " EUR " + " = " + "0.9" + " GPB "
            }
            else if(spinner.selectedItem.toString() == "Libra Esterlina" && spinner2.selectedItem.toString() == "Pesos"){
                var numero_string = et_valor.text.toString()
                var numero_de = numero_string.toDouble()
                var numero_para = numero_string.toDouble()*3972
                resultado.text = numero_de.toString() + " GPB " + " = " + numero_para.toString() + " COP " + "\n" + "1" + " GPB " + " = " + "3972" + " COP "
            }
            else if(spinner.selectedItem.toString() == "Libra Esterlina" && spinner2.selectedItem.toString() == "Dolares"){
                var numero_string = et_valor.text.toString()
                var numero_de = numero_string.toDouble()
                var numero_para = numero_string.toDouble()*1.2345679
                resultado.text = numero_de.toString() + " GPB " + " = " + numero_para.toString() + " USD " + "\n" + "1" + " GPB " + " = " + "1.2345679" + " USD "
            }
            else if(spinner.selectedItem.toString() == "Libra Esterlina" && spinner2.selectedItem.toString() == "Euros"){
                var numero_string = et_valor.text.toString()
                var numero_de = numero_string.toDouble()
                var numero_para = numero_string.toDouble()*1.1111111
                resultado.text = numero_de.toString() + " GPB " + " = " + numero_para.toString() + " EUR " + "\n" + "1" + " GPB " + " = " + "1.1111111" + " EUR "
            }
            else if(spinner.selectedItem.toString() == "Libra Esterlina" && spinner2.selectedItem.toString() == "Libra Esterlina"){
                var numero_string = et_valor.text.toString()
                var numero_de = numero_string.toDouble()
                var numero_para = numero_string.toDouble()
                resultado.text = numero_de.toString() + " GPB " + " = " + numero_para.toString() + " GPB " + "\n" + "1" + " GPB " + " = " + "1" + " GPB "
            }
        }
    }
}
