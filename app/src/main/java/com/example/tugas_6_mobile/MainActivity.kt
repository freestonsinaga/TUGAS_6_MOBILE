package com.example.tugas_6_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testJajan = createDataJajan()
        RV.layoutManager = LinearLayoutManager(this)
        RV.setHasFixedSize(true)
        RV.adapter = adapter(testJajan, { jajanItem: d_jajan -> jajanItemClicked(jajanItem) })

    }

    private fun jajanItemClicked(jajanItem: d_jajan) {
        val showIntent = Intent(this, detail::class.java)
        showIntent.putExtra(Intent.EXTRA_TEXT, jajanItem.namaJajan.toString())
        showIntent.putExtra(Intent.EXTRA_TEMPLATE, jajanItem.descJajan.toString())
        showIntent.putExtra(Intent.EXTRA_REFERRER, jajanItem.foto.toString())
        startActivity(showIntent)
    }

    private fun createDataJajan(): List<d_jajan> {
        val partList = ArrayList<d_jajan>()
        partList.add(
            d_jajan(
                "Bubur Madura",
                "Bubur Madura yang terkenal berada di lantai dasar Pasar Atom Surabaya. Bubur Madura ini merupakan bubur yang tidak biasa seperti yang kita kenal. Jika bubur biasanya identik dengan rasa asin dan gurih, bubur Madura ini disajikan dengan rasa manis. Bubur Madura merupakan perpaduan bubur sumsum, bubur ketan hitam, dan bubur mutiara. Tak ketinggalan, bubur Madura ini paling mantap disiram kuah santan dan gula merah cair di atasnya. Hmm, jadi buru-buru pengin nyobain",
                R.drawable.buburmadura
            )
        )
        partList.add(
            d_jajan(
                "Es Teler",
                "Es teler yang satu ini wajib kamu cobain apabila kamu berkunjung ke Surabaya. Terutama jika kamu mampir di Jl. Taman Apsari No. 7 Genteng. Isian yang lengkap mulai dari alpukat, kelapa, muda, potongan nangka hingga paduan es serutnya yang menambah kenikmatan di cuaca Surabaya yang terik. Wah jadi ngiler banget nih!",
                R.drawable.esteler
            )
        )
        partList.add(
            d_jajan(
                "Lumpur mudamudi",
                "Lumpur muda-mudi ini sangat digemari oleh khususnya warga Sidoarjo, memang sedikit jauh dari kota Surabaya tapi gak ada salahnya untuk mampir ke Jl. Dr. Wahidin No. 96B demi mencoba lumpur yang lumer di mulut. Kue lumpur ini terdapat beberapa varian yaitu original, durian, kelapa muda, keju, green tea, dan juga cokelat. Untuk harganya sangat terjangkau, untuk yang original seharga Rp2.750,- dan untuk varian rasa lainnya seharga 3250 rupiah. Penasaran dengan kelumeran kue lumpur ini?",
                R.drawable.lumpurmudamudi
            )
        )
        partList.add(
            d_jajan(
                "Pastel Pucang",
                "Pastel Pucang ini berlokasi di Jl. Pucang Sawit No.28, Pucang Sewu, Gubeng dikelola oleh seorang ibu yang akrab dipanggil Oma Toety. Beliau sudah memulai usaha membuat pastel sudah cukup lama. Pastel yang disajikan ini juga terbatas dan pemesanannya hanya via telepon saja lho.",
                R.drawable.pastelpucang
            )
        )
        partList.add(
            d_jajan(
                "Spikoe",
                "Spikoe Resep Kuno ini sudah terkenal sejak puluhan tahun. Khas dari Spikoe Resep Kuno ini adalah tekstur spikuknya sangat lembut dan tentu saja tentang rasanya yang sangat autentik. Spikoe Resep Kuno ini dapat ditemui di Jl. Rungkut Madya No.41 Surabaya. Untuk kisaran harga spiku ini dibanderol mulai harga Rp75.000,- per kotaknya hingga Rp200.000,-",
                R.drawable.spikoe
            )
        )
        partList.add(
            d_jajan(
                "Rawon Setan",
                "Namanya terdengar seram. Seseram rasanya. Rawon setan ini sangat pedas. Para pecinta pedas tentu saja tidak boleh melewatkan makanan surabaya yang terkenal ini. Rawon setan ini dinamai demikian sebab jam bukanya pk 23.00. Belum lagi, ini juga dilengkapi dengan potongan daging sapi empuk. Tauge dan telor asin. Tempat ini terletak di Jl. Embong Malang No.78/I, In front of JW Marriott Hotel Surabaya 60261  ",
                R.drawable.rawonsetan
            )
        )
        return partList
    }
}

