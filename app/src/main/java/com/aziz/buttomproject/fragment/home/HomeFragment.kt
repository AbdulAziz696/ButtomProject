package com.aziz.buttomproject.fragment.home

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.aziz.buttomproject.Model.ModelHome
import com.aziz.buttomproject.R
import com.aziz.buttomproject.adapter.AdapterHome
import com.aziz.buttomproject.adapter.AdapterPrestasi
import com.aziz.buttomproject.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var bindingHome: FragmentHomeBinding
    private val list = ArrayList<ModelHome>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bindingHome = FragmentHomeBinding.inflate(inflater, container, false)

        bindingHome.ItemRecyclerHome.setHasFixedSize(true)
        list.addAll(listhomes)

        bindingHome.ItemRecyclerHome.layoutManager = LinearLayoutManager( context)
        val listAdapter= AdapterHome(list)
        bindingHome.ItemRecyclerHome.adapter= listAdapter


        return bindingHome.root
    }

    private val listhomes: ArrayList<ModelHome>
        @SuppressLint("Recycle")

        get() {
            val datanamahome = resources.getStringArray(R.array.data_nama_home)
            val datadeshome = resources.getStringArray(R.array.desk_home)
            val dataphotohome = resources.obtainTypedArray(R.array.gambar_home)
            val listhome = ArrayList<ModelHome>()
            for (i in datanamahome.indices) {
                val home =
                    ModelHome(datanamahome[i], datadeshome[i], dataphotohome.getResourceId(i, -1))
                listhome.add(home)
            }
            return listhome


        }
}



