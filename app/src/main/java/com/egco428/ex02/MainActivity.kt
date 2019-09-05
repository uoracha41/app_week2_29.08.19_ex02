package com.egco428.ex02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AddButton.setOnClickListener {
            var intent = Intent(this, DetialActivity::class.java)

            intent.putExtra("input1",editText.text.toString().toInt())
            intent.putExtra("input2",editText2.text.toString().toInt())

            startActivity(intent)
        }
        Log.d(TAG,"onCreate")

        val bundel = intent.extras

        var text3:Int
        var text4:Int
        var result:String = ""

        if(bundel!=null) {
            text3 = bundel.getInt("input3")
            text4 = bundel.getInt("input4")
            result = (text3-text4).toString()
        } else {
            Log.d("Intent","no data")
        }

        ResultMinus.text = result
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy")
    }
}

