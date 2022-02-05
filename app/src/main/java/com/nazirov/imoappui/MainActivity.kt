package com.nazirov.imoappui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nazirov.imoappui.adapter.ChatAdapter
import com.nazirov.imoappui.model.Chat

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

        refreshAdapter(getAllChats())
    }

    private fun getAllChats(): ArrayList<Chat> {
        val chats: ArrayList<Chat> = ArrayList()

        chats.add(Chat(R.drawable.img, "Nazirov Elmurod", 1))
        chats.add(Chat(R.drawable.img_1, "Nazirov Elmurod", 0))
        chats.add(Chat(R.drawable.img, "Nazirov Elmurod", 2))
        chats.add(Chat(R.drawable.img_1, "Nazirov Elmurod", 3))
        chats.add(Chat(R.drawable.img, "Nazirov Elmurod", 2))
        chats.add(Chat(R.drawable.img, "Nazirov Elmurod", 1))
        chats.add(Chat(R.drawable.img_1, "Nazirov Elmurod", 2))
        chats.add(Chat(R.drawable.img, "Nazirov Elmurod", 1))
        chats.add(Chat(R.drawable.img_1, "Nazirov Elmurod", 3))
        chats.add(Chat(R.drawable.img, "Nazirov Elmurod", 1))
        chats.add(Chat(R.drawable.img, "Nazirov Elmurod", 1))
        chats.add(Chat(R.drawable.img_1, "Nazirov Elmurod", 0))
        chats.add(Chat(R.drawable.img, "Nazirov Elmurod", 2))
        chats.add(Chat(R.drawable.img_1, "Nazirov Elmurod", 3))
        chats.add(Chat(R.drawable.img, "Nazirov Elmurod", 2))
        chats.add(Chat(R.drawable.img, "Nazirov Elmurod", 1))
        chats.add(Chat(R.drawable.img_1, "Nazirov Elmurod", 2))
        chats.add(Chat(R.drawable.img, "Nazirov Elmurod", 1))
        chats.add(Chat(R.drawable.img_1, "Nazirov Elmurod", 3))
        chats.add(Chat(R.drawable.img, "Nazirov Elmurod", 1))

        return chats

    }

    private fun refreshAdapter(chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(this, chats)
        recyclerView!!.adapter = adapter

    }
}