package com.example.languagecourses.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.languagecourses.R
import com.example.languagecourses.databinding.FragmentHomeBinding

class home : Fragment() {
private  val binding by lazy {
    FragmentHomeBinding.inflate(layoutInflater)
}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Basic Programming
        binding.module1.setOnClickListener {
        val transaction = activity?.supportFragmentManager?.beginTransaction()
        transaction?.replace(R.id.frameLayout_1, Basic_Programming())
//        transaction?.disallowAddToBackStack()
            transaction?.addToBackStack(null)
        transaction?.commit()
       }

        //Web Technology
        binding.module2.setOnClickListener {
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.frameLayout_1, WebTechnology())
//            transaction?.disallowAddToBackStack()
            transaction?.addToBackStack(null)
            transaction?.commit()
        }
        //AI/ML
        binding.module3.setOnClickListener {
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.frameLayout_1, Ai_Ml())
//            transaction?.disallowAddToBackStack()
            transaction?.addToBackStack(null)
            transaction?.commit()

        }
        //Big Data
        binding.module4.setOnClickListener {
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.frameLayout_1, Dsa())
//            transaction?.disallowAddToBackStack()
            transaction?.addToBackStack(null)
            transaction?.commit()
        }
            // Android Application
        binding.module5.setOnClickListener {
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.frameLayout_1, AndroidAppDev())
//            transaction?.disallowAddToBackStack()
            transaction?.addToBackStack(null)
            transaction?.commit()
        }
            // Flutter Application
        binding.module6.setOnClickListener {
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.frameLayout_1, FlutterAppDev())
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