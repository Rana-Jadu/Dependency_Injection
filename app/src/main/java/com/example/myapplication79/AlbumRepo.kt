package com.example.myapplication79

import javax.inject.Inject

class AlbumRepo @Inject constructor(
    val apiService: ApiService
) {
    suspend fun getAlbumList(): List<Album>{
        return apiService.getAlbumList()
    }
}