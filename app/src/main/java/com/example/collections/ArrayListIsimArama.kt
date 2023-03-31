package com.example.collections

import java.util.Scanner

fun main(){
    val girdi = Scanner(System.`in`)

    val isimler = ArrayList<String>()

    isimler.add("Zeynep")
    isimler.add("Mehmet")
    isimler.add("Sedat")
    isimler.add("Ercan")
    isimler.add("Ahmet")

    println("Aratmak için isim giriniz")

    val isim = girdi.next()

    for (i in isimler){
        if (i == isim) {
            println("İsim Mevcut")
            break
        }
    }
}