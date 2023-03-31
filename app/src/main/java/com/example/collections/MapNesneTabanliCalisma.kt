package com.example.collections

fun main(){
    val o1=Ogrenci(1, "Ahmet", "11F")
    val o2=Ogrenci(1, "Mehmet", "11F")
    val o3=Ogrenci(1, "Hasan", "11F")

    val ogrenciler = HashMap<Int, Ogrenci>()

    ogrenciler.put(o1.no, o1)
    ogrenciler.put(o2.no, o2)
    ogrenciler.put(o3.no, o3)
    println(ogrenciler.toString())

    for ((ogrenciNo, nesne) in ogrenciler){
        println("****************")
        println("Öğrenci No : $ogrenciNo")
        println("Öğrenci Ad : ${nesne.ad}")
        println("Öğrenci Sınıf : ${nesne.sinif}")
    }
}