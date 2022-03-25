package com.example.project2.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.math.sqrt

class MainViewModel : ViewModel() {


    private var expression = StringBuilder()
    private var result : MutableLiveData<String> = MutableLiveData()
    private var newVal : Double = 0.0
    private var prevVal : Double = 0.0
    private var currentOperation = " "
    private var sign = ""
    private var operatorClicked = false

    fun getResult(): MutableLiveData<String> {
        return result
    }
    private fun setResult(str: String){
        result.value = str
    }

    fun setExpression(value: String){
        if (operatorClicked){
            expression.clear()
            operatorClicked = false
        }
        if (value == "PM"){
            if (sign == "" || sign == "+"){
                sign = "-"
            }else{
                sign = "+"
            }
        }
        else if (value.equals("*")){
            if (expression.isEmpty()){

            }else {

                operatorClicked = true
                var res = 0.0
                when (currentOperation) {
                    "=" -> {
                        res = expression.toString().toDouble()
                        prevVal = res
                        setResult("0")
                    }
                    "+" -> {
                        res = (prevVal + expression.toString().toDouble())
                        prevVal = res
                        setResult(res.toString())
                    }
                    "-" -> {
                        res = (prevVal - expression.toString().toDouble())
                        prevVal = res
                        setResult(res.toString())
                    }
                    "*" -> {
                        res = (prevVal * expression.toString().toDouble())
                        prevVal = res
                        setResult(res.toString())
                    }
                    "/" -> {
                        res = (prevVal / expression.toString().toDouble())
                        prevVal = res
                        setResult(res.toString())
                    }
                    "%" -> {
                        res = (prevVal % expression.toString().toDouble())
                        prevVal = res
                        setResult(res.toString())
                    }
                    "sqrt" -> {
                        res = (sqrt(expression.toString().toDouble()))
                        prevVal = res
                        setResult(res.toString())
                    }
                    " " -> {
                        currentOperation = "*"
                        prevVal = expression.toString().toDouble()
                        setResult(res.toString())
                    }
                }
                currentOperation = "*"
            }

        }
        else if (value.equals("/")){
            if (expression.isEmpty()){

            }else {


                operatorClicked = true
                var res = 0.0
                when (currentOperation) {
                    "=" -> {
                        res = expression.toString().toDouble()
                        prevVal = res
                        setResult("0")
                    }
                    "+" -> {
                        res = (prevVal + expression.toString().toDouble())
                        prevVal = res
                        setResult(res.toString())
                    }
                    "-" -> {
                        res = (prevVal - expression.toString().toDouble())
                        prevVal = res
                        setResult(res.toString())
                    }
                    "*" -> {
                        res = (prevVal * expression.toString().toDouble())
                        prevVal = res
                        setResult(res.toString())
                    }
                    "/" -> {
                        res = (prevVal / expression.toString().toDouble())
                        prevVal = res
                        setResult(res.toString())
                    }
                    " " -> {
                        currentOperation = "/"
                        prevVal = expression.toString().toDouble()
                        setResult(prevVal.toString())
                    }
                }
                currentOperation = "/"
            }
        }
        else if(value.equals("+")){
            if (expression.isEmpty()) {

            }
            else {


                operatorClicked = true
                var res = 0.0
                when (currentOperation) {
                    "=" -> {
                        res = expression.toString().toDouble()
                        prevVal = res
                        setResult("0")
                    }
                    "+" -> {
                        res = (prevVal + expression.toString().toDouble())
                        prevVal = res
                        setResult(res.toString())
                    }
                    "-" -> {
                        res = (prevVal - expression.toString().toDouble())
                        prevVal = res
                        setResult(res.toString())
                    }
                    "*" -> {
                        res = (prevVal * expression.toString().toDouble())
                        prevVal = res
                        setResult(res.toString())
                    }
                    "/" -> {
                        res = (prevVal / expression.toString().toDouble())
                        prevVal = res
                        setResult(res.toString())
                    }
                    " " -> {
                        prevVal = expression.toString().toDouble()
                        setResult(prevVal.toString())
                    }
                }
                currentOperation = "+"
            }
        }
        else if (value.equals("-")) {
            if (expression.isEmpty()) {

            }
            else {


                operatorClicked = true
                var res = 0.0
                when (currentOperation) {
                    "=" -> {
                        res = expression.toString().toDouble()
                        prevVal = res
                        setResult("0")
                    }
                    "+" -> {
                        res = (prevVal + expression.toString().toDouble())
                        prevVal = res
                        setResult(res.toString())
                    }
                    "-" -> {
                        res = (prevVal - expression.toString().toDouble())
                        prevVal = res
                        setResult(res.toString())
                    }
                    "*" -> {
                        res = (prevVal * expression.toString().toDouble())
                        prevVal = res
                        setResult(res.toString())
                    }
                    "/" -> {
                        res = (prevVal / expression.toString().toDouble())
                        prevVal = res
                        setResult(res.toString())
                    }
                    " " -> {
                        prevVal = expression.toString().toDouble()
                        setResult(prevVal.toString())
                    }
                }
                currentOperation = "-"
            }
        }
        else if (value.equals("=")){
            if (expression.isEmpty()) {

            }
            else {


                var res = 0.0
                if (prevVal.equals(0.0)) {
                    prevVal = expression.toString().toDouble()
                    setResult(prevVal.toString())
                } else {
                    when (currentOperation) {
                        "=" -> {
                            res = expression.toString().toDouble()
                            prevVal = res
                            setResult("0")
                        }
                        "+" -> {
                            res = (prevVal + expression.toString().toDouble())
                            prevVal = res
                            setResult(res.toString())
                        }
                        "-" -> {
                            res = (prevVal - expression.toString().toDouble())
                            prevVal = res
                            setResult(res.toString())
                        }
                        "*" -> {
                            res = (prevVal * expression.toString().toDouble())
                            prevVal = res
                            setResult(res.toString())
                        }
                        "/" -> {
                            res = (prevVal / expression.toString().toDouble())
                            prevVal = res
                            setResult(res.toString())
                        }
                        "%" -> {
                            res = (prevVal % expression.toString().toDouble())
                            prevVal = res
                            setResult(res.toString())
                        }
                        "sqrt" -> {
                            res = (sqrt(expression.toString().toDouble()))
                            prevVal = res
                            setResult(res.toString())
                        }
                        " " -> {
                            prevVal = expression.toString().toDouble()
                            setResult(prevVal.toString())
                        }

                    }
                }
            }
        }
        else if (value.equals("%")){
            if (expression.isEmpty()) {

            }else {


                operatorClicked = true
                var res = 0.0
                when (currentOperation) {
                    "=" -> {
                        res = expression.toString().toDouble()
                        prevVal = res
                        setResult("0")
                    }
                    "+" -> {
                        res = (prevVal + expression.toString().toDouble())
                        prevVal = res
                        setResult(res.toString())
                    }
                    "-" -> {
                        res = (prevVal - expression.toString().toDouble())
                        prevVal = res
                        setResult(res.toString())
                    }
                    "*" -> {
                        res = (prevVal * expression.toString().toDouble())
                        prevVal = res
                        setResult(res.toString())
                    }
                    "/" -> {
                        res = (prevVal / expression.toString().toDouble())
                        prevVal = res
                        setResult(res.toString())
                    }
                    "%" -> {
                        res = (prevVal % expression.toString().toDouble())
                        prevVal = res
                        setResult(res.toString())
                    }
                    "sqrt" -> {
                        res = (sqrt(expression.toString().toDouble()))
                        prevVal = res
                        setResult(res.toString())
                    }
                    " " -> {
                        prevVal = expression.toString().toDouble()
                        setResult(prevVal.toString())
                    }
                }
                currentOperation = "%"
            }
        }
        else if (value.equals("sqrt")){

            var res = 0.0
            when (currentOperation){
                "=" -> {
                    res = expression.toString().toDouble()
                    prevVal = res
                    setResult("0")
                }
                "+" -> {
                    res = (prevVal + expression.toString().toDouble())
                    prevVal = res
                    setResult(res.toString())
                }
                "-" -> {
                    res = (prevVal - expression.toString().toDouble())
                    prevVal = res
                    setResult(res.toString())
                }
                "*" -> {
                    res = (prevVal * expression.toString().toDouble())
                    prevVal = res
                    setResult(res.toString())
                }
                "/" -> {
                    res = (prevVal / expression.toString().toDouble())
                    prevVal = res
                    setResult(res.toString())
                }
                "%" -> {
                    res = (prevVal % expression.toString().toDouble())
                    prevVal = res
                    setResult(res.toString())
                }
                "sqrt" -> {
                    res = (sqrt(expression.toString().toDouble()))
                    prevVal = res
                    setResult(res.toString())
                }
                " " -> {

                }
            }
            currentOperation = "sqrt"
        }
        else if (value.equals("C")){
            expression.clear()
            setResult("0")
        }
        else if (value.equals("CE")){
            expression.clear()
            prevVal = 0.0
            currentOperation = " "
            operatorClicked = false
            sign = ""
            setResult("0")
        }
        else if (value.equals("DEL")){
            expression.dropLast(1)
            setResult(expression.toString())
        }
        else{
            if (currentOperation.equals("=")){
                expression.clear()
                expression.append(value)
                setResult(expression.toString())
            }else {
                expression.append(value)
                setResult(expression.toString())
            }

        }
    }
}