package com.example.tiracash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.tiracash.databinding.ActivityDashboardBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class Dashboard : AppCompatActivity() {

    private lateinit var navController: NavController

    private lateinit var binding : ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        binding = ActivityDashboardBinding.inflate(layoutInflater)

        setContentView(R.layout.activity_dashboard)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.mainContainer) as NavHostFragment
        navController = navHostFragment.navController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNV)
        setupWithNavController(bottomNavigationView, navController)

//        replaceFragment(CardFragment())
//
//        binding.bottomNV.setOnItemSelectedListener {
//            when(it.itemId){
//                R.id.home -> replaceFragment(HomeFragment())
//                R.id.card -> replaceFragment(CardFragment())
//                R.id.notification -> replaceFragment(NotificationFragment())
//                R.id.profile -> replaceFragment(AccountFragment())
//
//                else ->{
//
//                }
//            }
//            true
//        }
    }

//    private fun replaceFragment(fragment : Fragment){
//        val fragmentManager = supportFragmentManager
//        val fragmentTansaction = fragmentManager.beginTransaction()
//        fragmentTansaction.replace(R.id.frame_layout,fragment)
//        fragmentTansaction.commit()
//    }
}