package com.example.myproject1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myproject1.databinding.ActivityMainBinding
import com.example.myproject1.fragments.CategoryFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bottomNavView.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.homeFragment -> {

                }
                R.id.categoryFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main, CategoryFragment())
                        .addToBackStack(null)
                        .commit()
                }
            }
        }
    }
}