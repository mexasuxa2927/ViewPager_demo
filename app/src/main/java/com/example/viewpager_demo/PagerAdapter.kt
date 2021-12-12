package com.example.viewpager_demo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class PagerAdapter(fm :FragmentManager,val numberofFragment:Int):FragmentStatePagerAdapter(fm) {
    override fun getCount(): Int {
        return numberofFragment

    }

    override fun getItem(position: Int): Fragment {
        when (position){
            0->return Frag1()
            1->return Frag2()
        }
       return Frag1()
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0->return "FRAG1"
            1->return "FRAG2"
        }

        return super.getPageTitle(position)
    }
}