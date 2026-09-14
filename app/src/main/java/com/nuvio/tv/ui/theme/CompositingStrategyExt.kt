package com.nuvio.tv.ui.theme

import androidx.compose.ui.graphics.CompositingStrategy
import com.nuvio.tv.BuildConfig

val NuvioCompositingStrategy: CompositingStrategy
    get() = if (BuildConfig.LITE_MODE) CompositingStrategy.Auto else CompositingStrategy.Offscreen
