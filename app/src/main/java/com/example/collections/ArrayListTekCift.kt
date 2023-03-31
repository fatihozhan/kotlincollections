package com.example.collections

fun main(){
    var sayilar = ArrayList<Int>()

    sayilar.add(1)
    sayilar.add(12)
    sayilar.add(14)
    sayilar.add(31)
    sayilar.add(61)
    sayilar.add(88)
    sayilar.add(43)

    val tekler = ArrayList<Int>()
    val ciftler = ArrayList<Int>()

    for (s in sayilar){
        val sonuc = s%2
        if (sonuc == 0) {
            ciftler.add(s)
        }else{
            tekler.add(s)
        }
    }

    println(tekler.toString())
    println(ciftler.toString())
}