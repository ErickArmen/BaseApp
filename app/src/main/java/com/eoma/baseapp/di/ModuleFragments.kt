package com.eoma.baseapp.di

import com.eoma.baseapp.presentation.FragmentMain
import dagger.Module
import dagger.android.ContributesAndroidInjector

/*
To inject fragments
 */
@Module
interface ModuleFragments {

    @ContributesAndroidInjector
    fun contributeMainFragment(): FragmentMain
}