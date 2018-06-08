package com.example.programmer.tabstestingkotlin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Kamil on 2018-06-07.
 */
class Tab2Fragment : Fragment() {

    companion object {

        fun newInstance(): Tab2Fragment {
            return Tab2Fragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_tab_2, container, false)
    }
}

