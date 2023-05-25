package com.example.golpe.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.golpe.R
import com.example.golpe.const.Layout
import com.example.golpe.data.DataNewsSource

class NewsAdapter (
    private val context: Context?,
    private val layout:Int
): RecyclerView.Adapter<NewsAdapter.NewsCardViewHolder>(){
    private val newsList = DataNewsSource.news
    class NewsCardViewHolder(view:View?): RecyclerView.ViewHolder(view!!){
        val newsImageView: ImageView? = view!!.findViewById(R.id.news_image)
        val newsTitleTextView: TextView? = view!!.findViewById(R.id.news_title)
        val newsDateTextView: TextView? = view!!.findViewById(R.id.news_date)
        val newstextTextView: TextView? = view!!.findViewById(R.id.news_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsCardViewHolder {
        val adapterLayout = when (layout) {
            // Inflate the layout
            Layout.VERTICAL -> LayoutInflater.from(parent.context).inflate(R.layout.activity_news_list, parent, false)
            else -> LayoutInflater.from(parent.context).inflate(R.layout.activity_news_list, parent, false)
        }
        return NewsCardViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: NewsCardViewHolder, position: Int) {
        val newsData = newsList[position]
        val resources = context?.resources
        holder.newsImageView?.setImageResource(newsData.imageResourceId)
        holder.newsTitleTextView?.text = newsData.title
        holder.newsDateTextView?.text = resources?.getString(R.string.news_date,newsData.date)
        holder.newstextTextView?.text = resources?.getString(R.string.news_text,newsData.text)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }
}
