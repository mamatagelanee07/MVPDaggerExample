package com.andigeeky.dagger.daggerexample.version2.post

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.andigeeky.dagger.daggerexample.R
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class PostActivity : DaggerAppCompatActivity(), PostContract.View{

    @Inject
    internal lateinit var mPresenter: PostContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mPresenter.loadComments()
    }

    override fun showLoading() {
        Log.e(TAG, "showLoading()")
    }

    override fun hideLoading() {
        Log.e(TAG, "hideLoading()")
    }

    override fun onResume() {
        super.onResume()
        mPresenter.takeView(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.dropView()
    }

    companion object {
        val TAG: String = PostActivity::class.java.simpleName
    }
}

