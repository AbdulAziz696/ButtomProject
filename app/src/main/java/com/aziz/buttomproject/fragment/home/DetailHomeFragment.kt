package com.aziz.buttomproject.fragment.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.aziz.buttomproject.R
import com.aziz.buttomproject.databinding.FragmentDetailGalleryBinding
import com.aziz.buttomproject.databinding.FragmentDetailHomeBinding
import com.aziz.buttomproject.fragment.gallery.DetailGalleryFragmentArgs


class DetailHomeFragment : Fragment() {
    private lateinit var binding: FragmentDetailHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
binding= FragmentDetailHomeBinding.inflate(inflater,container,false)
        val dataJudulhome = DetailHomeFragmentArgs.fromBundle(
            arguments as Bundle
        ).detailNamaHome
        val dataDeskHome = DetailHomeFragmentArgs.fromBundle(
            arguments as Bundle
        ).detailDeskHome
        val dataGambarGallery =
            DetailHomeFragmentArgs.fromBundle(arguments as Bundle).detailGambarHome
        binding.imgBackHome.setOnClickListener{View->
            View.findNavController().navigate(R.id.action_detailHomeFragment_to_home)}

        binding.txtDetailJudulHome.text = dataJudulhome
        binding.imgDetailHome.setImageResource(dataGambarGallery)
        binding.txtDescDetailHome.text= dataDeskHome
        return binding.root

    }
    }


