package com.example.collections

import java.util.Scanner

fun main() {
    val girdi = Scanner(System.`in`)
    val personeller = ArrayList<Personel>()

    for (i in 1..5) {

        println("$i. Personel ad : ")
        val isim = girdi.next()

        println("$i. Personel adres il")
        val il = girdi.next()

        println("$i. Personel adres ilçe")
        val ilce = girdi.next()
        val adres = Adres(il, ilce)

        val personel = Personel(i, isim, adres)
        personeller.add(personel)
    }
    for (p in personeller){
        println("*****************")
        println("Personel No : ${p.no}")
        println("Personel İsim : ${p.isim}")
        println("Personel İl : ${p.adres.il}")
        println("Personel İlce : ${p.adres.ilce}")
    }
}