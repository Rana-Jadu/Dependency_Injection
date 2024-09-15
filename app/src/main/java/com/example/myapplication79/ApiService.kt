package com.example.myapplication79

import retrofit2.http.GET

interface ApiService {
    @GET ("Albums")
        suspend fun getAlbumList():List<Album>
}