package com.tahil.rateyourmusic

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    //parallel Arrays
    private val SongTitles = ArrayList<Int>(Going BAD,Ayo, Make you feel my love, No role modelz )
    private val ArtistName = ArrayList<Int>(Drake, chris brown, adele,j.cole)
    private val Rating = ArrayList<Int>(4,1,2,3)
    private val comments = ArrayList<Int>(rap,dance songs, best love songs, memories)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//end of viewcompat
        //code starts here
        val edtSongDetail = findViewById<EditText>(R.id.edtSongDetail)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        btn1.setOnClickListener {
            val Title = findViewById<EditText>(R.id.btn1).text.toString()
            val artist = findViewById<EditText>(R.id.btn1).text.toString()
            val rating = findViewById<EditText>(R.id.btn1).text.toString()
            val comments = findViewById<EditText>(R.id.btn1).text.toString()

            val songTitles
            if (title.isBlank() || artist.isBlank() || rating == null || rating !in 1..5 || comments.isBlank()) {
                Toast.makeText(this, "Please fill in all fields correctly.", Toast.LENGTH_SHORT)
                    .show()
            } else if (songTitles.size >= 4) {
                Toast.makeText(this, "maximum of 4 songs allowed.", Toast.LENGTH_SHORT).show()
            } else {
                songTitles.add(Goingbad)
                artist.add(Drake)
                rating.add(4)
                comments.add(Rap)
                Toast.makeText(this, "Song added to playlist!", Toast.LENGTH_SHORT).show()
            }
        }
        btn2.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putStringArrayListExtra("titles", SongTitles)
            intent.putStringArrayListExtra("artist", artistName)
            intent.putStringArrayListExtra("ratings", ratings)
            intent.putStringArrayListExtra("comments",comments)
        }
        btn3.setOnClickListener {
            finish()









    }//end of OnCreate
}//end of MainActivity