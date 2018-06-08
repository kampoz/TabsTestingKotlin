package com.example.programmer.tabstestingkotlin

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import java.util.ArrayList
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

/**
 * Created by Kamil on 2018-06-07.
 */

class CustomizeTabsView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyle: Int = 0,
        defStyleRes: Int = 0

) : LinearLayout(context, attrs, defStyle, defStyleRes), View.OnClickListener {
    var callback: MyTabsViewCallback? = null
    var vStripe: View
    var tabsList = mutableListOf<View>()
    var ib0: ImageButton
    var ib1: TextView
    var ib2: ImageButton

    init {
        LayoutInflater.from(context)
                .inflate(R.layout.layout_tabs, this, true)
        orientation = VERTICAL
        ib0 = findViewById(R.id.ib_0)
        ib1 = findViewById(R.id.ib_1)
        ib2 = findViewById(R.id.ib_2)
        ib0.setOnClickListener(this)
        ib1.setOnClickListener(this)
        ib2.setOnClickListener(this)
        tabsList.add(ib0)
        tabsList.add(ib1)
        tabsList.add(ib2)
        vStripe = findViewById(R.id.v_stripe)
    }

    interface MyTabsViewCallback {
        fun showFragmentAtIndex(index: Int)
    }

    fun animateStripeToIndex(index: Int) {
        val animX = ObjectAnimator.ofFloat(vStripe, "x", tabsList.get(index).getX())
        val animSetX = AnimatorSet()
        animSetX.play(animX)
        animSetX.duration = 150
        animSetX.start()
    }

    override fun onClick(v: View?) {
        callback?.showFragmentAtIndex(tabsList.indexOf(v))
        animateStripeToIndex(tabsList.indexOf(v))
        Toast.makeText(context, "Tab "+tabsList.indexOf(v), Toast.LENGTH_SHORT).show()
    }
}