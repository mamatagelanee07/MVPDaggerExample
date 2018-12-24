package com.andigeeky.dagger.daggerexample.version2.post

import android.util.Log
import com.andigeeky.dagger.daggerexample.version2.di.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PostPresenter @Inject constructor(private val view: PostContract.View,
                                        private val loadCommentUseCase: LoadCommentUseCase): PostContract.Presenter{

    override fun loadComments() {
        Log.e(TAG, "loadComments()")
        loadCommentUseCase.execute()
        Log.e(TAG, "loadCommentUseCase.execute()")
        view.showLoading()
    }

    override fun postComments() {
        Log.e(TAG, "postComments()")
    }

    override fun takeView(view: PostContract.View) {
        Log.e(TAG, "takeView()")
    }

    override fun dropView() {
        Log.e(TAG, "dropView()")
    }

    companion object {
        val TAG : String = PostPresenter::class.java.simpleName
    }

}