package com.example.convertoforleroy.data.repository

import com.example.convertoforleroy.data.api.RetrofitInstance
import com.example.convertoforleroy.model.nal.Nalichka
import retrofit2.Response

class Repository {
	
	suspend fun getNal():Response<Nalichka>{
		return RetrofitInstance.api.getNal()
	}
	
	
}