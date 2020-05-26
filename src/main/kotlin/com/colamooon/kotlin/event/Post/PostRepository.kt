package com.colamooon.kotlin.event.Post


import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.data.repository.CrudRepository

interface PostRepository : CrudRepository<Post, Long>, QuerydslPredicateExecutor<Post> {

}
