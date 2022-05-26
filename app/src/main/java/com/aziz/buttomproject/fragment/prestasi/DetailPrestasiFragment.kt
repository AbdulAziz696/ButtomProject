package com.aziz.buttomproject.fragment.prestasi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.aziz.buttomproject.R
import com.aziz.buttomproject.databinding.FragmentDetailPrestasiBinding
import com.aziz.buttomproject.databinding.FragmentPrestasiBinding
import com.aziz.buttomproject.fragment.gallery.DetailGalleryFragmentArgs


class DetailPrestasiFragment : Fragment() {

    private lateinit var binding: FragmentDetailPrestasiBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailPrestasiBinding.inflate(inflater, container, false)
        val dataJudulhome = DetailPrestasiFragmentArgs.fromBundle(
            arguments as Bundle
        ).detailNamaPrestasi
        val dataDeskHome = DetailPrestasiFragmentArgs.fromBundle(
            arguments as Bundle
        ).detailDeskPrestasi
        val dataGambarHome =
            DetailPrestasiFragmentArgs.fromBundle(arguments as Bundle).detailGambarPrestasi

        binding.imgBackPrestasi.setOnClickListener { View ->
            View.findNavController().navigate(R.id.action_detailPrestasiFragment_to_home)
        }

        binding.txtDetailJudulPrestasi.text = dataJudulhome
        binding.imgDetailPrestasi.setImageResource(dataGambarHome)
        binding.txtDeskPrestasi.text = dataDeskHome
        return binding.root
    }
}