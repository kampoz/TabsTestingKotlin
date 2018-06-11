package com.example.programmer.tabstestingkotlin

import android.support.v7.app.AppCompatActivity
import junit.framework.Assert.assertTrue
import org.junit.Test
import android.support.v4.app.Fragment
import junit.framework.Assert.assertEquals
/**
 * Created by Kamil on 2018-06-11.
 */
class SectionPageAdapterTest {

    val adapter  = SectionPageAdapter(AppCompatActivity().supportFragmentManager)

    @Test
    fun testsWork() {
        assertTrue(true)
    }

    @Test
    fun testGetItem(){

    }

    @Test
    fun testsGetCount() {
        adapter.addFragment(Tab1Fragment(), "Tab1")
        adapter.addFragment(Tab2Fragment(), "Tab2")
        adapter.addFragment(Tab1Fragment(), "Tab3")
        assertEquals(3, adapter.count)
        adapter.addFragment(Tab1Fragment(), "Tab1")
        assertEquals(4, adapter.count)
        adapter.addFragment(Tab1Fragment(), "Tab1")
        assertEquals(5, adapter.count)


    }
}