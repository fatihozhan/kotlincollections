package com.example.collections

fun main() {
    val k1 = Kisiler(1, "Fatih")
    val k2 = Kisiler(2, "Orhan")
    val k3 = Kisiler(3, "Veli")

    val kisilerArrayList = ArrayList<Kisiler>()

    kisilerArrayList.add(k1)
    kisilerArrayList.add(k2)
    kisilerArrayList.add(k3)
    println("Önce")

    for (k in kisilerArrayList) {
        println("Kişi No ${k.kisiNo}, Kişi Adı : ${k.kisiAdi}")

    }

    println("Sayısal Küçükten Büyüğe Sıralama")

    val siralamaArrayList1 = kisilerArrayList.sortedWith(compareBy { it.kisiNo })

    for (k in siralamaArrayList1) {
        println("${k.kisiNo} - ${k.kisiAdi}")
    }


    val siralamaArrayList2 = kisilerArrayList.sortedWith(compareByDescending { it.kisiNo })

    for (k in siralamaArrayList2) {
        println("${k.kisiNo} - ${k.kisiAdi}")
    }

    val siralamaArrayList3 = kisilerArrayList.sortedWith(compareByDescending { it.kisiAdi })

    for (k in siralamaArrayList3) {
        println("${k.kisiNo} - ${k.kisiAdi}")

    }
}