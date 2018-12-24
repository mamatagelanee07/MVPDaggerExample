package com.andigeeky.dagger.daggerexample.version2.di

import android.app.Application
import com.andigeeky.dagger.daggerexample.version2.SampleApp
import com.andigeeky.dagger.daggerexample.version2.post.RepositoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * This is a Dagger component. Refer to [SampleApp] for the list of Dagger components
 * used in this application.
 *
 *
 * Even though Dagger allows annotating a [Component] as a singleton, the code
 * itself must ensure only one instance of the class is created. This is done in [ ].
 * //[AndroidSupportInjectionModule]
 * // is the module from Dagger.Android that helps with the generation
 * // and location of subcomponents.
 */
@Singleton
@Component(modules = [
        ApplicationModule::class,
        ActivityBindingModule::class,
        AndroidSupportInjectionModule::class,
        RepositoryModule::class])

interface AppComponent : AndroidInjector<SampleApp> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        fun build(): AppComponent
    }
}
