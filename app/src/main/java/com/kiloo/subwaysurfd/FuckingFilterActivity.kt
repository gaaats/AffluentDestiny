package com.kiloo.subwaysurfd

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kiloo.subwaysurfd.ApolonCLas.Companion.CCCCC1
import com.kiloo.subwaysurfd.ApolonCLas.Companion.jsoupCheckedfrfrr
import com.kiloo.subwaysurfd.ApolonCLas.Companion.l11111
import com.kiloo.subwaysurfd.ApolonCLas.Companion.l2222
import com.kiloo.subwaysurfd.ApolonCLas.Companion.papapap
import com.kiloo.subwaysurfd.gimigimi.GimiGimiActivity
import kotlinx.coroutines.*
import java.net.HttpURLConnection
import java.net.URL

class FuckingFilterActivity : AppCompatActivity() {
    lateinit var jssjsjsjjsjsjs: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fucking_filter)
        jssjsjsjjsjsjs = ""
        val job5698874 = GlobalScope.launch(Dispatchers.IO) {
            jssjsjsjjsjsjs = cortask()
        }

        runBlocking {
            try {
                job5698874.join()

                if (jssjsjsjjsjsjs == jsoupCheckedfrfrr) {
                    Intent(
                        applicationContext,
                        GimiGimiActivity::class.java
                    ).also { startActivity(it) }
                } else {
                    Intent(
                        applicationContext,
                        ViiibiActivity::class.java
                    ).also { startActivity(it) }
                }
                finish()
            } catch (e: Exception) {

            }
        }

    }



    private fun hhkhkhko1(link: String) {
        val dggtgttgt5 = URL(link)
        val urlConnection = dggtgttgt5.openConnection() as HttpURLConnection

        try {
            val tttttiiiiixti = urlConnection.inputStream.bufferedReader().readText()
            if (tttttiiiiixti.isNotEmpty()) {
                jssjsjsjjsjsjs = tttttiiiiixti
            } else {
            }
        } catch (ex: Exception) {

        } finally {
            urlConnection.disconnect()
        }
    }

    private suspend fun cortask(): String {
        val sp1111 = getSharedPreferences("SP", MODE_PRIVATE)
        val hv11111: String? = sp1111.getString(CCCCC1, "null")
        val fjm =
            "${l11111}${l2222}${papapap}$hv11111"

        withContext(Dispatchers.IO) {
            hhkhkhko1(fjm)
        }
        return jssjsjsjjsjsjs
    }
}