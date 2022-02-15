package com.moecxi.terreuas

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView


class PRIVAVI : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(1024)
        setContent {
           Woope(url = pp.Darika("aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49QXR4OFZmSFhGdDRNbU1NVlpYbmp5MEtIMDR4WFV0Vmo="))
        }
    }


    @Composable
    fun Woope(url: String) {
        AndroidView(factory = {
            WebView(this).apply {
                webViewClient = WebViewClient()
                loadUrl(url)
            }
        })
    }
}

