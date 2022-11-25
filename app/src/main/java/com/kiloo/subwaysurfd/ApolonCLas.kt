package com.kiloo.subwaysurfd

import android.app.Application
import android.content.Context
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.onesignal.OneSignal
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ApolonCLas : Application() {
    companion object {

        val l2222 = "destiny.xyz/go.php?to=1&"

        var mainaminamianId: String? = ""
        var CCCCC1: String? = "c11"

        val l11111 = "http://affluent"

        const val AFFFFFFFFFFFFFFFFdeb_KI = "wTS4gcbNxGrst4VR7FNXUC"
        const val jsoupCheckedfrfrr = "1v4b"
        const val mama = "0f9d17ef-7f71-44ba-9238-9bdd38486c42"

        val laaaaa1 = "http://affluent"
        val laaaaaa2 = "destiny.xyz/apps.txt"

        val papapap = "sub_id_1="

        var deeededa: String? = "check"

        var baababba: String? = "c13"
        var sisisisiter: String? = "d11"


    }

    override fun onCreate() {
        super.onCreate()

        GlobalScope.launch(Dispatchers.IO) {
            bbrrrrorther(context = applicationContext)
        }
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(mama)

    }

    class Adv(context: Context) {
        private val frerrfrfrfrfggg4 = AdvertisingIdClient(context.applicationContext)

        suspend fun dfefrrfr5(): String =
            withContext(Dispatchers.IO) {
                frerrfrfrfrfggg4.start()
                val adIdInfo = frerrfrfrfrfggg4.info
                adIdInfo.id
            }
    }

    private suspend fun bbrrrrorther(context: Context) {
        val aaaamomo = Adv(context)
        val aaaabrooo = aaaamomo.dfefrrfr5()

        val prfffrrrriiiendfs = getSharedPreferences("SP", MODE_PRIVATE)
        val eeeeeeedefrf = prfffrrrriiiendfs.edit()

        eeeeeeedefrf.putString(mainaminamianId, aaaabrooo)
        eeeeeeedefrf.apply()
    }

}

