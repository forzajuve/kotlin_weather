package com.example.forzajuve.mykotlin

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by forzajuve on 25/12/2016.
 */
class ForcastListAdapter(val items:List<String>) : Adapter<ForcastListAdapter.ViewHolder>(){
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    override fun getItemCount(): Int {
        return items.size
    }


    class ViewHolder(val textView:TextView) : RecyclerView.ViewHolder(textView){
    }


}


