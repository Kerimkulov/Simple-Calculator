package com.example.firstappcalculator

import java.lang.Exception

class CalculatorOperations{

    fun add(str: String, str2: String): String{
        var sumInt: Int
        var sumDouble: Double
        var sum: String
        try {
            if(str.contains('.')) {
                sumDouble = str.toDouble() + str2.toDouble()
                sum = sumDouble.toString()
            }
            else{
                sumInt = str.toInt() + str2.toInt()
                sum = sumInt.toString()
            }

        }
        catch (e:Exception)
        {
            return e.localizedMessage
        }
        return sum
    }
    fun substract(str: String, str2: String): String{
        var sumInt: Int
        var sumDouble: Double
        var sum: String
        try {
            if(str.contains('.')) {
                sumDouble = str.toDouble() - str2.toDouble()
                sum = sumDouble.toString()
            }
            else{
                sumInt = str.toInt() - str2.toInt()
                sum = sumInt.toString()
            }

        }
        catch (e:Exception)
        {
            return e.localizedMessage
        }
        return sum
    }
    fun divide(str: String, str2: String): String{
        var sum: Double
        try {
            if(str2.toDouble() == 0.0 ){
                return "cannot divide by zero!"
            }else
                sum = str.toDouble() / str2.toDouble()
        }
        catch (e:ArithmeticException)
        {
            return e.localizedMessage
        }
        return sum.toString()
    }
    fun multiplicate(str: String, str2: String): String{
        var sumInt: Int
        var sumDouble: Double
        var sum: String
        try {
            if(str.contains('.')) {
                sumDouble = str.toDouble() * str2.toDouble()
                sum = sumDouble.toString()
            }
            else{
                sumInt = str.toInt() * str2.toInt()
                sum = sumInt.toString()
            }

        }
        catch (e:Exception)
        {
            return e.localizedMessage
        }
        return sum
    }

}