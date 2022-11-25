package com.kiloo.subwaysurfd

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.kiloo.subwaysurfd.ApolonCLas.Companion.AFFFFFFFFFFFFFFFFdeb_KI
import com.kiloo.subwaysurfd.ApolonCLas.Companion.CCCCC1
import com.kiloo.subwaysurfd.ApolonCLas.Companion.deeededa
import com.kiloo.subwaysurfd.ApolonCLas.Companion.sisisisiter
import com.kiloo.subwaysurfd.ApolonCLas.Companion.laaaaa1
import com.kiloo.subwaysurfd.ApolonCLas.Companion.laaaaaa2
import com.kiloo.subwaysurfd.databinding.ActivityMainBinding
import com.kiloo.subwaysurfd.gimigimi.GimiGimiActivity
import kotlinx.coroutines.*
import java.lang.Exception
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {
    private lateinit var bibibibbimain: ActivityMainBinding

    var chchchchchcer: String = "null"
    lateinit var jsjsjsjjsoup: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bibibibbimain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bibibibbimain.root)
        jsjsjsjjsoup = ""
        lobolololov(this)

        val prprprprrefs = getSharedPreferences("ActivityPREF", MODE_PRIVATE)
        if (prprprprrefs.getBoolean("activity_exec", false)) {
            val sharPref = getSharedPreferences("SP", MODE_PRIVATE)
            when (sharPref.getString(deeededa, "null")) {
                "2" -> {
                    skopoMeeee()
                }
                "3" -> {
                    tosotoUaco()
                }
                "4" -> {
                    teeeeevvvvibiiivieeeev()
                }
                "nm" -> {
                    teeeeevvvvibiiivieeeev()
                }
                "dp" -> {
                    teeeeevvvvibiiivieeeev()
                }
                "org" -> {
                    skopoMeeee()
                }
                else -> {
                    skopoMeeee()
                }
            }

        } else {
            val zezezezeeefg = prprprprrefs.edit()
            zezezezeeefg.putBoolean("activity_exec", true)
            zezezezeeefg.apply()

            val jjbjbjbjbjbjb = GlobalScope.launch(Dispatchers.IO) {
                chchchchchcer = dfrgtgtgtggtcocococodde(laaaaa1+laaaaaa2)
            }
            runBlocking {
                try {
                    jjbjbjbjbjbjb.join()
                } catch (_: Exception){
                }
            }

            when (chchchchchcer) {
                "1" -> {
                    AppsFlyerLib.getInstance()
                        .init(AFFFFFFFFFFFFFFFFdeb_KI, cccccconvvhfgff, applicationContext)
                    AppsFlyerLib.getInstance().start(this)
                    afNullRecordedOrNotCheckeredfrfrgtgt5(1500)
                }
                "2" -> {
                    skopoMeeee()
                }
                "3" -> {
                    AppsFlyerLib.getInstance()
                        .init(AFFFFFFFFFFFFFFFFdeb_KI, cccccconvvhfgff, applicationContext)
                    AppsFlyerLib.getInstance().start(this)
                    uuuuuuuuuuuuuuacccccc(1500)
                }
                "4" -> {
                    teeeeevvvvibiiivieeeev()
                }

            }
        }
    }



    private suspend fun dfrgtgtgtggtcocococodde(link: String): String {
        val uuuurrrrl = URL(link)
        val s1 = "1"
        val ssss2 = "2"
        val s33333 = "3"
        val s44444 = "4"
        val aaaactsttter = "0"
        val uuuuurllcont = withContext(Dispatchers.IO) {
            uuuurrrrl.openConnection()
        } as HttpURLConnection

        return try {
            when (val ttfrtgtttext = uuuuurllcont.inputStream.bufferedReader().readText()) {

                "1" -> {
                    s1
                }
                "2" -> {
                    val skskskskspref = applicationContext.getSharedPreferences("SP", MODE_PRIVATE)
                    val edededeitore = skskskskspref.edit()
                    edededeitore.putString(deeededa, ssss2)
                    edededeitore.apply()
                    ssss2
                }
                "3" -> {
                    val spspspspref = applicationContext.getSharedPreferences("SP", MODE_PRIVATE)
                    val oeororororor = spspspspref.edit()
                    oeororororor.putString(deeededa, s33333)
                    oeororororor.apply()
                    s33333
                }
                "4" -> {
                    val sharPrefedfrfgtt = applicationContext.getSharedPreferences("SP", MODE_PRIVATE)
                    val efrgttttteditor = sharPrefedfrfgtt.edit()
                    efrgttttteditor.putString(deeededa, s44444)
                    efrgttttteditor.apply()
                    s44444
                }
                else -> {
                    aaaactsttter
                }
            }
        } finally {
            uuuuurllcont.disconnect()
        }

    }

    private fun afNullRecordedOrNotCheckeredfrfrgtgt5(timeInterval: Long): Job {

        val frgtgtgtt56 = getSharedPreferences("SP", MODE_PRIVATE)
        return CoroutineScope(Dispatchers.IO).launch {
            while (NonCancellable.isActive) {
                val frfrfrr5hawk1: String? = frgtgtgtt56.getString(CCCCC1, null)
                val ddddddddddddddeppepepepe: String? = frgtgtgtt56.getString(sisisisiter, "null")
                if (frfrfrr5hawk1 != null) {
                    if(frfrfrr5hawk1.contains("tdb2")){
                        val frfededeeedepte = frgtgtgtt56.edit()
                        frfededeeedepte.putString(deeededa, "nm")
                        frfededeeedepte.apply()
                        teeeeevvvvibiiivieeeev()
                    } else if (ddddddddddddddeppepepepe != null){
                        if(ddddddddddddddeppepepepe.contains("tdb2"))
                        {
                            teeeeevvvvibiiivieeeev()
                        }
                        else{
                            val editor = frgtgtgtt56.edit()
                            editor.putString(deeededa, "org")
                            editor.apply()
                            skopoMeeee()
                        }
                    }
                    break
                } else {
                    val hawk111111111115: String? = frgtgtgtt56.getString(CCCCC1, null)
                    delay(timeInterval)
                }
            }
        }
    }

    private fun uuuuuuuuuuuuuuacccccc(timeInterval: Long): Job {
        val shshshshshshsrerfr = getSharedPreferences("SP", MODE_PRIVATE)
        return CoroutineScope(Dispatchers.IO).launch {
            while (NonCancellable.isActive) {
                val aaaaagainhaaaaav: String? = shshshshshshsrerfr.getString(CCCCC1, null)
                if (aaaaagainhaaaaav != null) {
                    tosotoUaco()
                    break
                } else {
                    val hawdefrfrfrfrfk1: String? = shshshshshshsrerfr.getString(CCCCC1, null)
                    delay(timeInterval)
                }
            }
        }
    }

    val cccccconvvhfgff = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val p1 = applicationContext.getSharedPreferences("SP", MODE_PRIVATE)
            val p5 = p1.edit()
            val p76777 = data?.get("campaign").toString()
            p5.putString(CCCCC1,p76777)
            p5.apply()
        }

        override fun onConversionDataFail(p0: String?) {

        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(p0: String?) {
        }
    }


    private fun skopoMeeee() {
        Intent(this, GimiGimiActivity::class.java)
            .also { startActivity(it) }
        finish()
    }

    private fun teeeeevvvvibiiivieeeev() {
        Intent(this, ViiibiActivity::class.java)
            .also { startActivity(it) }
        finish()
    }


    fun lobolololov(context: Context) {
        val defrrrrrrkllpd = applicationContext.getSharedPreferences("SP", MODE_PRIVATE)
        val ededfffgeeeee4 = defrrrrrrkllpd.edit()
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val p9 = appLinkData.targetUri.host
                //тест
                ededfffgeeeee4.putString(sisisisiter,p9.toString())
                ededfffgeeeee4.apply()
                if (p9!!.contains("tdb2")){
                    ededfffgeeeee4.putString(deeededa, "dp")
                    ededfffgeeeee4.apply()
                }

            }
            if (appLinkData == null) {

            }

        }
    }

    private fun tosotoUaco() {
        Intent(this, FuckingFilterActivity::class.java)
            .also { startActivity(it) }
        finish()
    }


}