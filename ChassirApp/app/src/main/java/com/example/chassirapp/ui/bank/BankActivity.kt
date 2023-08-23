package com.example.chassirapp.ui.bank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import com.example.chassirapp.R

class BankActivity : AppCompatActivity() {
    private lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bank)

        toolbar = findViewById(R.id.tbBank)
        setSupportActionBar(toolbar)
        toolbar.title = "Bank"

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.toolbar_bank, menu)
        return super.onCreateOptionsMenu(menu)
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