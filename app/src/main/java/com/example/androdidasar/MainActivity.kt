package com.example.androdidasar

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    @SuppressLint("QueryPermissionsNeeded")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btnClick: Button = findViewById(R.id.btn_click)
        val btnClick2: Button = findViewById(R.id.btn_click_2nd)
//        val builder = AlertDialog.Builder(this)

        btnClick.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("text","Ini adalah text dari Activity Pertama")
            startActivity(intent)
        }

        btnClick2.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"))
            val chooser = Intent.createChooser(intent, "Open with")
            startActivity(chooser)
//            Log.i("IntentDebug", "Resolved to: ${resolveInfo}")
//            if (intent.resolveActivity(packageManager)!= null){
//                startActivity(intent)
//            }else{
//                Toast.makeText(applicationContext,"Pakcage Error",Toast.LENGTH_SHORT).show()
//            }

        }

//        btnClick.setOnClickListener {
//            val teks: String = editText.text.toString()
////            Toast.makeText(applicationContext,teks,Toast.LENGTH_SHORT).show()
////            Snackbar.make(mainLayout,teks,Snackbar.LENGTH_SHORT).show()
//            builder.setTitle("My App")
//            builder.setMessage(teks)
//            builder.setPositiveButton("Tutup"){
//                    dialog,which->
//                dialog.dismiss()
//            }
//            val dialog = builder.create()
//            dialog.show()
//        }




    }
}