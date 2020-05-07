package com.example.firstappcalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initState()


    }
    fun initState(){
        var calculator = CalculatorOperations()
        var value = ""
        var operation = 0

        btn_0.setOnClickListener{ResultText.append("0")}
        btn_1.setOnClickListener{ResultText.append("1")}
        btn_2.setOnClickListener{ResultText.append("2")}
        btn_3.setOnClickListener{ResultText.append("3")}
        btn_4.setOnClickListener{ResultText.append("4")}
        btn_5.setOnClickListener{ResultText.append("5")}
        btn_6.setOnClickListener{ResultText.append("6")}
        btn_7.setOnClickListener{ResultText.append("7")}
        btn_8.setOnClickListener{ResultText.append("8")}
        btn_9.setOnClickListener{ResultText.append("9")}

        clearBySubstring.setOnClickListener {
            try {
                ResultText.text = ResultText.text.substring(0, ResultText.text.length - 1)
            }
            catch (e:Exception){
                ResultText.text = e.localizedMessage
            }
        }

        btn_add.setOnClickListener{
            value = ResultText.text.toString()
            operation = 1
            ResultText.text=""
            WholeText.text = "$value + "

        }
        btn_multi.setOnClickListener{
            operation = 2
            value = ResultText.text.toString()
            ResultText.text = ""
            WholeText.text = "$value * "
        }
        btn_subs.setOnClickListener{
            operation = 3
            value = ResultText.text.toString()
            ResultText.text = ""
            WholeText.text = "$value - "
        }
        btn_divi.setOnClickListener{
            operation = 4
            value = ResultText.text.toString()
            ResultText.text =""
            WholeText.text = "$value / "
        }
        btn_C.setOnClickListener{
            ResultText.text = ""
            WholeText.text = ""
        }

        btn_equal.setOnClickListener{
            if(operation == 1){
                WholeText.text = WholeText.text.toString() + ResultText.text.toString()
                ResultText.text = calculator.add(value,ResultText.text.toString())
                WholeText.text = WholeText.text.toString() +  " = " + ResultText.text.toString()
            }else if (operation == 2){
                WholeText.text = WholeText.text.toString() + ResultText.text.toString()
                ResultText.text = calculator.multiplicate(value,ResultText.text.toString())
                WholeText.text = WholeText.text.toString() +  " = " + ResultText.text.toString()
            }else if(operation == 3 ){
                WholeText.text = WholeText.text.toString() + ResultText.text.toString()
                ResultText.text = calculator.substract(value,ResultText.text.toString())
                WholeText.text = WholeText.text.toString() +  " = " + ResultText.text.toString()
            }else if(operation == 4){
                WholeText.text = WholeText.text.toString() + ResultText.text.toString()
                ResultText.text = calculator.divide(value,ResultText.text.toString())
                WholeText.text = WholeText.text.toString() +  " = " + ResultText.text.toString()
            }
        }
    }
}
