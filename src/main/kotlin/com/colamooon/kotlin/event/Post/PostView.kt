package com.colamooon.kotlin.event.Post


import com.colamooon.app.api.common.model.BaseView

class PostView : BaseView() {

    var title = ""
    var content = ""
    var memberId: Long? = null

    fun getView(post: Post) {
        this.title = post.title
        this.content = post.content
        this.memberId = post.memberId
    }


}
