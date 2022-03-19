package com.demo.test.ui

import com.demo.test.R
import com.demo.test.base.BaseFragment

class Fragment2 : BaseFragment(){
    override fun layoutRes(): Int = R.layout.fragment2
    companion object {
        fun newInstance() = Fragment2()
    }
}