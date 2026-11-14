
package com.example.btrack

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BusTimingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bus_timings)

        val routeNumber = intent.getStringExtra("ROUTE_NUMBER") ?: "01"

        val tvTimingRouteTitle =
            findViewById<TextView>(R.id.tvTimingRouteTitle)

        tvTimingRouteTitle.text = "College Bus Route $routeNumber"
    }
}
