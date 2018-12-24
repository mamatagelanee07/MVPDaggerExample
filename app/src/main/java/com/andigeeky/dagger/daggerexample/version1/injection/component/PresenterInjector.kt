package com.andigeeky.dagger.daggerexample.version1.injection.component

import com.andigeeky.dagger.daggerexample.version1.base.BaseView
import dagger.BindsInstance
import dagger.Component
import com.andigeeky.dagger.daggerexample.version1.injection.module.ContextModule
import com.andigeeky.dagger.daggerexample.version1.post.PostPresenter
import javax.inject.Singleton


/**
 * Component providing inject() methods for presenters.
 */
@Singleton
@Component(modules = [(ContextModule::class)])
interface PresenterInjector {
    /**
     * Injects required dependencies into the specified PostPresenter.
     * @param postPresenter PostPresenter in which to inject the dependencies
     */
    fun inject(postPresenter: PostPresenter)

    @Component.Builder
    interface Builder {
        fun build(): PresenterInjector

        fun contextModule(contextModule: ContextModule): Builder

        @BindsInstance
        fun baseView(baseView: BaseView): Builder
    }
}