package com.s95ammar.sharedpreferencesdemo.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.s95ammar.sharedpreferencesdemo.R

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_save).setOnClickListener {
            viewModel.addString("MY_KEY", findViewById<EditText>(R.id.editText).text.toString())
        }

        viewModel.string.observe(this) { value ->
            findViewById<TextView>(R.id.value_text_view).text = value
        }

        viewModel.loadString("MY_KEY", "No value found")
    }

}