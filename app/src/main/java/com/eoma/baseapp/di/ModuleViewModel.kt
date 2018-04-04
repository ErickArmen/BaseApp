package com.eoma.baseapp.di

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.eoma.baseapp.presentation.VMFactory
import com.eoma.baseapp.presentation.ViewModelMain
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


/*
Helps in the construction of ViewModels with constructor, using the ViewModelProvider.Factory (VMFactory)
 */
@Module
interface ModuleViewModel {

    @Binds
    fun bindViewModelFactory(factory: VMFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(ViewModelMain::class)
    fun bindMain(myViewModel: ViewModelMain): ViewModel

    /*
    Other ViewModels
     */
}