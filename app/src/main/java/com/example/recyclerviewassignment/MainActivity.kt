package com.example.recyclerviewassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerMessage: RecyclerView
    private lateinit var messageAdapter : MessageAdapter
    private val messages = ArrayList<Message>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        recyclerMessage = findViewById(R.id.recyclerMessage)

        initMessages()

        messageAdapter = MessageAdapter(messages)
        recyclerMessage.adapter = messageAdapter

        recyclerMessage.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
    }

    private fun initMessages(){
        messages.add(Message(
            "Name - Abhijeet Sutar",
            "Address - Karve Nagar",
            "Rent - 3500",
            R.drawable.room1
        ))
        messages.add(Message(
            "Name - Aditya Otari",
            "Address - Kharadi",
            "Rent - 3000",
            R.drawable.room2
        ))
        messages.add(Message(
            "Name - Omkar Deshmukh",
            "Address - Hadapsar",
            "Rent - 3200",
            R.drawable.room3
        ))
        messages.add(Message(
            "Name - Ganesh Jutla",
            "Address - Swargate",
            "Rent - 4500",
            R.drawable.room4
        ))
        messages.add(Message(
            "Name - Kajal Pandhare",
            "Address - Dighi",
            "Rent - 4200",
            R.drawable.ferrari
        ))
        messages.add(Message(
            "Name - Deepika C.",
            "Address - Nalstop",
            "Rent - 5500",
            R.drawable.artura
        ))
        messages.add(Message(
            "Name - Shivam",
            "Address - Balewadi",
            "Rent - 4300",
            R.drawable.intro
        ))
    }
}