package com.example.project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project2.ui.main.MainFragment
import com.example.project2.ui.main.InputFragment

class MainActivity : AppCompatActivity(),InputFragment.CalcListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }

    override fun setDisplay(input: String) {
        var mainFrag = supportFragmentManager.findFragmentById(R.id.main) as MainFragment
        mainFrag.changeDisplay(input)
    }

}