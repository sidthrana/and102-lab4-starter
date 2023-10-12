package com.codepath.articlesearch

import android.app.Application

class ArticleApplication : Application() {
    val db by lazy { AppDatabase.getInstance(this) }

//    override fun onCreate() {
//        super.onCreate()
//        db = AppDatabase.getInstance(this)
//    }
//    companion object {
//        lateinit var db : AppDatabase
//    }
}