package com.akshay.sampledialogorientationcheck

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_foo.view.*

/**
 * Created by akshaynandwana on
 * 02, July, 2020
 **/
class ProfileProgressFragment : Fragment() {

    companion object {
        fun newInstance(): ProfileProgressFragment {
            val profileProgressFragment = ProfileProgressFragment()
            return profileProgressFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_foo, container, false)
        view.clickMe.setOnClickListener {
            val obj = activity as MainActivity
            obj.showPictureEditDialog()
        }
        return view
    }
}