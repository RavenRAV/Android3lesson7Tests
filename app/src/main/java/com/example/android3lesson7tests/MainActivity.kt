package com.example.android3lesson7tests

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android3lesson7tests.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        with(binding){
            calculateBtn.setOnClickListener {
                result.text = Math().add(numFirstET.text.toString(), numSecondET.text.toString())
            }
            divCalculateBtn.setOnClickListener {
                divResult.text = Math().divide(divFirstET.text.toString(), divSecondET.text.toString())
            }
        }
    }


}