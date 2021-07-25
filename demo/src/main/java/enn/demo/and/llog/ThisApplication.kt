package enn.demo.and.llog

import android.app.Application
import android.content.res.Configuration
import enn.libs.and.llog.LLog

class ThisApplication : Application() {

    override fun onConfigurationChanged(newConfig: Configuration) {
        LLog.v()
        super.onConfigurationChanged(newConfig)
    }

    override fun onLowMemory() {
        LLog.v()
        super.onLowMemory()
    }

    override fun onTrimMemory(level: Int) {
        LLog.v()
        super.onTrimMemory(level)
    }

    override fun onCreate() {
        LLog.v()
        super.onCreate()
    }

    override fun onTerminate() {
        LLog.v()
        super.onTerminate()
    }
}