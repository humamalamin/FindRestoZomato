package com.humam.findrestozomato.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.humam.findrestozomato.R
import com.humam.findrestozomato.model.ModelMainHorizontal
import kotlinx.android.synthetic.main.list_item_main_horizontal.view.*

class MainAdapterHoriontal (private val mContext: Context, private val items: List<ModelMainHorizontal>) : RecyclerView.Adapter<MainAdapterHoriontal.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapterHoriontal.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_main_horizontal, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MainAdapterHoriontal.ViewHolder, position: Int) {
        val data = items[position]

        Glide.with(mContext)
            .load(data.imgeUrl)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(holder.imgThumb)

        Glide.with(mContext)
            .load(data.imgeUrl)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(holder.imgCollection)

        holder.tvTitle.text = data.title
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgThumb: ImageView
        var imgCollection: ImageView
        var tvTitle: TextView

        init {
            imgThumb = itemView.imgThumb
            imgCollection = itemView.imgCollection
            tvTitle = itemView.tvTitle
        }
    }
}