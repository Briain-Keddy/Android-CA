package com.example.ca_1

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TvShowsListAdapter(private val tvShowList: List<TvShowEntity>)
    :
    RecyclerView.Adapter<TvShowsListAdapter.ViewHolder>(){
        inner class ViewHolder(itemView: View) :
            RecyclerView.ViewHolder(itemView){
            val binding = MainFragmentBinding.bind(itemView)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
            val inflater = layoutInflater.from(parent.context)
            val view = inflater.inflate(R.layout.list_item, parent, false)
            return ViewHolder(view)
        }
        override fun getItemCount() = tvShowList.size

        override fun onBindViewHolder(holder: ViewHolder, position: Int){
            val tvShow = tvShowList[position]
            with(holder.binding){
                tvShowName.text = tvShow.name
            }
        }
    }