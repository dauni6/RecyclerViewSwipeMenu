package com.example.recyclerviewswipemenu

import android.content.Context
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    fun getActivityBaseContext(): Context {
        return applicationContext
    }

}