
package com.example.btrack

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class BusRoutesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bus_routes)

        val route1 = findViewById<LinearLayout>(R.id.routeCard1)
        val route2 = findViewById<LinearLayout>(R.id.routeCard2)
        val route3 = findViewById<LinearLayout>(R.id.routeCard3)

        route1.setOnClickListener {
            openRouteDetails("01")
        }

        route2.setOnClickListener {
            openRouteDetails("02")
        }

        route3.setOnClickListener {
            openRouteDetails("03")
        }
    }

    private fun openRouteDetails(routeNumber: String) {
        val intent = Intent(this, RouteDetailsActivity::class.java)
        intent.putExtra("ROUTE_NUMBER", routeNumber)
        startActivity(intent)
    }
}