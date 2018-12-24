package com.andigeeky.dagger.daggerexample.version2.common

interface BasePresenter<T>{
    /**
     * Binds presenter with a view when resumed. The Presenter will perform initialization here.
     *
     * @param view the view associated with this presenter
     */
    fun takeView(view: T)

    /**
     * Drops the reference to the view when destroyed
     */
    fun dropView()
}