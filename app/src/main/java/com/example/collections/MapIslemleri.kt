package com.example.collections

fun main() {
    val sayilar = mapOf<Int, String>(1 to "Bir", 2 to "İki")

    val oranlar = mutableMapOf<Double, String>(1.5 to "Oran1", 2.3 to "Oran2")

    val iller = HashMap<Int, String>()

    iller.put(16, "Bursa")
    iller.put(34, "İstanbul")

    println(iller.toString())

    iller.put(16, "Yeni Bursa")
    println(iller.toString())

    println(iller.get(34))


    println(iller.size)

    println(iller.isEmpty())
    println(iller.containsKey(16))
    println(iller.containsValue("İstanbul"))

    for ((anahtar, deger) in iller) {
        println("$anahtar : $deger")
    }

    iller.remove(16)

    println(iller.toString())

}