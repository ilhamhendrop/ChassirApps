package com.example.chassirapp.ui.dashboard.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.chassirapp.R

class DashboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() : DashboardFragment {
            val fragment = DashboardFragment()
            var arg = Bundle()
            fragment.arguments = arg
            return fragment
        }
    }
}