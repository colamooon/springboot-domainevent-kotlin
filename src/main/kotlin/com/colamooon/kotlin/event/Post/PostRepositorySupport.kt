package com.colamooon.kotlin.event.Post

import com.querydsl.jpa.impl.JPAQuery
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport
import org.springframework.stereotype.Repository
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Repository
class PostRepositorySupport : QuerydslRepositorySupport(Post::class.java) {
    @PersistenceContext
    override fun setEntityManager(entityManager: EntityManager) {
        super.setEntityManager(entityManager)
    }

    fun findByTitle(title: String): Post? {
        var query: JPAQuery<Post> = JPAQuery(entityManager)
        val post = QPost.post
        query.select(post).from(post).where(post.title.eq(title))
        return query.fetchOne()
    }
}