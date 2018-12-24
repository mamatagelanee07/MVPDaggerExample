package com.andigeeky.dagger.daggerexample.version1.post

import com.andigeeky.dagger.daggerexample.version1.base.BasePresenter
import net.gahfy.feedme.ui.post.PostView

/**
 * The Presenter that will present the Post view.
 * @param postView the Post view to be presented by the presenter
 * @property postApi the API interface implementation
 * @property subscription the subscription to the API call
 */
class PostPresenter(postView: PostView) : BasePresenter<PostView>(postView)