package com.aziz.buttomproject.data

import com.aziz.buttomproject.Model.ModelGallery
import com.aziz.buttomproject.R

object DataGallery {
    private val gmbr_galery = intArrayOf(

        R.drawable.itisham,
        R.drawable.rombongan,
        R.drawable.kegiatanbelajar,
        R.drawable.kegiatan,
        R.drawable.donasilombok


    )
    private val nama_galery = arrayOf(
        "Pembangunan Masjid Al-I'tisham",
        "Kunjungan dari keluarga Ar-Rumi",
        "Kegiatan belajar mengajar",
        "Kegiatan Menanam tanaman Hydroponik",
        "Donasi untuk korban bencana Lombok",

        )
    private val desk_galery = arrayOf(
        "Masjid Al-I'tisham adalah masjid yang di donaturi oleh Syeikh Fawwaz",
        "Yayasan Islam Al-Kahfi kembali menerima rombongan tamu kehormatan dari keluarga Arrumy dari negara Kuwait di Markaz Arrumy, Nongsa, Batam Rabu (11/04/2018). Syeikh Fawwaz Al-Kulaib hafidzahulloh selaku pimpinan rombongan kali ini sengaja mengunjungi komplek atau markaz Arrumy yang terletak di Nongsa, Batam dalam rangka silaturahim serta peninjauan proyek pembangunan pondok pesantren tersebut.\n" +
                "\n" +
                "Acara penyambutan rombongan keluarga Arrumy ini merupakan agenda rutin yang di lakukan oleh Yayasan keluarga Arrumy dan Yayasan Islam Al-kahfi. Sebelumnya, Syeikh Fawwaz Al-Kulaib hafidzahulloh beserta rombongan terlebih dahulu ke Lombok dan Malang, juga merupakan kebiasaan beliau beserta rombongan untuk mengunjungi beberapa pondok pesantren binaan keluarga Arrumy.",
        "Kegiatan belajar mengajar yang penuh nuansa/vibe yang ceria",
        "Kali ini santri akhwat berkesempatan untuk melakukan kegiatan menanam tumbuhan Hydroponik",
        "tempat belajar"

    )
    val listGallery: ArrayList<ModelGallery>
        get() {
            val datagallery = arrayListOf<ModelGallery>()
            for (position in nama_galery.indices) {
                val gallery = ModelGallery()
                gallery.namaGallery = nama_galery[position]
                gallery.deskGallery = desk_galery[position]
                gallery.gmbrGallery = gmbr_galery[position]
                datagallery.add(gallery)
            }
            return datagallery
        }
}
