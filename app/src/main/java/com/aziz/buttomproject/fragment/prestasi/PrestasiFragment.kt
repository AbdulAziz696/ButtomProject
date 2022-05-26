package com.aziz.buttomproject.fragment.prestasi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.aziz.buttomproject.Model.ModelPrestasi
import com.aziz.buttomproject.R
import com.aziz.buttomproject.adapter.AdapterPrestasi
import com.aziz.buttomproject.data.DataPrestasi
import com.aziz.buttomproject.databinding.FragmentPrestasiBinding

class PrestasiFragment : Fragment() {
    private lateinit var bindingPrestasi : FragmentPrestasiBinding

    private var listPrestasi: ArrayList<ModelPrestasi> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bindingPrestasi= FragmentPrestasiBinding.inflate(inflater,container,false)
        bindingPrestasi.ItemRecyclerPrestasi.setHasFixedSize(true)
        listPrestasi.addAll(DataPrestasi.listPrestasi)
        bindingPrestasi.ItemRecyclerPrestasi.layoutManager = LinearLayoutManager(context)
        val adapter = AdapterPrestasi(listPrestasi)
        bindingPrestasi.ItemRecyclerPrestasi.adapter = adapter


        return bindingPrestasi.root
    }


}