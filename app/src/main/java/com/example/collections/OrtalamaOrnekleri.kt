package com.example.collections

fun main(){
    val sayilar = ArrayList<Int>()

    sayilar.add(20)
    sayilar.add(34)
    sayilar.add(40)
    sayilar.add(70)
    sayilar.add(40)
    sayilar.add(20)
    sayilar.add(50)
    var toplam = 0

    for (s in sayilar) toplam = toplam + s

    println("Ortalama = ${toplam / sayilar.count()}")
}