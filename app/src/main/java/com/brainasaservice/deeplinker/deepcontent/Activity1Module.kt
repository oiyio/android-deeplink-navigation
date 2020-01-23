package com.brainasaservice.deeplinker.deepcontent

import com.brainasaservice.deeplinkprocessor.DeeplinkProcessor
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet

@Module
interface Activity1Module {
    @Binds
    @IntoSet
    fun bindsDeepContentDeeplinkProcessorIntoSet(processor: Activity1DeeplinkProcessor)
            : DeeplinkProcessor
}
