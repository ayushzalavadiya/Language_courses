package com.example.languagecourses.fragment

import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.languagecourses.R
import com.example.languagecourses.databinding.FragmentWebTechnologyBinding
import com.example.languagecourses.fragment.BasicProgramming.C_Programming
import com.example.languagecourses.fragment.WebTech.Css
import com.example.languagecourses.fragment.WebTech.JavaScript
import com.example.languagecourses.fragment.WebTech.NodeJs
import com.example.languagecourses.fragment.WebTech.Php


class WebTechnology : Fragment() {

    private  val binding by lazy {
        FragmentWebTechnologyBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.html1.setOnClickListener {
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.frameLayout_1,com.example.languagecourses.fragment.WebTech.Html())
//            transaction?.disallowAddToBackStack()
            transaction?.addToBackStack(null)
            transaction?.commit()
        }

        binding.css.setOnClickListener {
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.frameLayout_1, Css())
//            transaction?.disallowAddToBackStack()
            transaction?.addToBackStack(null)
            transaction?.commit()
        }

        binding.php.setOnClickListener {
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.frameLayout_1, Php())
//            transaction?.disallowAddToBackStack()
            transaction?.addToBackStack(null)
            transaction?.commit()
        }

        binding.js.setOnClickListener {
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.frameLayout_1, JavaScript())
//            transaction?.disallowAddToBackStack()
            transaction?.addToBackStack(null)
            transaction?.commit()
        }

        binding.nodeJs.setOnClickListener {
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.frameLayout_1, NodeJs())
//            transaction?.disallowAddToBackStack()
            transaction?.addToBackStack(null)
            transaction?.commit()
        }


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }
}