package com.example.golpe.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.golpe.R
import com.example.golpe.const.Layout.GRID
import com.example.golpe.data.DataEstadioSource

class EstadioAdapter(
    private val context: Context?,
    private val layout:Int):
    RecyclerView.Adapter<EstadioAdapter.EstadioCardViewHolder>() {
        private  val estadioList = DataEstadioSource.estadio
        class EstadioCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!){
            val estadioImageView: ImageView? = view!!.findViewById(R.id.estadio_image)
            val estadioNameTextView: TextView? = view!!.findViewById(R.id.estadio_name)
            val estadioAgeTextView: TextView? = view!!.findViewById(R.id.estadio_age)
            val estadioCapacityTextView: TextView? = view!!.findViewById(R.id.estadio_capacity)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EstadioCardViewHolder {
        val adapterLayout = when (layout) {
            // Inflate the layout
            GRID -> LayoutInflater.from(parent.context).inflate(R.layout.activity_estadio, parent, false)
            else -> LayoutInflater.from(parent.context).inflate(R.layout.activity_estadio, parent, false)
        }
        return EstadioCardViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: EstadioCardViewHolder, position: Int) {
        val estadioData = estadioList[position]
        val resources = context?.resources
        holder.estadioImageView?.setImageResource(estadioData.imageResourceId)
        holder.estadioNameTextView?.text = estadioData.name
        holder.estadioAgeTextView?.text = resources?.getString(R.string.estadio_age, estadioData.age)
        holder.estadioCapacityTextView?.text = resources?.getString(R.string.estadio_capacity, estadioData.capacity)
    }

    override fun getItemCount(): Int {
        return estadioList.size
    }
}