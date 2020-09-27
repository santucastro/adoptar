package com.example.appprueba.ui.posts.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appprueba.R
import com.example.appprueba.ui.posts.models.Post


class PostsAdapter (private val mPosts: List<Post>) : RecyclerView.Adapter<PostsAdapter.ViewHolder>()
{
    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    inner class ViewHolder(listItemView: View) : RecyclerView.ViewHolder(listItemView) {
        // Your holder should contain and initialize a member variable
        // for any view that will be set as you render a row
        val nameTextView = itemView.findViewById<TextView>(R.id.card_post_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.post_fragment, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)
    }

    // Involves populating data into the item through holder
    override fun onBindViewHolder(viewHolder: PostsAdapter.ViewHolder, position: Int) {
        // Get the data model based on position
        val post: Post = mPosts[position]
        // Set item views based on your views and data model
        val textView = viewHolder.nameTextView
        textView.text = post.title
    }

    // Returns the total count of items in the list
    override fun getItemCount(): Int {
        return mPosts.size
    }
}