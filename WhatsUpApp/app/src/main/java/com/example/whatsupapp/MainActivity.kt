package com.example.whatsupapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
//this is comment
class MainActivity : AppCompatActivity() {

    lateinit var tab: TabLayout
    lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tab = findViewById(R.id.tab)
        viewPager = findViewById(R.id.viewpager)

        viewPager.adapter = MyAdaptor(supportFragmentManager)
        tab.setupWithViewPager(viewPager)
    }
}
class MyAdaptor(fm:FragmentManager) : FragmentStatePagerAdapter(fm){
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0->return ChatsFragment()
            1->return CallsFragment()
            2->return StatusFragment()
            else->return ChatsFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0->return "Chats"
            1->return "Calls"
            2->return "Status"
            else->return "Chats"
        }
    }
}