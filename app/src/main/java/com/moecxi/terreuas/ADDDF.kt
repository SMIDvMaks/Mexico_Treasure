package com.moecxi.terreuas

import android.content.Context
import android.provider.Settings
import android.util.Base64
import androidx.appcompat.app.AppCompatActivity
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*
var apurqs:String? = null
var yhqbs:String? = null
var rupers:String? = null
var apsqstt:String? = null

@DelicateCoroutinesApi
class ADDDF:AppCompatActivity() {
    fun standede(urqs: Context){
        GlobalScope.launch {
            val qqqw: AdvertisingIdClient.Info = AdvertisingIdClient.getAdvertisingIdInfo(urqs)
            yhqbs = qqqw.id
        }
    }
    fun OPQSA(krumbe: Context){
        val yguus = object : AppsFlyerConversionListener {
            override fun onConversionDataSuccess(pepkaooq: MutableMap<String, Any>?) {
                for (jqj in pepkaooq!!.keys)
                    apurqs =
                        Objects.requireNonNull(pepkaooq[ERQ("YWZfc3RhdHVz")]).toString()
                if (apurqs == ERQ("Tm9uLW9yZ2FuaWM=")) {
                    val kranh = Objects.requireNonNull(pepkaooq[ERQ("Y2FtcGFpZ24=")]).toString()
                    rupers = pp.PAPAMIQS(kranh)
                }
            }
            override fun onConversionDataFail(p0: String?) {}
            override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
            override fun onAttributionFailure(p0: String?) {}

        }
        apsqstt = AppsFlyerLib.getInstance().getAppsFlyerUID(krumbe)
        AppsFlyerLib.getInstance().run {
            init(ERQ(devasetf), yguus, krumbe)
            start(krumbe)
        }
    }
    fun ERQ(yetq: String): String {
        val iqi = String(Base64.decode(yetq, Base64.DEFAULT))
        return iqi
    }
    fun DELAQ(pppq: Context):Int{
        val poqa:Int = Settings.Secure.getInt(pppq.contentResolver,
        Settings.Global.DEVELOPMENT_SETTINGS_ENABLED,0)
        return poqa
    }
}