package com.example.recycelerview_kotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycelerview_kotlin.databinding.CardtasarimBinding

class Adapter(val kartlarList: ArrayList<kartlar>): RecyclerView.Adapter<Adapter.CardViewHolder>() {

    class CardViewHolder(val binding: CardtasarimBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
       val binding = CardtasarimBinding.inflate(LayoutInflater.from(parent.context),parent,false);
        return CardViewHolder(binding);
    }

    override fun getItemCount(): Int {
        return kartlarList.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val currentCard = kartlarList.get(position)
     holder.binding.textViewName.text = kartlarList.get(position).name

        val resourceId = holder.itemView.context.resources.getIdentifier(
            currentCard.image, "drawable", holder.itemView.context.packageName)

      holder.binding.cardImage.setImageResource(resourceId)
    }
}

