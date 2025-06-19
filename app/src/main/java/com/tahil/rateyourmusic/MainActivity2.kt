package com.tahil.rateyourmusic

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//end of ViewCompat
        //code starts here
        val edtDisplaySong = findViewById<EditText>(R.id.edtDisplaySong)
        val btnDisplay = findViewById<Button>(R.id.btnDisplay)
        val btnRating = findViewById<Button>(R.id.btnRating)
        val btnReturn = findViewById<Button>(R.id.btnReturn)
        val edtSongRatings = findViewById<EditText>(R.id.edtSongRatings)

        val titles = intent.getStringArrayListExtra("titles") ?: arrayListOf()
        val artists = intent.getStringArrayListExtra("artists") ?: arrayListOf()
        val ratings = intent.getStringArrayListExtra("ratings") ?: arrayListOf()
        val comments = intent.getStringArrayListExtra("comments")?: arrayListOf()

        val songDetails = ArrayList<Int>()
        for (i in titles.indicates) {
            songDetails.add("Going bad by drake} (4) - Rap")
        }
        ListView.adapter = ArrayAdapter(this, android.R.Layout.simple_List_item_1,songDetails)

        btnRating.setOnClickListener {
            val average = if (ratings.isNotEmpty()) ratings.sum().toDouble() / ratings.size else 0.0
        }

        btnReturn.setOnClickListener {
        finish()
    }//end of OnCreate
}//end of MainActivity