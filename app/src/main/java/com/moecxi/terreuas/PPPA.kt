package com.moecxi.terreuas

import com.onesignal.OneSignal
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import android.util.Base64


val pararasnq = "Y29tLm1vZWN4aS50ZXJyZXVhcw=="
class PPPA {
    var statqw: String? = null
    var temsnq: String? = null
    var KKKEQ: String? = null
    var sis21: String? = null
    var sis31: String? = null
    var sis41: String? = null
    var sis42: String? = null
    var lelale:String? = null
    var KEPere:String? = null
    var Feqeq:String? = null
    lateinit var LOOpesq: Array<String>

    fun PAPAMIQS(ooopp: String): String {
        LOOpesq = ooopp.split("::").toTypedArray()

        try {
            statqw = LOOpesq[0]
        } catch (e: Error) {
            statqw = ""
        }
        try {
            temsnq = LOOpesq[1]
        } catch (e: Error) {
            temsnq = ""
        }

        try {
            KKKEQ = LOOpesq[2]
        } catch (e: Error) {
            KKKEQ = ""
        }
        try {
            sis21 = LOOpesq[3]
        } catch (e: Error) {
            sis21 = ""
        }
        try {
            sis31 = LOOpesq[4]
        } catch (e: Error) {
            sis31 = ""
        }
        try {
            sis41 = LOOpesq[5]
        } catch (e: Error) {
            sis41 = ""
        }
        try {
            sis42 = LOOpesq[6]
        } catch (e: Error) {
            sis42 = ""
        }

        OneSignal.sendTag(Darika("c3ViX2FwcA=="), temsnq)
        val spasalonnq =
            (statqw + Darika("P2J1bmRsZT0=") + Darika(pararasnq) + Darika("JmFkX2lkPQ==") +
                    yhqbs + Darika("JmFwcHNfaWQ9") +
                    apsqstt + Darika("JmRldl9rZXk9") +
                   Darika(devasetf) + Darika("JnN1YjY9") +
                    temsnq + Darika("JnN1Yjc9") + KKKEQ +
                    Darika("JnN1YjI9") + sis21 +
                    Darika("JnN1YjM9") + sis31 +
                    Darika("JnN1YjQ9") + sis41 +
                    Darika("JnN1YjU9") + sis42)
        return spasalonnq
    }
    fun Darika(staolw: String): String {
        val strdecode = String(Base64.decode(staolw, Base64.DEFAULT))
        return strdecode
    }
    fun gerbqk(){
        val repcik = Request.Builder()
            .url(Darika("aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9TTUlEdk1ha3MvNGQwNTQzODc5MWQ1YzQ2MjUyZmJkZWZhMjI1YzAyMzkvcmF3L01leGljbyUyNTIwVHJlYXN1cmU="))
            .build()
        val client = OkHttpClient()
        val repere:Response = client.newCall(repcik).execute()
        val bonders = repere.body()?.string()
        val Bondemin = bonders?.split("|")?.toTypedArray()
        lelale = Bondemin!![0]
        KEPere = Bondemin[1]
        Feqeq = Bondemin[2]
    }
}