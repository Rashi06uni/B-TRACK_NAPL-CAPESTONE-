
package com.example.btrack

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RouteDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_route_details)

        // Get selected route number
        val routeNumber = intent.getStringExtra("ROUTE_NUMBER") ?: "01"

        // Connect XML views
        val tvRouteNumber = findViewById<TextView>(R.id.tvRouteNumber)
        val tvRouteTitle = findViewById<TextView>(R.id.tvRouteTitle)
        val btnViewStops = findViewById<Button>(R.id.btnViewStops)

        // Display selected route
        tvRouteNumber.text = "ROUTE $routeNumber"
        tvRouteTitle.text = "College Bus Route $routeNumber"

        // Navigate to Bus Stops screen
        btnViewStops.setOnClickListener {

            val intent = Intent(this, BusStopsActivity::class.java)

            intent.putExtra("ROUTE_NUMBER", routeNumber)

            startActivity(intent)
        }
    }
}
