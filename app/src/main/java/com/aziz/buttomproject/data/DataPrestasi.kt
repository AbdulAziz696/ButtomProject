package com.aziz.buttomproject.data

import com.aziz.buttomproject.Model.ModelPrestasi
import com.aziz.buttomproject.R

object DataPrestasi {
    private val gmbr_prestasi = intArrayOf(
        R.drawable.studybunding,
        R.drawable.lombabarab,
        R.drawable.lombabiologi,
        R.drawable.foging,
        R.drawable.perpus,
        R.drawable.fukuoka

    )
    private val nama_prestasi = arrayOf(
        "Study Banding",
        "lomba arab",
        "lomba biologi",
        "foging",
        "perpus",
        "SMPIT Imam Syafi'i"

    )
    private val desk_prestasi = arrayOf(

        "Pada kesempata kali ini SMPIT imam Syafi'i mendapatkan kesempatan untuk melakukan Study Banding ke beberapa sekolah yang terkenal.",
        "Juara 1 lomba B.Arab tingkat provinsi Kepulauan Riau. ",
        "Batam, 16 Oktober 2021\n" +
                "\n" +
                "Alhamdulillah prestasi demi prestasi kembali ditorehkan oleh santri PPIT Imam Syafi'i.\n" +
                "\n" +
                "Kali ini prestasi dalam bidang akademik yang diraih oleh ananda Muhammad Dzaky Danial; siswa kelas IX SMP IT Imam Syafi'i yang meraih medali perak pada ajang Olimpiade Biologi Jenjang SMP sederajat Tingkat Nasional yang diadakan oleh Insight Olimpiade pada tanggal 3 Oktober 2021.\n",
        "Alhamdulillah pada kesempatan kali ini santri SMPIT Imam Syafi'i sekali lagi berhasil mendapatkan juara pada olimpiade Biologi",
        "Untuk membuat lingkungan sekolah semakin aman dan terhindar dari penyakit, pada kesempatan kali ini sekolah mengadaka kegiatan foging",
        "Allhamdulillah pada kesempatan kali ini SMPIT Imam Syafi'i mendapatkan 500 buku exemplar dari Perpustakaan INDONESIA",
        "tempat belajar"

    )
    val listPrestasi: ArrayList<ModelPrestasi>
        get() {

            val dataprestasi = arrayListOf<ModelPrestasi>()
            for (position in nama_prestasi.indices) {
                val prestasi = ModelPrestasi()
                prestasi.namaPrestasi = nama_prestasi[position]
                prestasi.deskPrestasi = desk_prestasi[position]
                prestasi.gmbrPrestasi = gmbr_prestasi[position]
                dataprestasi.add(prestasi)
            }
            return dataprestasi
        }

}