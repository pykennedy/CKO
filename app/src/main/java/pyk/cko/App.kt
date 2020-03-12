package pyk.cko

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        // Ensure app always chooses the correct day/night theme
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
    }
}