package com.example.languagecourses.fragment

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.languagecourses.R
import com.example.languagecourses.databinding.FragmentBasicProgrammingBinding
import com.example.languagecourses.fragment.BasicProgramming.C_Plus
import com.example.languagecourses.fragment.BasicProgramming.C_Programming
import com.example.languagecourses.fragment.BasicProgramming.C_Sharp
import com.example.languagecourses.fragment.BasicProgramming.Java
import com.example.languagecourses.fragment.BasicProgramming.Python


class Basic_Programming : Fragment() {


    private  val binding by lazy {
        FragmentBasicProgrammingBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity?.requestedOrientation=ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

            binding.cp.setOnClickListener {
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.frameLayout_1, C_Programming())
          //  transaction?.disallowAddToBackStack()
            transaction?.addToBackStack(null)
            transaction?.commit()
       }

//            findNavController().navigate(requireActivity(),Bundle().apply {

 //           })

        binding.cc.setOnClickListener {
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.frameLayout_1, C_Plus())
//            transaction?.disallowAddToBackStack()
            transaction?.addToBackStack(null)

            transaction?.commit()
        }

        binding.python1.setOnClickListener {
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.frameLayout_1, Python())
//            transaction?.disallowAddToBackStack()
            transaction?.addToBackStack(null)

            transaction?.commit()
        }

        binding.java1.setOnClickListener {
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.frameLayout_1, Java())
//            transaction?.disallowAddToBackStack()
            transaction?.addToBackStack(null)

            transaction?.commit()
        }

        binding.csharp1.setOnClickListener {
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.frameLayout_1, C_Sharp())
//            transaction?.disallowAddToBackStack()
            transaction?.addToBackStack(null)

            transaction?.commit()
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root


    }

}