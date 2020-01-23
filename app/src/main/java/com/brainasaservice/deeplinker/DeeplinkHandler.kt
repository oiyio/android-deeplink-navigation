package com.brainasaservice.deeplinker

import com.brainasaservice.deeplinker.deepcustom.DeeplinkProcessor

class DeeplinkHandler constructor(private val processor : DeeplinkProcessor) {
    fun process(deeplink: String): Boolean {
        if(processor.matches(deeplink)){
            processor.execute(deeplink)
            return true
        }
        return false
    }
}
