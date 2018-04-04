package com.eoma.baseapp

import android.app.Activity
import android.app.Application
import com.eoma.baseapp.di.DaggerComponentApp
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class MyApplication: Application(), HasActivityInjector {

    @Inject lateinit var dispatchingActivityInjector : DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        DaggerComponentApp.builder().application(this).build().inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingActivityInjector

}