package com.colamooon.kotlin.event.Post

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.web.servlet.function.router

@Configuration
class PostRouter {

    @Bean
    fun postRoute(handler: PostHandler) = router {
        accept(APPLICATION_JSON).nest {
            GET("/post/{id}", handler::getPost)
            GET("/post", handler::listPost)
            GET("/post/title/{title}", handler::findByTitle)
        }
        POST("/post", handler::createPost)
    }
}