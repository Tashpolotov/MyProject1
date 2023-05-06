package com.example.myproject1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.myproject1.base.BaseFragment
import com.example.myproject1.databinding.FragmentCategoryBinding
import com.example.myproject1.fragments.adapter.CategoryAdapter1
import com.example.myproject1.fragments.adapter.NewsViewModel
import org.koin.androidx.viewmodel.ext.android.sharedViewModel


class CategoryFragment : BaseFragment<FragmentCategoryBinding>() {

    private val viewModel: NewsViewModel by sharedViewModel()

    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): FragmentCategoryBinding {
        return FragmentCategoryBinding.inflate(inflater, container, false)
    }

    override fun initListener() {
        viewModel.getNews("USA")
        viewModel.serviceNews.observe(viewLifecycleOwner) {
            val adapter = CategoryAdapter1(it)
            binding.rvClinicCategory.adapter = adapter

            binding.tvClinic.text = it.articles?.get(0)?.title
        }
    }


    override fun initView() {
        viewModel.getNews("USA")
        viewModel.serviceNews.observe(viewLifecycleOwner) {
            val adapter = CategoryAdapter1(it)
            binding.rvDoctorsSpecsCategory.adapter = adapter

            binding.tvClinic.text = it.articles?.get(0)?.title
        }
    }

    override fun initDe() {
        viewModel.getNews("USA")
        viewModel.serviceNews.observe(viewLifecycleOwner) {
            val adapter = CategoryAdapter1(it)
            binding.rvClinicServices.adapter = adapter

            binding.tvClinic.text = it.articles?.get(0)?.title
        }
    }
}