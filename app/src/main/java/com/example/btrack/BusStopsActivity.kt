
package com.example.btrack

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BusStopsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bus_stops)

        val routeNumber = intent.getStringExtra("ROUTE_NUMBER") ?: "01"

        val tvStopsRouteTitle =
            findViewById<TextView>(R.id.tvStopsRouteTitle)

        val btnViewTimings =
            findViewById<Button>(R.id.btnViewTimings)

        tvStopsRouteTitle.text = "College Bus Route $routeNumber"

        btnViewTimings.setOnClickListener {

            val intent = Intent(this, BusTimingsActivity::class.java)

            intent.putExtra("ROUTE_NUMBER", routeNumber)

            startActivity(intent)
        }
    }
}
