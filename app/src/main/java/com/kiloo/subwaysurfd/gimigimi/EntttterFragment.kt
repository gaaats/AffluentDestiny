package com.kiloo.subwaysurfd.gimigimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.kiloo.subwaysurfd.R
import com.kiloo.subwaysurfd.databinding.FragmentEntttterBinding


class EntttterFragment : Fragment(), GameTask {
    private var bibibib: FragmentEntttterBinding? = null
    private val btb get() = bibibib ?: throw RuntimeException("FragmentStartBinding = null")

    val llllsifir = listOf(
        R.drawable.en21,
        R.drawable.en22,
    )

    private var rfrgttt55fr: GameViev? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bibibib = FragmentEntttterBinding.inflate(inflater, container, false)
        return btb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        try {
            btb.btnStart.setOnClickListener {
                rfrgttt55fr =
                    GameViev(requireContext(), this, R.drawable.jet___, llllsifir)
                rfrgttt55fr!!.setBackgroundResource(R.drawable.back_plane)
                rfrgttt55fr!!.background.alpha = 160
                btb.root.addView(rfrgttt55fr)
                btb.btnStart.visibility = View.GONE
                btb.tvScoreGame1.visibility = View.GONE
                btb.imgLogoGame1.visibility = View.GONE
            }
        } catch (e: Exception) {
            eepepepep()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        bibibib = null
        super.onDestroy()
    }

    override fun clclcllcgimi(score: Int) {
        val scscscr = "Score : $score"
        btb.root.removeView(rfrgttt55fr)
        btb.tvScoreGame1.text = scscscr
        btb.btnStart.visibility = View.VISIBLE
        btb.tvScoreGame1.visibility = View.VISIBLE
        btb.imgLogoGame1.visibility = View.VISIBLE
        rfrgttt55fr = null

        findNavController().navigate(R.id.action_entttterFragment_to_enddddddFragment)
    }

    private fun eepepepep() {
        Snackbar.make(
            btb.root,
            "Oops error, please try again...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

}