package ie.wit.assignment1

import android.app.Application

class MainApp : Application() {
    val list = mutableListOf<OutfitModel>()
    override fun onCreate() {
        super.onCreate()
    }
}