package com.akshay.sampledialogorientationcheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

private const val TAG_PROFILE_PICTURE_EDIT_DIALOG = "PROFILE_PICTURE_EDIT_DIALOG"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (getProfileProgressFragment() == null) {
            supportFragmentManager.beginTransaction().add(
                    R.id.profile_progress_fragment_placeholder,
                    ProfileProgressFragment.newInstance()
            ).commitNow()
        }
    }

    private fun getProfileProgressFragment(): ProfileProgressFragment? {
        return supportFragmentManager.findFragmentById(
                R.id.profile_progress_fragment_placeholder
        ) as ProfileProgressFragment?
    }

    fun showPictureEditDialog() {
        val previousFragment =
                supportFragmentManager.findFragmentByTag(TAG_PROFILE_PICTURE_EDIT_DIALOG)
        if (previousFragment != null) {
            supportFragmentManager.beginTransaction().remove(previousFragment).commitNow()
        }
        val dialogFragment = ProfilePictureEditDialogFragment.newInstance()
        dialogFragment.showNow(supportFragmentManager, TAG_PROFILE_PICTURE_EDIT_DIALOG)
    }
}
