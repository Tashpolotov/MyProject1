package com.example.myproject1.fragments.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myproject1.databinding.ItemClinicBinding
import com.example.myproject1.databinding.ItemDoctorsInfoBinding
import com.example.myproject1.databinding.ItemHomeBinding
import com.example.myproject1.model.Article
import com.example.myproject1.model.News

class NewsAdapter(private val data: News) :
    RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(
            ItemHomeBinding.inflate(LayoutInflater.from(parent.context),
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

  class NewsAdapter1(private val data: News) :
    RecyclerView.Adapter<NewsAdapter1.NewsViewHolder1>() {

      override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder1 {
          return NewsViewHolder1(
              ItemDoctorsInfoBinding.inflate(
                  LayoutInflater.from(parent.context),
                  parent,
                  false
              )
          )
      }

      override fun onBindViewHolder(holder: NewsViewHolder1, position: Int) {
          holder.bind(data.articles?.get(position))
      }


      override fun getItemCount(): Int = data.articles?.size ?: 0

      class NewsViewHolder1(private val binding: ItemDoctorsInfoBinding) :
          RecyclerView.ViewHolder(binding.root) {
          fun bind(get: Article?) {

              binding.tvDoctorName.text = get?.title
              binding.tvWorkClinic.text = get?.publishedAt

          }

      }


      class NewsAdapter2(private val data: News) :
          RecyclerView.Adapter<NewsAdapter2.NewsViewHolder2>() {

          override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder2 {
              return NewsViewHolder2(
                  ItemClinicBinding.inflate(
                      LayoutInflater.from(parent.context),
                      parent,
                      false
                  )
              )
          }

          override fun onBindViewHolder(holder: NewsViewHolder2, position: Int) {
              holder.bind(data.articles?.get(position))
          }


          override fun getItemCount(): Int = data.articles?.size ?: 0

          class NewsViewHolder2(private val binding: ItemClinicBinding) :
              RecyclerView.ViewHolder(binding.root) {
              fun bind(get: Article?) {

                  binding.tvClinicName.text = get?.title

              }
          }
      }
  }

