package com.andigeeky.dagger.daggerexample.version1.main

import android.util.Log
import com.andigeeky.dagger.daggerexample.version1.base.BasePresenter

class MainPresenter(view: MainView) : BasePresenter<MainView>(view) {
    fun callMainPresenter(){
        Log.e("MainPresenter", "callMainPresenter")
        view.loadMain()
    }
}