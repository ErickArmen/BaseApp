package com.eoma.baseapp.presentation


import com.eoma.baseapp.R
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), HasSupportFragmentInjector {

    override fun setLayout(): Int = R.layout.activity_main

    override fun initViews() {
        textView.setText(R.string.hello_erick)
    }
}
