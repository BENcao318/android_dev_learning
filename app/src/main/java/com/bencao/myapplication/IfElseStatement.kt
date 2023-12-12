package com.bencao.myapplication

fun main(args: Array<String>) {
    print("Please enter a number : ")

    var number:Int = readln()!!.toInt()

    if(number % 2 === 0)
    {
        println("You have entered an even number: $number")
    }
    else {
        println("You have entered a odd number: $number")
    }
}