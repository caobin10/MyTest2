package com.demo.test.ui

import com.demo.test.R
import com.demo.test.base.BaseFragment

class Fragment4 : BaseFragment(){
    override fun layoutRes(): Int = R.layout.fragment4
    companion object {
        fun newInstance() = Fragment4()
    }
}