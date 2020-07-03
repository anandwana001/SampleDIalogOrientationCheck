package com.akshay.sampledialogorientationcheck

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class ProfilePictureEditDialogFragment : DialogFragment() {

    companion object {
        fun newInstance(): ProfilePictureEditDialogFragment {
            return ProfilePictureEditDialogFragment()
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val view = View.inflate(
            context,
            R.layout.profile_picture_edit_dialog,
            /* root= */ null
        )

        return AlertDialog
            .Builder((activity as Context))
            .setTitle("profile_progress_edit_dialog_title")
            .setView(view)
            .setNegativeButton("exit") { _, _ ->
                dismiss()
            }
            .create()
    }
}
