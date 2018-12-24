package com.andigeeky.dagger.daggerexample.version2.post

import com.andigeeky.dagger.daggerexample.version2.di.ActivityScoped
import dagger.Binds
import dagger.Module

/**
 * This is a Dagger module. We use this to pass in the View dependency to the
 * [PostPresenter].
 */
@Module
abstract class PostModule {

    @ActivityScoped
    @Binds
    internal abstract fun postPresenter(presenter: PostPresenter): PostContract.Presenter
}
