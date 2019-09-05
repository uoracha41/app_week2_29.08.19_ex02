package com.egco428.ex02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_detial.*

class DetialActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detial)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val bundel = intent.extras
        var text1:Int
        var text2:Int
        var result:String = ""

        if(bundel!=null) {
            text1 = bundel.getInt("input1")
            text2 = bundel.getInt("input2")
            result = (text1+text2).toString()
        } else {
            Log.d("Intent","no data")
        }

        ResultText.text = result

        MinusButton.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)

            intent.putExtra("input3",ResultText.text.toString().toInt())
            intent.putExtra("input4",editText3.text.toString().toInt())

            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_detail,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        val id = item!!.getItemId()
        if(id == android.R.id.home){
            finish()
        }

        return super.onOptionsItemSelected(item)
    }
}
