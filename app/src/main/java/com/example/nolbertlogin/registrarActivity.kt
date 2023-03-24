package com.example.nolbertlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.lang.ref.PhantomReference
import kotlin.coroutines.jvm.internal.CompletedContinuation.context



class registrarActivity : AppCompatActivity() {

    private lateinit var textName:EditText
    private lateinit var textLastName:EditText
    private lateinit var textEmail:EditText
    private lateinit var textPassword:EditText
    private lateinit var textProgressBar:EditText
    private lateinit var dbReference:DatabaseReference
    private lateinit var database:FirebaseDatabase
    private lateinit var auth:FirebaseAuth


    private fun ProgressBar(): Any {
        TODO("Not yet implemented")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)
        textName=findViewById(R.id.txtname)
        textLastName=findViewById(R.id.txtLastname)
        textEmail=findViewById(R.id.textEmail)
        textPassword=findViewById(R.id.textPassword)
        textName=findViewById(R.id.txtname)

      }