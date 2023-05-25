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
import com.example.golpe.data.DataSource


class TimesAdapter (
    private val context: Context?,
    private  val layout:Int
): RecyclerView.Adapter<TimesAdapter.TimeCardViewHolder>(){
   private  val timeList = DataSource.times

    class TimeCardViewHolder(view:View?):RecyclerView.ViewHolder(view!!){
        val timeImageView: ImageView? = view!!.findViewById(R.id.time_image)
        val timeNameTextView: TextView? = view!!.findViewById(R.id.time_name)
        val timeAgeTextView: TextView? = view!!.findViewById(R.id.time_age)
        val timeEstadioTextView: TextView? = view!!.findViewById(R.id.time_estadio)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimeCardViewHolder {
        val adapterLayout = when(layout){
            GRID -> LayoutInflater.from(parent.context).inflate(R.layout.activity_vertical_list, parent, false)
            else -> LayoutInflater.from(parent.context).inflate(R.layout.vertical_horizontal_list_item, parent, false)
        }
        return TimeCardViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: TimeCardViewHolder, position: Int) {
        val timeData = timeList[position]
        val resources = context?.resources
        holder.timeImageView?.setImageResource(timeData.imageResourceId)
        holder.timeNameTextView?.text = timeData.name
        holder.timeAgeTextView?.text = resources?.getString(R.string.time_age, timeData.age)
        holder.timeEstadioTextView?.text = resources?.getString(R.string.time_estadio, timeData.estadio)
    }

    override fun getItemCount(): Int {
        return timeList.size
    }

}