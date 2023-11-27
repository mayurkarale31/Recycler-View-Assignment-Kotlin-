package com.example.recyclerviewassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MessageAdapter(
    private val messages: ArrayList<Message>
) : RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {

    class MessageViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imgSender: ImageView
        val txtName: TextView
        val txtAddress: TextView
        val txtRent: TextView

        init {
            imgSender = view.findViewById(R.id.imgSender)
            txtName = view.findViewById(R.id.txtName)
            txtAddress = view.findViewById(R.id.txtAddress)
            txtRent = view.findViewById(R.id.txtRent)
        }
    }

    override fun getItemCount() = messages.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.message_view, null)

        return MessageViewHolder(view)
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        holder.imgSender.setImageResource(messages[position].roomImageId)
        holder.txtName.text= messages[position].name
        holder.txtAddress.text = messages[position].address
        holder.txtRent.text = messages[position].rent
    }

}