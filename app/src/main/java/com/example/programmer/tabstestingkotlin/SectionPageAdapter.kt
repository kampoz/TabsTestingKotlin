package com.example.programmer.tabstestingkotlin

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.app.FragmentManager

/**
 * Created by Kamil on 2018-06-07.
 */
class SectionPageAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm)  {

    val mFragmentList = ArrayList<Fragment>()

    fun addFragment(fragment: Fragment, title: String) {
        mFragmentList.add(fragment)
    }

    override fun getItem(position: Int): Fragment {
        return mFragmentList.get(position)
//        return MovieFragment.newInstance(movies[position])
//        return Fragment.newInstance(mFragmentList[position])
    }

    override fun getCount(): Int {
        return mFragmentList.size
    }


}