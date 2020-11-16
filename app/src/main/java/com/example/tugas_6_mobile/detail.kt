package com.example.tugas_6_mobile

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_item.*
import kotlinx.android.synthetic.main.list_item.*
import kotlinx.android.synthetic.main.detail_item.namaJajan as namaJajan1

class detail:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_item)

        var intentThatStartedThisActivity = getIntent()

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var partName = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            var partDesc = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var partFoto = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_REFERRER)?.toInt()
            var imageView = fotoJajan2
            namaJajan.text = partName
            descJajan2.text = partDesc
            fotoJajan2.setImageResource(R.drawable.esteler)
        }
    }
}