package com.bencao.myapplication

import kotlin.random.Random

fun main(args: Array<String>) {
//    var i = 5
//    while (i > 0)
//    {
//        println(i)
//        i--
//    }

//    var k = 1
//    var fact = 1
//    while (k < 6)
//    {
//        fact *= k
//        println("$k! = $fact")
//        k++
//    }
    var number = Random.nextInt(0, 100)
    println("Please enter a number:")

    while (true)
    {
        val userGuess:Int = readln()!!.toInt()
        if(userGuess === number)
        {
            println("Congratulations, you know the number in my mind!")
            break
        }
        else if (userGuess < number)
        {
            println("Increase your guess")
        }
        else
        {
            println("Decrease your guess")
        }
    }
}