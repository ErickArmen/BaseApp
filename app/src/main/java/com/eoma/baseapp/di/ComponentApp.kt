package com.eoma.baseapp.di

import android.app.Application
import com.eoma.baseapp.MyApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/*
Component build in this way to let moduleapp without constructor.
AndroidInjectionModule ensure the usability of dagger.android framework classes
 */
@Singleton
@Component(modules = arrayOf(AndroidInjectionModule::class, ModuleApp::class, ModuleActivities::class,
        ModuleFragments::class))

interface ComponentApp {

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): ComponentApp
    }

    fun inject(myApplication: MyApplication)
}