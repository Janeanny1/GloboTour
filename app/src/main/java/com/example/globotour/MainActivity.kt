package com.example.globotour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var toolbar        : MaterialToolbar
    private lateinit var navController  : NavController
    private lateinit var bottomNavView  : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) 


        toolbar         = findViewById(R.id.activity_main_toolbar)
        bottomNavView = findViewById(R.id.bottom_nav_view)


        val navHostFrag = supportFragmentManager.findFragmentById(R.id.nav_host_frag) as NavHostFragment
        navController   = navHostFrag.navController


        val topLevelDestinations = setOf(R.id.fragmentCityList, R.id.fragmentFavoriteList)
        val appBarConfiguration = AppBarConfiguration(topLevelDestinations)


        toolbar.setupWithNavController(navController, appBarConfiguration)

        bottomNavView.setupWithNavController(navController)
    }

}