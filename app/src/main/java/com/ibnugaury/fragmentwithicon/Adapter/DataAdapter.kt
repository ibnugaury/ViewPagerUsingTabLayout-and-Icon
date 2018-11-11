package com.ibnugaury.fragmentwithicon.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.ibnugaury.fragmentwithicon.Fragments.FirstFragment
import com.ibnugaury.fragmentwithicon.Fragments.SecondFragment
import com.ibnugaury.fragmentwithicon.Fragments.ThirdFragment

class DataAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? = when (position) {
        0 -> FirstFragment.newInstance()
        1 -> SecondFragment.newInstance()
        2 -> ThirdFragment.newInstance()
        else -> null
    }

    override fun getPageTitle(position: Int): CharSequence = when (position) {
        0 -> "First"
        1 -> "Second"
        2 -> "Third"
        else -> ""
    }

    override fun getCount(): Int = 3
}