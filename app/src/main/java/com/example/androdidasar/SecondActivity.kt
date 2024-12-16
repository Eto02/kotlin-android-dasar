package com.example.androdidasar

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androdidasar.fragment.FirstFragment

class SecondActivity : AppCompatActivity() {
    private val dataString: String ="Data dari second Activity"
    @SuppressLint("CommitTransaction")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val transaction= supportFragmentManager.beginTransaction()
        val firstFragment = FirstFragment.newInstance(dataString)
        transaction.replace(R.id.fragment_container, firstFragment)
        transaction.commit()


//        val textView: TextView = findViewById(R.id.text_view)
//        if(intent.hasExtra("text")){
//            textView.text = intent.getStringExtra("text")
//        }else{
//            Toast.makeText(applicationContext,"Tidak ada intent", Toast.LENGTH_SHORT).show()
//        }
    }
}