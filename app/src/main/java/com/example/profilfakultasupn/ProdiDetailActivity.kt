package com.example.profilfakultasupn

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_prodi_detail.*

class ProdiDetailActivity : AppCompatActivity (){

    override  fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prodi_detail)

        var intentThatStartedThisActivity = getIntent()

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var nama= intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            var isiprodi = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SPLIT_NAME)
            var fotoprodi = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_REFERRER).toInt()
            tv_nama2.text = nama
            tv_isiprodi.text = isiprodi
            tv_foto2.setImageResource(fotoprodi)

        }
    }

}