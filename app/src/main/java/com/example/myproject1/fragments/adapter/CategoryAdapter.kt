package com.example.myproject1.fragments.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myproject1.databinding.ItemClinicBinding
import com.example.myproject1.databinding.ItemHomeBinding
import com.example.myproject1.model.Article
import com.example.myproject1.model.News


class CategoryAdapter(private val data: News) :
    RecyclerView.Adapter<CategoryAdapter.NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(
            ItemClinicBinding.inflate(
                LayoutInflater.from(parent.context),
            parent,
            false))
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(data.articles?.get(position))
    }



    override fun getItemCount(): Int = data.articles?.size ?: 0

    class NewsViewHolder(private val binding: ItemClinicBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(get: Article?) {

            binding.tvClinicName.text = get?.publishedAt

        }

    }

}

class CategoryAdapter1(private val data: News) :
    RecyclerView.Adapter<CategoryAdapter1.NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(
            ItemHomeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false))
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(data.articles?.get(position))
    }



    override fun getItemCount(): Int = data.articles?.size ?: 0

    class NewsViewHolder(private val binding: ItemHomeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(get: Article?) {

            binding.tvDoctorSpecs.text = get?.publishedAt

        }

    }

}