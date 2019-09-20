package com.victorromero.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bad_jokes.*

class BadJokesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bad_jokes)

        val username = intent.getStringExtra("username")

        _userNameTextView.text = username ?: "Unknown user. Get out!"
    }
}
