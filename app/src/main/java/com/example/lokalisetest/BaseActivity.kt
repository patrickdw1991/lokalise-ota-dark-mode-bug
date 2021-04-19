package com.example.lokalisetest

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.lokalise.sdk.LokaliseContextWrapper


abstract class BaseActivity : AppCompatActivity() {
    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(LokaliseContextWrapper.wrap(newBase))
    }
}