package com.example.collections

import java.util.Scanner

fun main() {
    val dersNotlari = ArrayList<DersNotlar>()

    while (true) {

        val girdi = Scanner(System.`in`)
        println("Dersin adını giriniz")
        val dersAdi = girdi.next()
        println("Dersin notunu giriniz")
        val dersNotu = girdi.nextInt()


        val yeniNot = DersNotlar(dersAdi, dersNotu)
        dersNotlari.add(yeniNot)


        println("Çıkmak için (1) - Devam etmek için diğer sayılar")
        val cikis = girdi.nextInt()
        if (cikis == 1) {
            for (o in dersNotlari) {
                println("*****************")
                println("Ders Adı : ${o.ders}")
                println("Ders Notu : ${o.not}")
            }
            println("Çıkış yapıldı.")
            break
        }
    }
}
