package com.kiloo.subwaysurfd.gimigimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import com.kiloo.subwaysurfd.databinding.FragmentEnddddddBinding

class EnddddddFragment : Fragment() {
    private var dfrgttgtt: FragmentEnddddddBinding? = null
    private val bindingfrgftrgtt5 get() = dfrgttgtt ?: throw RuntimeException("FragmentStartBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dfrgttgtt = FragmentEnddddddBinding.inflate(inflater, container, false)
        return bindingfrgftrgtt5.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            bindingfrgftrgtt5.btnExit.setOnClickListener {
                alerldleflrl()
            }
            bindingfrgftrgtt5.btnTryAgain.setOnClickListener {
                requireActivity().onBackPressed()
            }

        } catch (e: Exception){
            efrfrgtgttg5()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        dfrgttgtt = null
        super.onDestroy()
    }

    private fun efrfrgtgttg5() {
        Snackbar.make(
            bindingfrgftrgtt5.root,
            "Oops something bad, please try again...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private fun alerldleflrl() {
        AlertDialog.Builder(requireContext())
            .setTitle("CLOSE")
            .setMessage("Data will not be saved, CLOSE?")
            .setPositiveButton("Yes, CLOSE") { _, _ ->
                requireActivity().onBackPressed()
            }
            .setNegativeButton("No") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
    }
}