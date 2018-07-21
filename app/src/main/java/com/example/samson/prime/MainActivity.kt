package com.example.samson.prime

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.samson.immvrse.news_feed.PrimeAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    lateinit var primeNumbers: IntArray

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        populateNumbers()

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = PrimeAdapter(primeNumbers, this)

        button.setOnClickListener { calculateNextPrime() }
    }


    private fun populateNumbers() {
        var i = 0
        primeNumbers = IntArray(2000)
        (2..100)
                .filter { isPrime(it) }
                .forEach {
                    primeNumbers[i] = it
                    i++
                }
        primeNumbers[0] = 2
        primeNumbers[1] = 3
    }

    private fun isPrime(int: Int): Boolean {
        return (2..int / 2).none { int % it == 0 }
    }
}


