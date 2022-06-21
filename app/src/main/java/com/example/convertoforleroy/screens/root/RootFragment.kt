package com.example.convertoforleroy.screens.root

import android.content.Context
import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.convertoforleroy.R
import com.example.convertoforleroy.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class RootFragment : Fragment() {
	
	private var ctx: Context ?= null
	override fun onAttach(context: Context) {
		super.onAttach(context)
		ctx=context
	}
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		val view =inflater.inflate(R.layout.fragment_root, container, false)
		
		
		view.findViewById<ViewPager2>(R.id.viewPager).adapter = ViewPagerAdapter(ctx as FragmentActivity)
		
		return view
		
	}
	
	
}
