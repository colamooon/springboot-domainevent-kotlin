package com.colamooon.kotlin.event.Post.service

import com.colamooon.kotlin.event.Post.Post
import com.colamooon.kotlin.event.Post.PostRepository
import com.colamooon.kotlin.event.Post.PostRepositorySupport
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class PostService(private val postRepository: PostRepository,
                  private val postRepositorySupport: PostRepositorySupport) {

    @Transactional
    fun savePost(post: Post) {
        post.rewarded()
        postRepository.save(post)
    }

    @Transactional(readOnly = true)
    fun findByTitle(title: String) {
        postRepositorySupport.findByTitle(title)
    }

}
