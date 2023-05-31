package com.example.recipeapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class LoginFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        val new_acc = view.findViewById<TextView>(R.id.createAcc)
        new_acc.setOnClickListener {
            val fragment = SignUpFragment()
            val fragmentManager = activity?.supportFragmentManager
            val trans = fragmentManager?.beginTransaction()
            trans?.add(R.id.container, fragment)
            trans?.commit()
        }


        return  view
    }

}