package com.humanroman.customizeit.di

import com.humanroman.customizeit.ui.home.HomeViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module



val appModule = module {

    //Repositories:
    //TODO

    //View models:
    viewModelOf (::HomeViewModel)

}

val networkModule = module {

}