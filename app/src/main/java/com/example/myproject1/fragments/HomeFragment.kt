package com.example.myproject1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.myproject1.base.BaseFragment
import com.example.myproject1.databinding.FragmentHomeBinding
import com.example.myproject1.fragments.adapter.NewsViewModel
import com.example.myproject1.fragments.adapter.NewsAdapter
import com.example.myproject1.fragments.adapter.NewsAdapter1
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    private val viewModel: NewsViewModel by sharedViewModel()

    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater, container, false)
    }


    override fun initListener() {
        viewModel.getNews("USA")
        viewModel.serviceNews.observe(viewLifecycleOwner) {
            val adapter = NewsAdapter1(it)
            binding.rvDoctorsInfo.adapter = adapter
            binding.tvName.text = it.articles?.get(0)?.title
        }
    }

    override fun initView() {
        viewModel.getNews("USA")
        viewModel.serviceNews.observe(viewLifecycleOwner) {
            val adapter = NewsAdapter(it)
            binding.rvDoctorsSpecs.adapter = adapter

            binding.tvName.text = it.articles?.get(0)?.title
        }
    }

    override fun initDe() {
        viewModel.getNews("USA")
        viewModel.serviceNews.observe(viewLifecycleOwner) {
            val adapter = NewsAdapter1.NewsAdapter2(it)
            binding.rvClinic.adapter = adapter
            binding.tvName.text = it.articles?.get(0)?.title
        }
    }
}
