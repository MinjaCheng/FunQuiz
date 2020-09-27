package com.example.funquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class FactFragment : Fragment(){

    lateinit var factText: TextView
    lateinit var nextQueButton: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fact, container, false)
        factText = view.findViewById(R.id.factTextView)
        nextQueButton = view.findViewById(R.id.nextViewButton)
        return view
    }

    fun setText(text: String){
        factText.text = text
    }

}