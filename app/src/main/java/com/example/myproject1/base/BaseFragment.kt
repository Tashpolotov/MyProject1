package com.example.myproject1.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding


abstract class BaseFragment<VB: ViewBinding>: Fragment() {

    protected lateinit var binding: VB

    abstract fun initListener()
    abstract fun initView()
    abstract fun initDe()
    abstract fun inflateViewBinding(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): VB

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = inflateViewBinding(inflater,container,savedInstanceState)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initListener()
        initDe()
    }


}