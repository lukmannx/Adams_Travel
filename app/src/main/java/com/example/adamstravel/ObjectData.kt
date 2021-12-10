package com.example.adamstravel

object ObjectData {
    private val title = arrayOf(
        "Bundaran HI",
        "Monas",
        "Kota Tua",
        "Dufan",
        "Ancol"
    )

    private val subTitle = arrayOf(
        "Bundaran HI adalah sebuah halte bus Transjakarta yang terletak di Jakarta Pusat",
        "Tugu Monas adalah monumen peringatan setinggi 132 meter",
        "Kota ini hanya seluas 15 hektare dan mempunyai tata kelola khas pelabuhan tradisional Jawa",
        "Dufan adalah taman bermain terfavorit di Jakarta. Seru banget bisa ke Istana Boneka, bianglala, halilintar, hingga hysteria",
        "Kalau ingin menikmati sunset, kamu bisa datang ke Pantai Ancol",
    )

    private val image = intArrayOf(
        R.drawable.bunhi,
        R.drawable.monas,
        R.drawable.kotu,
        R.drawable.dufan,
        R.drawable.ancol
    )

    private val pemilik = arrayOf(
        "Pemerintah Indonesia",
        "Pemerintah Indonesia",
        "Pemerintah Indonesia",
        "Pemerintah Indonesia",
        "Taman Impian Jaya Ancol"
    )

    private val arsitek = arrayOf(
        "Friedrich Silaban",
        "Soedarsono",
        "Marva",
        "Budi Priambodo",
        "Andra Matin"
    )

    private val lokasi = arrayOf(
        "Jakarta",
        "Jakarta",
        "Jakarta",
        "Jakarta",
        "Jakarta"
    )

    private val pembuatan = arrayOf(
        "Tahun 1959",
        "Tahun 1959",
        "Tahun 1526",
        "Tahun 1985",
        "Tahun 1960"
    )

    val listData: ArrayList<Data>
        get() {
            val list = arrayListOf<Data>()
            for (position in title.indices) {
                val trf = Data(
                    title = title[position],
                    subTitle = subTitle[position],
                    img = image[position],
                    pembuatan = pembuatan[position],
                    pemilik = pemilik[position],
                    arsitek = arsitek[position],
                    lokasi = lokasi[position],
                )

                list.add(trf)
            }
            return list
        }
}