package com.brainasaservice.deeplinker.deepcustom

import android.content.Context
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module
class Activity2Module {
    @Provides
    fun providesProcessor(context: Context) : Activity2DeeplinkProcessor{
        return Activity2DeeplinkProcessor(context)
    }
}