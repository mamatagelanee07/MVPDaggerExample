package com.andigeeky.dagger.daggerexample.version2.post

import android.util.Log

class CommentRepository{
    fun loadComments(){
        Log.e(TAG, "loadComments()")
    }

    companion object {
        val TAG : String = CommentRepository::class.java.simpleName
    }
}