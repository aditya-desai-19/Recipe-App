package com.example.recipeapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class SignUpFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sign_up, container, false)

        val email = view.findViewById<EditText>(R.id.email)
        val password = view.findViewById<EditText>(R.id.pass)
        val signup = view.findViewById<Button>(R.id.signUp)
        signup.setOnClickListener {
            if(email.toString() == ""|| password.toString() == "") {
                Toast.makeText(activity, "Email or password can't be empty", Toast.LENGTH_SHORT).show()
            } else {

            }
        }

        return view
    }


}