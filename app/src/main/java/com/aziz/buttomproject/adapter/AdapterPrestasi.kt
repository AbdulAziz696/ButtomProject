package com.aziz.buttomproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.aziz.buttomproject.Model.ModelPrestasi
import com.aziz.buttomproject.databinding.ItemRecyclerPrestasiBinding
import com.aziz.buttomproject.fragment.prestasi.PrestasiFragmentDirections

class AdapterPrestasi (private val detailList: ArrayList<ModelPrestasi>) :
    RecyclerView.Adapter<AdapterPrestasi.ViewHolder>() {
    class ViewHolder (var bindingGallery: ItemRecyclerPrestasiBinding) :
        RecyclerView.ViewHolder(bindingGallery.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemRecyclerPrestasiBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val prestasi = detailList[position]

        holder.bindingGallery.txtNamaPrestasi.text = prestasi.namaPrestasi
        holder.bindingGallery.txtDeskPrestasi.text = prestasi.deskPrestasi
        holder.bindingGallery.imgPrestasi.setImageResource(prestasi.gmbrPrestasi)

        holder.itemView.setOnClickListener { view ->
            val dariAdaterPrestasiKeDetailPrestasi = PrestasiFragmentDirections.actionPrestasiFragmentToDetailPrestasiFragment()
//detailnamagallery = sebagai arguments untuk meneruskan data dari model namagallery
//            namagallery dari object data gallery
            dariAdaterPrestasiKeDetailPrestasi.detailNamaPrestasi = prestasi.namaPrestasi.toString()
            dariAdaterPrestasiKeDetailPrestasi.detailDeskPrestasi = prestasi.deskPrestasi.toString()
            dariAdaterPrestasiKeDetailPrestasi.detailGambarPrestasi = prestasi.gmbrPrestasi!!
            view.findNavController().navigate(dariAdaterPrestasiKeDetailPrestasi)
        }


    }

    override fun getItemCount(): Int = detailList.size

    }
