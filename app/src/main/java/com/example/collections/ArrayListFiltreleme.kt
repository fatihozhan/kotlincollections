package com.example.collections

fun main() {
    val o1 = Ogrenci(1, "Ahmet", "11F")
    val o2 = Ogrenci(2, "Fatih", "10F")
    val o3 = Ogrenci(3, "Ceyda", "11F")
    val o4 = Ogrenci(4, "Yasin", "7F")
    val o5 = Ogrenci(5, "Mehmet", "9Z")

    val ogrenciler = ArrayList<Ogrenci>()

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)
    ogrenciler.add(o5)


    for (o in ogrenciler) {
        println("*****************")
        println("Öğrenci No : ${o.no}")
        println("Öğrenci Ad : ${o.ad}")
        println("Öğrenci Sınıf : ${o.sinif}")
    }
    var sonucListe = ogrenciler.filter { it.no > 2 }

    for (o in sonucListe) {
        println("*****************")
        println("Öğrenci No : ${o.no}")
        println("Öğrenci Ad : ${o.ad}")
        println("Öğrenci Sınıf : ${o.sinif}")
    }
    sonucListe = ogrenciler.filter { it.ad.contains("a") }

    for (o in sonucListe) {
        println("*****************")
        println("Öğrenci No : ${o.no}")
        println("Öğrenci Ad : ${o.ad}")
        println("Öğrenci Sınıf : ${o.sinif}")
    }
}