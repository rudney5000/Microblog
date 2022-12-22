package com.rudneydedy.service

import com.rudneydedy.db.Database.POSTS
import com.rudneydedy.entity.Post
import com.rudneydedy.repository.PostRepository

class PostService(private val postRepository: PostRepository = PostRepository()) {


    fun getAllPost(): List<Post> = postRepository.findAll()

    fun createPost(content: String, userId: Long): Post {
        if (content != "") {
            val post = Post(id = POSTS.size + 1L, content = content, userId = userId)
            postRepository.save(post)
            return post
        }
        throw IllegalArgumentException("Les donnees ne sont pas valides")
    }

    fun getPostsByUser(userId: Long):List<Post> = postRepository.findAllBy(userId)

}