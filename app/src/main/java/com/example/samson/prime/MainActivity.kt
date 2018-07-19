package com.example.samson.prime

import android.app.Activity
import android.databinding.ObservableInt
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    lateinit var nextPrime: ObservableInt

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener { calculateNextPrime() }
    }

    private fun calculateNextPrime() {
        (2..1000)
                .filter { isPrime(it) }
                .forEach { nextPrime.set(it)}
    }

    private fun isPrime(int:Int): Boolean {
        if(int%)
        return false
    }
}
