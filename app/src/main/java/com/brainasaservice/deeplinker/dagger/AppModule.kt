package com.brainasaservice.deeplinker.dagger

import android.content.Context
import com.brainasaservice.deeplinker.ui.DeeplinkApp
import com.brainasaservice.deeplinker.DefaultDeeplinkHandler
import com.brainasaservice.deeplinker.deepcustom.Activity2DeeplinkProcessor
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(
    private val app: DeeplinkApp
) {
    @Provides
    @Singleton
    fun providesContext(): Context = app

    @Provides
    @Singleton
    fun providesDefaultDeeplinkHandler(processor: Activity2DeeplinkProcessor): DefaultDeeplinkHandler = DefaultDeeplinkHandler(processor)
}
