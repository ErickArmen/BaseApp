package com.eoma.baseapp.di

import com.eoma.baseapp.presentation.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/*
To inject activities
 */
@Module
interface ModuleActivities {

    @ContributesAndroidInjector(modules = arrayOf(ModuleFragments::class))
    fun contributeMainActivity(): MainActivity
}