package com.aziz.buttomproject.fragment.gallery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.aziz.buttomproject.R
import com.aziz.buttomproject.databinding.FragmentDetailGalleryBinding
import com.aziz.buttomproject.databinding.FragmentDetailHomeBinding
import com.aziz.buttomproject.databinding.FragmentGalleryBinding


class DetailGalleryFragment : Fragment() {
    private lateinit var binding: FragmentDetailGalleryBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailGalleryBinding.inflate(inflater, container, false)
        val dataJudulhome =DetailGalleryFragmentArgs.fromBundle(
            arguments as Bundle
        ).detailNamaGallery
        val dataDeskHome =DetailGalleryFragmentArgs.fromBundle(
            arguments as Bundle
        ).detailDeskGallery
        val dataGambarGallery =
            DetailGalleryFragmentArgs.fromBundle(arguments as Bundle).detailGambarGallery

        binding.imgBackgallery.setOnClickListener{View->
            View.findNavController().navigate(R.id.action_detailGalleryFragment2_to_gallery)}

        binding.txtDetailJudul.text = dataJudulhome
        binding.imgDetailGallery.setImageResource(dataGambarGallery)
        binding.txtDescDetailGallery.text= dataDeskHome
        return binding.root
    }

}