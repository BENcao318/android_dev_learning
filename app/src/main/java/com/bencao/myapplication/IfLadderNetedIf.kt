package com.bencao.myapplication

fun main(args: Array<String>) {
/*    print("Pelase enter your age: ")

    var yourAge:Int = readln()!!.toInt()

    if(yourAge < 13){
        print("You are a child.")
    }
    else if(yourAge < 19) {
        print("You are a teenager.")
    }
    else {
        if(yourAge < 65) {
            print("You are an adult.")
        } else {
            print("You are a senior.")
        }

    }

 */

    print("Please enter 3 numbers : ")
    var number1:Int = readln()!!.toInt()
    var number2:Int = readln()!!.toInt()
    var number3:Int = readln()!!.toInt()

    var largestNumber:Int

    if(number1 >= number2) {
        if(number1 >= number3) {
            largestNumber = number1
        }
        else {
            largestNumber = number3
        }
    } else {
        if(number2 >= number3) {
            largestNumber = number2
        } else {
            largestNumber = number3
        }
    }

    println("The largest number is $largestNumber")
}
