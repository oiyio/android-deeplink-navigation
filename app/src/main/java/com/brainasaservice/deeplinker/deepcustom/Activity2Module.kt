package com.brainasaservice.deeplinker.deepcustom

import com.brainasaservice.deeplinkprocessor.DeeplinkProcessor
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet

@Module
interface Activity2Module {
    @Binds
    @IntoSet
    fun bindsDeepContentDeeplinkProcessorIntoSet(
        processor: Activity2DeeplinkProcessor
    ): DeeplinkProcessor
}
