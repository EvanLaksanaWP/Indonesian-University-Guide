package com.chenzfall.indonesianuniversity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ListUniversityAdapter(private val listUniversity: ArrayList<University>): RecyclerView.Adapter<ListUniversityAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvTitle: TextView = itemView.findViewById(R.id.tv_title)
        var tvPreview: TextView = itemView.findViewById(R.id.tv_preview)
        var imgLogo: ImageView = itemView.findViewById(R.id.img_university_logo)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_university, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val university = listUniversity[position]

        Glide.with(holder.itemView.context)
            .load(university.logo)
            .into(holder.imgLogo)

        holder.tvTitle.text = university.name
        holder.tvPreview.text = university.preview

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listUniversity[holder.adapterPosition])

        }
    }

    override fun getItemCount(): Int {
        return listUniversity.size
    }

    interface OnItemClickCallback{
        fun onItemClicked(data: University)
    }
}