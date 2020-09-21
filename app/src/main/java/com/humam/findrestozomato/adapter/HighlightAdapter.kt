package com.humam.findrestozomato.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.humam.findrestozomato.R
import com.humam.findrestozomato.model.ModelHighlights
import kotlinx.android.synthetic.main.list_item_highlights.view.*

class HighlightAdapter (private val mContext: Context, private val items: List<ModelHighlights>) : RecyclerView.Adapter<HighlightAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HighlightAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_highlights, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: HighlightAdapter.ViewHolder, position: Int) {
        val data = items[position]
        holder.tvHighlights.text = data.highlights
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvHighlights: TextView

        init {
            tvHighlights = itemView.tvHighlights
        }
    }
}