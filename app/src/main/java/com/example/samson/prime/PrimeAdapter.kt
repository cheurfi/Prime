package com.example.samson.immvrse.news_feed

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.samson.prime.R
import kotlinx.android.synthetic.main.prime_item.view.*

class PrimeAdapter(private val numbers: IntArray, private val context: Context) : RecyclerView.Adapter<PrimeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(LayoutInflater.from(context).inflate(R.layout.prime_item, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.prime.text = (numbers[position]).toString()
    }

    override fun getItemCount() = numbers.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val prime = view.prime
    }
}
