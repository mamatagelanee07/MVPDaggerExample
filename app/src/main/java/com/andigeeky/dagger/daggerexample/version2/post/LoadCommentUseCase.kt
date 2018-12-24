package com.andigeeky.dagger.daggerexample.version2.post

import javax.inject.Inject

class LoadCommentUseCase @Inject constructor(private val commentRepository: CommentRepository){
    fun execute(){
        commentRepository.loadComments()
    }
}