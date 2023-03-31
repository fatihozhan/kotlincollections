package com.example.collections

fun main(){
    val meyveler = ArrayList<String>()

    meyveler.add("Çilek")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")

    for (meyve in meyveler){
        println("Sonuç : $meyve")
    }
    for ((index, meyve) in meyveler.withIndex()){
        println("Sonuç : $index : $meyve")
    }
}