package com.example.convertoforleroy.data.api

import com.example.convertoforleroy.model.nal.Nalichka
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
	
	@GET("bank/currency")
	suspend fun getNal():Response<Nalichka>
}