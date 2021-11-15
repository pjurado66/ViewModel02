package com.pjurado.viewmodel02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pjurado.viewmodel02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .add(R.id.container_a, FragmentA())
            .add(R.id.container_b, FragmentB())
            .commit()
    }
}