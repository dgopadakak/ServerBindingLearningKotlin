package com.dgopadakak.serverbindinglearningkotlin

import android.app.Service
import android.content.Intent
import android.os.IBinder

class MyService : Service() {
    override fun onBind(intent: Intent?): IBinder = object : ICalculator.Stub() {
        override fun add(a: Int, b: Int): Int {
            return a + b
        }
    }
}