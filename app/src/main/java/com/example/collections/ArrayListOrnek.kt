package com.example.collections

import java.util.Scanner

fun main() {
    val girdi = Scanner(System.`in`)
    var sayac = 1
    val ogrenciler = ArrayList<Ogrenci>()
    while (true) {
        println("Öğrenci adını girin")
        var ad = girdi.next()
        println("Öğrenci sınıfını girin")
        var sinif = girdi.next()
        val yeniOgrenci = Ogrenci(sayac, ad, sinif)
        sayac += 1
        println("Çıkmak için (1) - Devam etmek için diğer sayılar")
        ogrenciler.add(yeniOgrenci)
        val cikis = girdi.nextInt()

        if (cikis == 1) {
            for (o in ogrenciler){
                println("*****************")
                println("Öğrenci No : ${o.no}")
                println("Öğrenci Ad : ${o.ad}")
                println("Öğrenci Sınıf : ${o.sinif}")
            }
            println("Çıkış yapıldı.")
            break
        }
    }
}