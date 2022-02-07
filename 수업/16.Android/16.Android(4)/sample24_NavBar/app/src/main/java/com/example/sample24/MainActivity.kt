package com.example.sample24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FragmentOne()
        val secondFragment = FragmentTwo()
        val thirdFragment = FragmentThree()

        setCurrentFragment(firstFragment)

        bottomNaviView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.person->setCurrentFragment(firstFragment)
                R.id.home->setCurrentFragment(secondFragment)
                R.id.setting->setCurrentFragment(thirdFragment)
            }
            true
        }
    }

    fun setCurrentFragment(fragment:Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            commit()
        }

}