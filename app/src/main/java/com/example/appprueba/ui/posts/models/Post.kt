package com.example.appprueba.ui.posts.models

class Post(val title: String) {
    companion object {

        fun createContactsList(numPosts: Int): ArrayList<Post> {
            val posts = ArrayList<Post>()
            for (i in 1..numPosts) {
                posts.add(Post("Posts " + i))
            }
            return posts
        }
    }
}