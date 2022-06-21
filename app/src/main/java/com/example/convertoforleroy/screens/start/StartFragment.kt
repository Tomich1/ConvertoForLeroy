package com.example.convertoforleroy.screens.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.convertoforleroy.R


class StartFragment : Fragment() {
	
	lateinit var recyclerView: RecyclerView
	lateinit var adapter: StartAdapter
	
	
	
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		val viewModel = ViewModelProvider(this).get(StartViewModel::class.java)
		
		val v = inflater.inflate(R.layout.fragment_start, container, false)
		
		recyclerView = v.findViewById(R.id.rv_start)
		adapter = StartAdapter()
		recyclerView.adapter = adapter
		
		viewModel.getNalMoney()
		viewModel.myMoneyList.observe(viewLifecycleOwner,{list->
			list.body()?.let { adapter.setlist(it) }
		})
		
		return v
	}
	

}