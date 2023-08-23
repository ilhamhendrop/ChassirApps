package com.example.chassirapp.ui.barang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import com.example.chassirapp.R

class BarangActivity : AppCompatActivity() {
    private lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barang)

        toolbar = findViewById(R.id.tlbBarang)
        setSupportActionBar(toolbar)
        toolbar.title = "Barang"


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.toolbar_barang, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.icSearch -> {

            }
            R.id.icPlus -> {

            }
        }
        return super.onOptionsItemSelected(item)
    }
}