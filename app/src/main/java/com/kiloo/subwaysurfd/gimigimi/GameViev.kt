package com.kiloo.subwaysurfd.gimigimi

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.Log
import android.view.MotionEvent
import android.view.View
import com.google.android.material.snackbar.Snackbar
import com.kiloo.subwaysurfd.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class GameViev(
    var cont1: Context,
    var gameTask1111: GameTask,
    val defrrmyCar: Int,
    val enemyLogoListdfefrrf: List<Int>
) : View(cont1) {


    private var rfrfrrrr58 = 8
    private var frfrrrr5def = 0
    private var ppppppppppp1: Paint? = null
    private var myPaintBonusdrfrrr: Paint? = null
    private var myPaintLifeTextfrfrr5: Paint? = null
    private var timeeeeeeeeeeeetiememe = 0
    private var heheheheh = Paint()
    private var edfrrrf5rr5 = 0


    private var ddidididi = 3


    var titititit = System.currentTimeMillis()

    private var cocococ = 0

    private var totototo = ArrayList<HashMap<String, Any>>()
    private var bobobobobo = ArrayList<HashMap<String, Any>>()

    private var vovovovoovi = 0
    private var dfrfrrrr7 = 0
    private var tltltltlt = ""

    var enenenenen = enemyLogoListdfefrrf.random()


    init {
        ppppppppppp1 = Paint()
        heheheheh.color = Color.GREEN
        myPaintBonusdrfrrr = Paint()
        myPaintLifeTextfrfrr5 = Paint()
        myPaintLifeTextfrfrr5!!.textSize = 100f
        myPaintLifeTextfrfrr5!!.alpha = 190
        myPaintLifeTextfrfrr5!!.color = Color.WHITE
    }

    override fun onDraw(canvas: Canvas?) {

        canvas!!.drawText(
            tltltltlt,
            vovovovoovi / 2f - 220f,
            dfrfrrrr7 / 2f,
            myPaintLifeTextfrfrr5!!
        )


        super.onDraw(canvas)

        vovovovoovi = this@GameViev.measuredWidth
        dfrfrrrr7 = this@GameViev.measuredHeight

        var ddddiifrork = System.currentTimeMillis() - titititit

        if (timeeeeeeeeeeeetiememe % 700 < 10 + rfrfrrrr58) {
            val maampamamapam = HashMap<String, Any>()

            maampamamapam["lane"] = (0..2).random()
            maampamamapam["startTime"] = timeeeeeeeeeeeetiememe
            totototo.add(maampamamapam)
        }
        timeeeeeeeeeeeetiememe = timeeeeeeeeeeeetiememe + 10 + rfrfrrrr58
        val ffffffcarvikded = vovovovoovi / 5
        val defrfrcarHeighedefrfgtt = ffffffcarvikded + 10
        ppppppppppp1!!.style = Paint.Style.FILL

        //

        val ggggddddddd = resources.getDrawable(defrrmyCar, null)

//        ggggddddddd.setBounds(
//            edfrrrf5rr5 * vovovovoovi / 3 + vovovovoovi / 15 + 25,
//            dfrfrrrr7 - 40 - defrfrcarHeighedefrfgtt,
//            edfrrrf5rr5 * vovovovoovi / 3 + vovovovoovi / 15 + ffffffcarvikded - 25,
//            dfrfrrrr7 - 2
//        )
        ggggddddddd.setBounds(
            edfrrrf5rr5 * vovovovoovi / 3 + vovovovoovi / 15 + 5,
            dfrfrrrr7 - 120 - defrfrcarHeighedefrfgtt,
            edfrrrf5rr5 * vovovovoovi / 3 + vovovovoovi / 15 + ffffffcarvikded - 25+50+60,
            dfrfrrrr7 - 20
        )
        ggggddddddd.draw(canvas!!)
        ppppppppppp1!!.color = Color.GREEN
        var ccccccccccsoreee = 0

        edferfrrrfrfr(canvas)


        if (ddddiifrork >= 5000) {
            enenenenen = enemyLogoListdfefrrf.random()
            titititit = System.currentTimeMillis()
            rfrfrrrr58 = rfrfrrrr58 + 1 + Math.abs(frfrrrr5def / 8)

            //here bonus about
            val mbmbmbmbmb = HashMap<String, Any>()
            mbmbmbmbmb["lane"] = (0..2).random()
            mbmbmbmbmb["startTime"] = timeeeeeeeeeeeetiememe
            bobobobobo.add(mbmbmbmbmb)
        }


        for (i in totototo.indices) {
            try {
                val edfrgfrgtgt = totototo[i]["lane"] as Int * vovovovoovi / 3 + vovovovoovi / 15
                var frgttt = timeeeeeeeeeeeetiememe - totototo[i]["startTime"] as Int


                val ddedfrkPodfrk = resources.getDrawable(enenenenen, null)

                ddedfrkPodfrk.setBounds(
                    edfrgfrgtgt + 25,
                    frgttt - defrfrcarHeighedefrfgtt,
                    edfrgfrgtgt + ffffffcarvikded,
                    frgttt
                )
                ddedfrkPodfrk.draw(canvas)
                if (totototo[i]["lane"] as Int == edfrrrf5rr5) {
                    if (frgttt > dfrfrrrr7 - 2 - defrfrcarHeighedefrfgtt && frgttt < dfrfrrrr7 - 2) {
                        Log.d("life", "life is ${ddidididi}")

                        when (ddidididi) {
                            0 -> {
                                gameTask1111.clclcllcgimi(frfrrrr5def)
                            }
                            1 -> {
                                gameTask1111.clclcllcgimi(frfrrrr5def)
                            }
                            2 -> {
                                tltltltlt = "1 ♥ left"
                                CoroutineScope(Dispatchers.Main).launch {
                                    delay(800)
                                    tltltltlt = ""
                                }
                                heheheheh.color = Color.RED
                                ddidididi--
                                totototo.clear()
                            }
                            3 -> {
                                heheheheh.color = Color.YELLOW
                                tltltltlt = "2 ♥ left"
                                CoroutineScope(Dispatchers.Main).launch {
                                    delay(800)
                                    tltltltlt = ""
                                }
                                myPaintLifeTextfrfrr5!!.alpha = 200
                                ddidididi--
                                totototo.clear()
                            }
                        }
                    }
                    if (frgttt > dfrfrrrr7 + defrfrcarHeighedefrfgtt) {
                        totototo.removeAt(i)
                        frfrrrr5def++
                        cocococ++

                        if (frfrrrr5def > ccccccccccsoreee) {
                            ccccccccccsoreee = frfrrrr5def
                        }
                    }
                }

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }



        ppppppppppp1!!.color = Color.WHITE
        ppppppppppp1!!.textSize = 40f
        canvas.drawText("Score: $frfrrrr5def", 80f, dfrfrrrr7 - 40f, ppppppppppp1!!)
        canvas.drawText("Speed: $rfrfrrrr58", 380f, dfrfrrrr7 - 40f, ppppppppppp1!!)
        canvas!!.drawRect(
            (vovovovoovi - 200).toFloat(), dfrfrrrr7 - 40f,
            (vovovovoovi - 200 + 60 * ddidididi).toFloat(), dfrfrrrr7 - 80f, heheheheh
        )


        invalidate()
    }

    private fun edferfrrrfrfr(canvas: Canvas): Boolean {
        val ggggggggghj = vovovovoovi / 5
        val kokokok = ggggggggghj + 10
        myPaintBonusdrfrrr!!.style = Paint.Style.FILL

        for (i in bobobobobo.indices) {

            val bbobobofdgjgg = bobobobobo[i]["lane"] as Int * vovovovoovi / 3 + vovovovoovi / 15
            var bbybbyyb = timeeeeeeeeeeeetiememe - bobobobobo[i]["startTime"] as Int

            val bombon = resources.getDrawable(R.drawable.coin, null)
            bombon.setBounds(bbobobofdgjgg + 25, bbybbyyb - kokokok, bbobobofdgjgg + kokokok, bbybbyyb)
            bombon.draw(canvas)

            if (bobobobobo[i]["lane"] as Int == edfrrrf5rr5) {
                if (bbybbyyb > dfrfrrrr7 - 2 - kokokok && bbybbyyb < dfrfrrrr7 - 2) {
                    when (ddidididi) {
                        1 -> {
                            ddidididi++
                            tltltltlt = "2 ♥ left"
                            CoroutineScope(Dispatchers.Main).launch {
                                delay(800)
                                tltltltlt = ""
                            }
                            heheheheh.color = Color.YELLOW
                            bobobobobo.clear()
                            return true
                        }
                        2 -> {
                            ddidididi++
                            tltltltlt = "3 ♥ left"
                            CoroutineScope(Dispatchers.Main).launch {
                                delay(800)
                                tltltltlt = ""
                            }
                            heheheheh.color = Color.GREEN
                            bobobobobo.clear()
                            return true
                        }
                        3 -> {
                            tltltltlt = "MAX health"
                            CoroutineScope(Dispatchers.Main).launch {
                                delay(800)
                                tltltltlt = ""
                            }
                            return true
                        }
                    }
                }
            }
        }
        return true
    }

    private fun eeeeeeeeeeeeeri() {
        Snackbar.make(
            this,
            "Error, error, error...",
            Snackbar.LENGTH_LONG
        ).show()
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        try {
            when (event!!.action) {
                MotionEvent.ACTION_DOWN -> {
                    val x1 = event.x
                    if (x1 < vovovovoovi / 2) {
                        if (edfrrrf5rr5 > 0) {
                            edfrrrf5rr5--
                        }
                    }
                    if (x1 > vovovovoovi / 2) {
                        if (edfrrrf5rr5 < 2) {
                            edfrrrf5rr5++
                        }
                    }
                    invalidate()
                }
                MotionEvent.ACTION_UP -> {

                }
            }
        } catch (e: Exception) {
            eeeeeeeeeeeeeri()
        }

        return true
    }




}

