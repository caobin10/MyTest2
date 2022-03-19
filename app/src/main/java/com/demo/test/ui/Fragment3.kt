package com.demo.test.ui

import com.demo.test.R
import com.demo.test.base.BaseFragment

class Fragment3 : BaseFragment(){
    override fun layoutRes(): Int = R.layout.fragment3

    companion object {
        fun newInstance() = Fragment3()
    }

}