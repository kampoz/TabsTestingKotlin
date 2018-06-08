package com.example.programmer.tabstestingkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.R.attr.fragment
import android.support.v4.view.ViewPager


class MainActivity : AppCompatActivity(), CustomizeTabsView.MyTabsViewCallback {

    private lateinit var mViewPager: ViewPager
    private var customizeTabsView: CustomizeTabsView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        customizeTabsView = findViewById(R.id.mtv_tabs) as CustomizeTabsView
        customizeTabsView?.callback = this

        mViewPager = findViewById(R.id.vp_fragments)
        mViewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(position: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                customizeTabsView?.animateStripeToIndex(position)

            }
            override fun onPageSelected(position: Int) {
            }
        })

        setUpViewPager(mViewPager)
    }

    private fun setUpViewPager(viewPager: ViewPager) {
        val adapter = SectionPageAdapter(supportFragmentManager)
        adapter.addFragment(Tab1Fragment(), "Tab1")
        adapter.addFragment(Tab2Fragment(), "Tab2")
        adapter.addFragment(Tab1Fragment(), "Tab3")
        viewPager.adapter = adapter
    }

    override fun showFragmentAtIndex(index : Int) {
        mViewPager.setCurrentItem(index, true)
    }
}


