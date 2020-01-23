package com.brainasaservice.deeplinker

import com.brainasaservice.deeplinker.deepcustom.Activity2DeeplinkProcessor

class DefaultDeeplinkHandler constructor( private val processor : Activity2DeeplinkProcessor) {
    fun process(deeplink: String): Boolean {
        if(processor.matches(deeplink)){
            processor.execute(deeplink)
            return true
        }
        return false
    }
}
