package com.example.recyclerviewswipemenu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewswipemenu.databinding.ItemSwipeBinding
import com.google.android.material.snackbar.Snackbar

class SwipeListAdapter : RecyclerView.Adapter<SwipeListAdapter.SwipeViewHolder>() {
    private val items = mutableListOf<String>().apply {
        for (i in 0..10)
            add("$i")
    }

    override fun getItemCount(): Int = items.size

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }
//    SwipeVieHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_swipe, parent, false))
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SwipeViewHolder =
        SwipeViewHolder(ItemSwipeBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: SwipeViewHolder, position: Int) {
        holder.bind(items[position])
    }


    class SwipeViewHolder(private val binding: ItemSwipeBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(label: String) {
            binding.label = label
            binding.tvTask.setOnClickListener {
                Snackbar.make(it, "$label click", Snackbar.LENGTH_SHORT).show()
            }
        }
    }

}
