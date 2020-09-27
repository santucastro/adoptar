package com.example.appprueba.ui.posts.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appprueba.R
import com.example.appprueba.ui.posts.adapters.PostsAdapter
import com.example.appprueba.ui.posts.fragments.PostsViewModel
import com.example.appprueba.ui.posts.models.Post

class PostsFragment : Fragment() {
    lateinit var posts: ArrayList<Post>

    companion object {
        fun newInstance() = PostsFragment()
    }

    private lateinit var viewModel: PostsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.posts_fragment, container, false)

        val rvPosts = v.findViewById<View>(R.id.rv_posts) as RecyclerView
        // Initialize contacts
        posts = Post.createContactsList(20)
        // Create adapter passing in the sample user data
        val adapter = PostsAdapter(posts)
        // Attach the adapter to the recyclerview to populate items
        rvPosts.adapter = adapter
        // Set layout manager to position the items
        rvPosts.layoutManager = LinearLayoutManager(context)
        return v
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(PostsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}