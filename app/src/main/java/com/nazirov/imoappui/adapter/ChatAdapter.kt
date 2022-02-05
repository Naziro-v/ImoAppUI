package com.nazirov.imoappui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.nazirov.imoappui.R
import com.nazirov.imoappui.model.Chat

class ChatAdapter(var context: Context,var items:ArrayList<Chat>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat_view,parent,false)
        return MessageViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
       val chat = items[position]

        if (holder is MessageViewHolder) {
            var  iv_profile = holder.iv_profile
            var  tv_fullname = holder.tv_fullname
            var  tv_count = holder.tv_count

            iv_profile.setImageResource(chat.profile)
            tv_fullname.text = chat.fullName
            tv_count.text = chat.count.toString()

            if (chat.count >0) {
                tv_count.visibility = View.VISIBLE
            } else{
                tv_count.visibility = View.GONE
            }
        }
    }
    class MessageViewHolder( itemView: View) :RecyclerView.ViewHolder(itemView) {
         var iv_profile :ShapeableImageView = itemView.findViewById(R.id.iv_profile)
        var tv_fullname :TextView = itemView.findViewById(R.id.full_name)
        var tv_count :TextView = itemView.findViewById(R.id.tv_count)
    }

    override fun getItemCount(): Int {
       return items.size
    }
}