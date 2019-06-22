package com.anwesh.uiprojects.linkedsquaretoxview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.squaretoxview.SquareToXView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SquareToXView.create(this)
    }
}
