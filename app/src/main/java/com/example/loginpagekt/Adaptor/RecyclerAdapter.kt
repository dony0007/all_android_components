package com.example.loginpagekt.Adaptor

import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.loginpagekt.R
import com.example.loginpagekt.model.ItemsViewModel

class RecyclerAdapter(
    private val data:
    List<ItemsViewModel>
) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {


    private lateinit var parent: ViewGroup
    var isExpanded : Boolean = false


    class ViewHolder(itemView: View) : RecyclerView
    .ViewHolder(itemView) {

        val profile: ImageView = itemView.findViewById(R.id.profile1)

        val name: TextView = itemView.findViewById(R.id.tv_name)

        val message: TextView = itemView.findViewById(R.id.tv_msg)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        this.parent = parent
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.recycle_layout_item, parent, false)

        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = data[position]

        holder.profile.setImageResource(item.image)
        holder.name.text = item.name
        holder.message.text = item.message

        holder.message.setOnClickListener {
            if(!isExpanded)
            {
                holder.message.setLines(10)
                isExpanded = true
            }
            else{
                holder.message.setLines(1)
                isExpanded = false
                holder.message.setBackgroundResource(R.color.lightblue)


                TransitionManager.beginDelayedTransition(parent!!,AutoTransition())
            }
        }



    }

}