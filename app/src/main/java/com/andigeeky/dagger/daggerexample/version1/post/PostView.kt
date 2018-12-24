package net.gahfy.feedme.ui.post

import com.andigeeky.dagger.daggerexample.version1.base.BaseView

/**
 * Interface providing required method for a view displaying posts
 */
interface PostView : BaseView {
    /**
     * Displays the loading indicator of the view
     */
    fun showLoading()

    /**
     * Hides the loading indicator of the view
     */
    fun hideLoading()
}