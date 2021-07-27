package com.example.retrofitlibrary

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitLibrary {
    companion object{
        fun getRetrofit(BASE_URL:String):Retrofit{
            return Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
        }
    }
}