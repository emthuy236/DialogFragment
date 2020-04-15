package com.example.dialogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), DeleteData  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnXoa.setOnClickListener {
            val fragmentdialog: FragmentDialog = FragmentDialog()
            fragmentdialog.show(supportFragmentManager,"dialog")
        }
    }

    override fun GiatriXoa(delete: Boolean) {
          if (delete){
              Toast.makeText(this,"Bạn chọn xóa",Toast.LENGTH_SHORT).show()
          }else{
              Toast.makeText(this,"Không xóa",Toast.LENGTH_SHORT).show()
          }

        super.GiatriXoa(delete)
    }
}
