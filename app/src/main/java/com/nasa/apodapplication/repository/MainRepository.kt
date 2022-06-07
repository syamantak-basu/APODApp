package com.nasa.apodapplication.repository

import com.nasa.apodapplication.retrofit.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService) {
    fun getNasaAPOD() = retrofitService.getNasaAPOD()
}