package com.example.crush_recyclerview_testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.crush_recyclerview_testing.adapter.PersonAdapter
import com.example.crush_recyclerview_testing.model.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var personArray = ArrayList<Person>()
        personArray.add(
            Person(R.drawable.pp1, "Justin Bieber", R.drawable.couplepic, "9k", "3k", "5k")
        )

        personArray.add(
            Person(R.drawable.pp2, "Yellow Flash", R.drawable.couplepic2, "9.2k", "99", "99")
        )

        var personAdapter = PersonAdapter(personArray)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = GridLayoutManager(this, 1)
        recyclerView.adapter = personAdapter
    }
}

