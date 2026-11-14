
package com.example.btrack

import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val etName = findViewById<EditText>(R.id.etName)
        val etEmail = findViewById<EditText>(R.id.etRegisterEmail)
        val etPassword = findViewById<EditText>(R.id.etRegisterPassword)
        val etConfirmPassword = findViewById<EditText>(R.id.etConfirmPassword)

        val btnRegister = findViewById<Button>(R.id.btnRegister)
        val tvLogin = findViewById<TextView>(R.id.tvLogin)

        tvLogin.setOnClickListener {
            finish()
        }

        btnRegister.setOnClickListener {

            val name = etName.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString()
            val confirmPassword = etConfirmPassword.text.toString()

            when {
                name.isEmpty() -> {
                    etName.error = "Please enter your name"
                    etName.requestFocus()
                }

                email.isEmpty() -> {
                    etEmail.error = "Please enter your email"
                    etEmail.requestFocus()
                }

                !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> {
                    etEmail.error = "Enter a valid email"
                    etEmail.requestFocus()
                }

                password.isEmpty() -> {
                    etPassword.error = "Please create a password"
                    etPassword.requestFocus()
                }

                password.length < 6 -> {
                    etPassword.error = "Minimum 6 characters required"
                    etPassword.requestFocus()
                }

                confirmPassword.isEmpty() -> {
                    etConfirmPassword.error = "Please confirm your password"
                    etConfirmPassword.requestFocus()
                }

                password != confirmPassword -> {
                    etConfirmPassword.error = "Passwords do not match"
                    etConfirmPassword.requestFocus()
                }

                else -> {
                    Toast.makeText(
                        this,
                        "Registration Validation Successful!",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
        }
    }
}
