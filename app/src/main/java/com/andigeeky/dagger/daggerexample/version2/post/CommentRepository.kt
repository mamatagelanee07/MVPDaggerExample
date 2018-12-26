package com.andigeeky.dagger.daggerexample.version2.post

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

/**
 * If you add [@Inject] to constructor it will automatically initialised by Dagger. We do not need to add provide method for that.
 */
@Singleton
class CommentRepository @Inject constructor(){
    fun loadComments(){
        Log.e(TAG, "loadComments()")
    }

    companion object {
        val TAG : String = CommentRepository::class.java.simpleName
    }
}