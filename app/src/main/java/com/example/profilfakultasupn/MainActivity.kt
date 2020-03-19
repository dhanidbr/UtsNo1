package com.example.profilfakultasupn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = createResepData()
        prodi_parts.layoutManager = LinearLayoutManager(this)
        prodi_parts.setHasFixedSize(true)
        prodi_parts.adapter = ProdiAdapter(testData, { prodiItem : ProdiData -> resepItemClicked(prodiItem) })
    }
    private fun resepItemClicked(prodiItem : ProdiData) {
        val showDetailActivityIntent = Intent(this, ProdiDetailActivity::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, prodiItem.namaProdi.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_SPLIT_NAME, prodiItem.isiProdi.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_REFERRER, prodiItem.fotoProdi.toString())
        startActivity(showDetailActivityIntent)
    }
    private fun createResepData() : List<ProdiData> {
        val partList = ArrayList<ProdiData>()
        partList.add(ProdiData("FAKULTAS EKONOMI \nDAN BISNIS","Fakultas Ekonomi dan Bisnis Merupakan salah satu dari 7 Fakultas di UPN “Vetaran” Jawa Timur. Yang terdiri dari program Studi: \n" +
                "1.\tEkonomi Pembangunan\n" +
                "2.\tAkuntansi\n" +
                "3.\tManajemen\n", R.drawable.upn))
        partList.add(ProdiData("FAKULTAS PERTANIAN","Fakultas Pertanian Merupakan salah satu dari 7 Fakultas di UPN “Vetaran” Jawa Timur. Yang terdiri dari program Studi: \n" +
                "1.\tAgroteknologi\n" +
                "2.\tAgribisnis\n", R.drawable.upn))
        partList.add(ProdiData("FAKULTAS TEKNIK","Fakultas Teknik Merupakan salah satu dari 7 Fakultas di UPN “Vetaran” Jawa Timur. Yang terdiri dari program Studi: \n" +
                "1.\tTeknik Kimia\n" +
                "2.\tTeknik Industri\n" +
                "3.\tTeknik Sipil\n" +
                "4.\tTeknik Lingkungan\n" +
                "5.\tTeknologi Pangan\n", R.drawable.upn))
        partList.add(ProdiData("FAKULTAS ILMU \nKOMPUTER","Fakultas Ilmu Komputer Merupakan salah satu dari 7 Fakultas di UPN “Vetaran” Jawa Timur. Yang terdiri dari program Studi: \n" +
                "1.\tTeknik Informatika\n" +
                "2.\tSistem Informasi\n", R.drawable.upn))
        partList.add(ProdiData("Dian Budi\nRachmadhani","1.\tNama: Dian Budi Rachmadhani\n2.\tTTL: Surabaya,02 Januari 1999\n3.\tAlamat: Jl Raganata No 29 Kav 12\n4.\tNo.HP: 081217353865\n5.\tEmail: Dhanidbr.private@mail.com\n6.\tUrl Profil Github: \n\t\t\thttps://github.com/dhanidbr\n7.\tRiwayat Pendidikan: -\n8.\tPenghargaan: -",R.drawable.dbr))

        return partList
    }
}
