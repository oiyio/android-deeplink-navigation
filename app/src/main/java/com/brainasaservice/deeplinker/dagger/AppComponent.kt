package com.brainasaservice.deeplinker.dagger

import com.brainasaservice.deeplinker.deepcustom.Activity2Module
import com.brainasaservice.deeplinker.main.MainActivity
import com.brainasaservice.deeplinker.main.MainModule
import com.brainasaservice.deeplinker.ui.DeeplinkApp
import com.brainasaservice.deeplinkprocessor.DeeplinkActivity
import com.brainasaservice.deeplinkprocessor.DeeplinkHandler
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        MainModule::class,
        Activity2Module::class
    ]
)
interface AppComponent {
    fun inject(app: DeeplinkApp)

    fun inject(app: MainActivity)

    fun inject(deeplinkActivity: DeeplinkActivity)

    fun deeplinkHandler(): DeeplinkHandler
}
