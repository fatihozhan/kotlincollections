package com.example.collections

fun main(){
    val meyveler = ArrayList<String>()

    meyveler.add("Çilek")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Kivi")
    meyveler.add("Portakal")

    println(meyveler.isEmpty())
    println(meyveler.count())
    println(meyveler.size)
    println(meyveler.first())
    println(meyveler.last())
    println(meyveler.contains("Kivi"))
    println(meyveler.min())
    println(meyveler.max())
    println(meyveler.sort())
    println(meyveler.toString())
    println(meyveler.reverse())
    println(meyveler.toString())
    println(meyveler.removeAt(3))
    println(meyveler.toString())
    println(meyveler.remove("Kivi"))
    println(meyveler.toString())
    println(meyveler.clear())
    println(meyveler.toString())

}