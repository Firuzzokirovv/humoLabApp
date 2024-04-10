package com.firuz.humolabapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.firuz.second.second_activity

class MainActivity : AppCompatActivity() {
    private var buttonNewActivity: Button? = null
    private var editTextView1: EditText? = null
    private var editTextView2: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act3)

        buttonNewActivity = findViewById<Button>(R.id.btn_submit)
        editTextView1 = findViewById<EditText>(R.id.edit_text_1)
        editTextView2 = findViewById<EditText>(R.id.edit_text_2)



    buttonNewActivity?.setOnClickListener {
        val intent = Intent(this, second_activity::class.java)


        if(editTextView1?.text?.isNotEmpty() == true && editTextView2?.text?.isNotEmpty() == true) {

            if(editTextView1?.text?.toString() == editTextView2?.text?.toString()) {
                startActivity(intent)
            } else {
                Toast.makeText(this, "Пароли не совподают", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this,"Заполняйте поля", Toast.LENGTH_LONG).show()
        }


        }



    }



    }

