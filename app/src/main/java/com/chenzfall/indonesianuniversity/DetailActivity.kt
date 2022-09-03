package com.chenzfall.indonesianuniversity

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    private lateinit var imgPicUniversity: ImageView
    private lateinit var tvAlamatUniversity: TextView
    private lateinit var tvTipeUniversity: TextView
    private lateinit var tvStatusUniversity: TextView
    private lateinit var tvProfilUniversity: TextView
    private lateinit var tvSejarahUniversity: TextView
    private lateinit var tvJudulUniversity: TextView
    private lateinit var btnRegisterNow: Button
    private lateinit var btnShare: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val university = intent.extras?.getParcelable<University>(MainActivity.UNIVERSITY)

        supportActionBar?.title = university?.name

        imgPicUniversity = findViewById(R.id.img_university_picture)
        tvAlamatUniversity = findViewById(R.id.tv_lokasi)
        tvTipeUniversity = findViewById(R.id.tv_tipe_value)
        tvStatusUniversity = findViewById(R.id.tv_status_value)
        tvProfilUniversity = findViewById(R.id.tv_detail_profile)
        tvSejarahUniversity = findViewById(R.id.tv_detail_sejarah)
        tvJudulUniversity = findViewById(R.id.tv_title)
        btnRegisterNow = findViewById(R.id.btn_register)
        btnShare = findViewById(R.id.action_share)

       university?.apply {
           imgPicUniversity.setImageResource(picture)
           tvJudulUniversity.text = name
           tvAlamatUniversity.text = alamat
           tvTipeUniversity.text = tipe
           tvStatusUniversity.text = status
           tvProfilUniversity.text = profil
           tvSejarahUniversity.text = sejarah
       }

        btnRegisterNow.setOnClickListener {
            Toast.makeText(this, "Register Now " + university?.name, Toast.LENGTH_SHORT).show()
        }

        btnShare.setOnClickListener {
            Toast.makeText(this, "Share " + university?.name, Toast.LENGTH_SHORT).show()
        }
    }
}

