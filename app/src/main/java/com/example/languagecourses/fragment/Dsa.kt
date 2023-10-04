package com.example.languagecourses.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.languagecourses.DataClass.Cprogramming
import com.example.languagecourses.R
import com.example.languagecourses.adapter.MyAdapter

class Dsa : Fragment() {

    private lateinit var adapter: MyAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var itemlist : ArrayList<Cprogramming>

    lateinit var imageId:Array<Int>
    lateinit var heading : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dsa, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataInitialize()

        val layoutManager = LinearLayoutManager(view.context)
        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = MyAdapter(ArrayList(itemlist))
        recyclerView.adapter = adapter

    }

    private fun dataInitialize(){

        itemlist = arrayListOf<Cprogramming>()

        imageId = arrayOf(
            R.drawable.folder,
            R.drawable.folder,
            R.drawable.folder,
            R.drawable.folder,
            R.drawable.folder,
            R.drawable.folder,
            R.drawable.folder,
            R.drawable.folder,
            R.drawable.folder,
            R.drawable.folder,
            R.drawable.folder,
            R.drawable.folder,
            R.drawable.folder,
            R.drawable.folder,
            R.drawable.folder,
            R.drawable.folder,

            )

        heading = arrayOf(

            getString(R.string.ds_1),
            getString(R.string.ds_2),
            getString(R.string.ds_3),
            getString(R.string.ds_4),
            getString(R.string.ds_5),
            getString(R.string.ds_6),
            getString(R.string.ds_7),
            getString(R.string.ds_8),
            getString(R.string.ds_9),
            getString(R.string.ds_10),
            getString(R.string.ds_11),
            getString(R.string.ds_12),
            getString(R.string.ds_13),
            getString(R.string.ds_14),
            getString(R.string.ds_15),
            getString(R.string.ds_16),


            )


        for (i in imageId.indices){
            val cModule = Cprogramming(imageId[i],heading[i])
            itemlist.add(cModule)
        }
    }


}