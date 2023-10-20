package com.srhan.mealsapp.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.srhan.mealsapp.adapter.MealsAdapter
import com.srhan.mealsapp.databinding.ActivityMainBinding
import com.srhan.mealsapp.viewmodel.MealsViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MealsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel.getMeals()
        lifecycleScope.launch {
            viewModel.categories.collect {
                if (it != null) {

                    binding.categoryRrv.adapter = MealsAdapter(it.categories)
                }
            }

        }

    }
}