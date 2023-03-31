package com.example.collections

fun main(){
    val meyveler = setOf("Çilek", "Muz" , "Elma", "Kivi")
    val iller = mutableListOf("Bursa", "İstanbul", "Ankara", "İzmir")

    val sayilar = HashSet<Int>()

    sayilar.add(10)
    sayilar.add(20)
    sayilar.add(30)
    sayilar.add(20)

    println(sayilar.toString())

    println(sayilar.elementAt(1))
    println(sayilar.toString())

    println(sayilar.size)

    println(sayilar.isEmpty())
    println(sayilar.contains(20))

    for (i in sayilar) println(i)

    sayilar.remove(20)
    println(sayilar.toString())

    sayilar.clear()
    println(sayilar.toString())



}