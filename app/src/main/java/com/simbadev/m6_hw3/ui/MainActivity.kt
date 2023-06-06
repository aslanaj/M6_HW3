package com.simbadev.m6_hw3.ui
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simbadev.m6_hw3.adapter.ViewPagerAdapter
import com.simbadev.m6_hw3.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = ViewPagerAdapter(this)
        binding.viewPager.adapter = adapter

    }
}