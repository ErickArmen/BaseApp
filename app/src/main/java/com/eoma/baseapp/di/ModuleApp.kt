package com.eoma.baseapp.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/*
Dependencies that has singleton scope (app purpose)
 */

const val nameSharedPreferences = "mySharedPrefs"

@Module
class ModuleApp {

    @Singleton
    @Provides
    fun providesSharedPreferences(application: Application): SharedPreferences =
        application.getSharedPreferences(nameSharedPreferences, Context.MODE_PRIVATE)

}