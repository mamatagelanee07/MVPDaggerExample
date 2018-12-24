package com.andigeeky.dagger.daggerexample.version2.post

import com.andigeeky.dagger.daggerexample.version2.common.BasePresenter
import com.andigeeky.dagger.daggerexample.version2.common.BaseView

interface PostContract{

    interface View : BaseView<Presenter>{
        fun showLoading()
        fun hideLoading()
    }

    interface Presenter : BasePresenter<View>{
        fun loadComments()
        fun postComments()
    }
}