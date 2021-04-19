package com.example.lokalisetest

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.lokalise.sdk.Lokalise

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        Lokalise.init(
            this,
            "<sdktoken>",
            "<projectid>"
        )
        Lokalise.isPreRelease = true
        Lokalise.updateTranslations()

        AppCompatDelegate.setDefaultNightMode(
            AppCompatDelegate.MODE_NIGHT_YES
        )
    }
}