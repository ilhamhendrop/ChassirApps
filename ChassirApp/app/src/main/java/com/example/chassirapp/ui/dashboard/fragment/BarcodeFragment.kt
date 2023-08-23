package com.example.chassirapp.ui.dashboard.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.chassirapp.R

class BarcodeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_barcode, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() : BarcodeFragment {
            val fragment = BarcodeFragment()
            val arg = Bundle()
            fragment.arguments = arg
            return fragment
        }
    }
}