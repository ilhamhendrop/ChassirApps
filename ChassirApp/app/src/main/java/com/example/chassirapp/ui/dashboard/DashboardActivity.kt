package com.example.chassirapp.ui.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.example.chassirapp.R
import com.example.chassirapp.ui.dashboard.fragment.BarcodeFragment
import com.example.chassirapp.ui.dashboard.fragment.DashboardFragment
import com.example.chassirapp.ui.dashboard.fragment.HistoryFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class DashboardActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {
    private lateinit var content: FrameLayout
    private lateinit var navigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        navigation = findViewById(R.id.btmNavigation)
        content = findViewById(R.id.flContent)

        navigation.setOnItemSelectedListener (this)

        val fragment = DashboardFragment.newInstance()
        addFragment(fragment)

    }

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .setCustomAnimations(
                com.google.android.material.R.anim.design_bottom_sheet_slide_in,
                com.google.android.material.R.anim.design_bottom_sheet_slide_out)
            .replace(R.id.flContent, fragment, fragment.javaClass.simpleName)
            .commit()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.navHome -> {
                val fragment = DashboardFragment.newInstance()
                addFragment(fragment)
                return true
            }
            R.id.navBarcode -> {
                val fragment = BarcodeFragment.newInstance()
                addFragment(fragment)
                return true
            }
            R.id.navHistory -> {
                val fragment = HistoryFragment.newInstance()
                addFragment(fragment)
                return true
            }
        }
        return false
    }


}