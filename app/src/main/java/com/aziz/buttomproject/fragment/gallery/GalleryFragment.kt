package com.aziz.buttomproject.fragment.gallery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.aziz.buttomproject.Model.ModelGallery
import com.aziz.buttomproject.Model.ModelPrestasi
import com.aziz.buttomproject.R
import com.aziz.buttomproject.adapter.AdapterGallery
import com.aziz.buttomproject.adapter.AdapterPrestasi
import com.aziz.buttomproject.data.DataGallery
import com.aziz.buttomproject.data.DataPrestasi
import com.aziz.buttomproject.databinding.FragmentGalleryBinding
import com.aziz.buttomproject.databinding.FragmentPrestasiBinding

class GalleryFragment : Fragment() {
    private lateinit var bindingGallery : FragmentGalleryBinding

    private var listGallery: ArrayList<ModelGallery> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        bindingGallery= FragmentGalleryBinding.inflate(inflater,container,false)
        bindingGallery.ItemRecyclerGallery.setHasFixedSize(true)
        listGallery.addAll(DataGallery.listGallery)
        bindingGallery.ItemRecyclerGallery.layoutManager = LinearLayoutManager(context)
        val adapter = AdapterGallery(listGallery)
        bindingGallery.ItemRecyclerGallery.adapter = adapter


        return bindingGallery.root     }

}