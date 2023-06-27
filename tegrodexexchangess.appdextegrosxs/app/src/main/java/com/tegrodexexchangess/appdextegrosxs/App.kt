package com.tegrodexexchangess.appdextegrosxs

import android.app.Application
import com.yandex.metrica.YandexMetrica

import com.yandex.metrica.YandexMetricaConfig


class App : Application() {
    override fun onCreate() {
        super.onCreate()

        val config =
            YandexMetricaConfig.newConfigBuilder("658a25e2-442c-4b24-8096-ce60f79431e8").build()
        YandexMetrica.activate(applicationContext, config)
        YandexMetrica.enableActivityAutoTracking(this)
    }
}