package com.example.nakataryo.mysize

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_height.*

class HeightActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_height)


        spinner.onItemSelectedListener =
                object : AdapterView.OnItemSelectedListener {
                    override
                fun onItemSelected(parent: AdapterView<*>?,
                                   view: View?,
                                   position: Int,
                                   id: Long) {
                        val spinner = parent as? Spinner
                        val item = spinner?.selectedItem as? String
                        item?.let {
                            if (it.isNotEmpty()) height.text = it
                        }
                    }

                    override fun onNothingSelected(parent: AdapterView<*>?) {

                    }
                }
    }
}
