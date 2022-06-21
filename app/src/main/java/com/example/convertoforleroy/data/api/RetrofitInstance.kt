package com.example.convertoforleroy.data.api

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
	private val retrofit by lazy {
		Retrofit.Builder().baseUrl("https://api.monobank.ua/")
			.addConverterFactory(GsonConverterFactory.create()).build()
	}
	val api:ApiService by lazy {
		retrofit.create(ApiService::class.java)
	}
}
