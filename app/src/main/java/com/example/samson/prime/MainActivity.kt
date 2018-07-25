package com.example.samson.prime

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.samson.immvrse.news_feed.PrimeAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    private var primeNumbers = ArrayList<Int>()
    private var primeNumber: Int = 2
    private lateinit var adapter: PrimeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.layoutManager = LinearLayoutManager(this)

        adapter = PrimeAdapter(primeNumbers, this)
        recycler_view.adapter = adapter

        button.setOnClickListener { primeNumbers.add(nextPrime(primeNumber))
        adapter.notifyDataSetChanged()}
    }

    private fun nextPrime(number: Int) : Int {
        primeNumber = number
        primeNumber++
        return if (isPrime(this.primeNumber)) return this.primeNumber
        else {
            nextPrime(this.primeNumber)
        }
    }


    private fun isPrime(int: Int): Boolean {
        return (2..int / 2).none { int % it == 0 }
    }
}


