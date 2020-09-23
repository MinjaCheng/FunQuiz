package com.example.funquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_question.*

class FactFragment : Fragment(){

    lateinit var factText : TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fact, viewFact, false)
        factText = view.findViewById(R.id.factTextView)
        return view
    }

    fun setText(text: String){
        factText.text = text
    }

}