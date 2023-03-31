package com.example.collections

fun main(){
    val o1 = Ogrenci(1, "Mehmet", "11F")
    val o2 = Ogrenci(2, "Ceyda", "1F")
    val o3 = Ogrenci(3, "Zeynep", "9E")
    val o4 = Ogrenci(1, "Ece", "12A")

    val ogrenciler = HashSet<Ogrenci>()

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)

    for (o in ogrenciler){
        println("*****************")
        println("Öğrenci No : ${o.no}")
        println("Öğrenci Ad : ${o.ad}")
        println("Öğrenci Sınıf : ${o.sinif}")
    }
}