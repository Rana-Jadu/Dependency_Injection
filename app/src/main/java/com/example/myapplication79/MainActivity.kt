package com.example.myapplication79

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication79.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: AlbumViewModel
    lateinit var albumAdapter: AlbumAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this).get(AlbumViewModel::class.java)
        setContentView(binding.root)

        val listItems = listOf(
            Album(1, 2341,"Album1"),
            Album(2, 4562,"album2"),
            Album(3, 5672,"album3"),
            Album(4, 7465,"album4"),
            Album(5, 6547,"album5"),

            )

        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = AlbumAdapter(listItems)
        recyclerView.adapter = adapter



        viewModel.album.observe(this, Observer{
            for (i in it){
                Log.i("user",i.userId.toString())
                Log.i("user",i.id.toString())
                Log.i("user",i.title.toString())
                }
            }

        )
    }

}


