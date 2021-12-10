package com.example.adamstravel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        val btnLgn: Button = findViewById(R.id.btnLogin)
        btnLgn.setOnClickListener(this)
        val btnCrtAcc: TextView = findViewById(R.id.btn_create_acc)
        btnCrtAcc.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnLogin -> startActivity(Intent(this, HomeActivity::class.java))
            R.id.btn_create_acc -> startActivity(Intent(this, Sign::class.java))
        }
        finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
