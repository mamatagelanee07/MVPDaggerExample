package com.andigeeky.dagger.daggerexample.main

import android.os.Bundle
import android.util.Log
import com.andigeeky.dagger.daggerexample.R
import com.andigeeky.dagger.daggerexample.base.BaseActivity

class MainActivity : BaseActivity<MainPresenter>(), MainView{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.callMainPresenter()
    }

    override fun loadMain() {
        Log.e("MainActivity", "loadMain")
    }

    override fun instantiatePresenter(): {
        return MainPresenter(this)
    }
}
