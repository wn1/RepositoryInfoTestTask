package com.example.repositoryinfotesttask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.repositoryinfotesttask.mvvm.repository.RepListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(
                R.id.repListContent,
                RepListFragment.newInstance()
        ).commit()

    }
}