package com.example.dialogfragment

import android.os.Bundle
import android.widget.AdapterView.OnItemLongClickListener
import android.widget.ListView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class Main2Activity : AppCompatActivity() {
    var listm: ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        listm = findViewById(R.id.list)
        Cacth()
    }

    private fun Cacth() {
        listm!!.onItemLongClickListener = OnItemLongClickListener { parent, view, position, id ->
            val builder =
                AlertDialog.Builder(this@Main2Activity)
            true
        }
    }
}