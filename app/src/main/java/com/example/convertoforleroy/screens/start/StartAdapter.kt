package com.example.convertoforleroy.screens.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.convertoforleroy.R
import com.example.convertoforleroy.databinding.ItemMoneyLayoutBinding
import com.example.convertoforleroy.model.nal.NalichkaItem

class StartAdapter:RecyclerView.Adapter<StartAdapter.StartViewHolder>() {
	class MyViewHolder(
		val binding : ItemMoneyLayoutBinding
	): RecyclerView.ViewHolder(binding.root)
	
	var listStart = emptyList<NalichkaItem>()
	
	class StartViewHolder(view: View) :RecyclerView.ViewHolder(view)
 
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
	val view = LayoutInflater.from(parent.context).
	inflate(R.layout.item_money_layout, parent, false)
		return StartViewHolder(view)
	}
	
	
	override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
		
			
			holder.itemView.findViewById<TextView>(R.id.item_buy).text = listStart[position].currencyCodeA.toString()
			holder.itemView.findViewById<TextView>(R.id.item_sale).text = listStart[position].currencyCodeB.toString()
			holder.itemView.findViewById<TextView>(R.id.item_have).text = listStart[position].rateBuy.toString()
	}
	
	override fun getItemCount(): Int {
		return listStart.size
	
	}
	@SuppressLint("NotifyDataSetChanged")
	fun setlist(list:List<NalichkaItem>){
		listStart = list
		notifyDataSetChanged()
	
	}
}