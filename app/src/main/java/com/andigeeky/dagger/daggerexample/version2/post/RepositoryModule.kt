package com.andigeeky.dagger.daggerexample.version2.post

import dagger.Module
import dagger.Provides

/**
 * This is a Dagger module. We use this to pass in the View dependency to the
 * [PostPresenter].
 */
@Module
class RepositoryModule {

    @Provides
    fun provideCommentRepository() : CommentRepository{
        return CommentRepository()
    }
}
