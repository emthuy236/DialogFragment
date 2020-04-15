package com.example.dialogfragment

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class FragmentDialog : DialogFragment() {
    var deletedata: DeleteData? = null
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        deletedata = activity as DeleteData
        var alertdialog: AlertDialog.Builder = AlertDialog.Builder(activity)
        alertdialog.setTitle("Xác nhận")
        alertdialog.setMessage("Bạn có muốn xóa sản phẩm này ko?")
        alertdialog.setIcon(R.mipmap.ic_launcher)
        alertdialog.setPositiveButton("có"){dialog, which ->
            deletedata!!.GiatriXoa(true)
        }
        alertdialog.setNegativeButton("Không"){dialog, which ->
         deletedata!!.GiatriXoa(false)
        }
        alertdialog.show()
        var dialog: Dialog = alertdialog.create()
        return dialog
        return super.onCreateDialog(savedInstanceState)
    }
}