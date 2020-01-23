package com.brainasaservice.deeplinker.dagger

import com.brainasaservice.deeplinker.DefaultDeeplinkHandler
import com.brainasaservice.deeplinker.deepcustom.Activity2Module
import com.brainasaservice.deeplinker.deeplink.MyDeeplinkActivity
import com.brainasaservice.deeplinker.ui.DeeplinkApp
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        Activity2Module::class
    ]
)

interface AppComponent {
    fun inject(app: DeeplinkApp)

    fun inject(deeplinkActivity: MyDeeplinkActivity)

    fun deeplinkHandler(): DefaultDeeplinkHandler
}
