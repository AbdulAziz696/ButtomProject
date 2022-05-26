package com.aziz.buttomproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.aziz.buttomproject.Model.ModelHome
import com.aziz.buttomproject.databinding.ItemRecyclerGalleryBinding
import com.aziz.buttomproject.databinding.ItemRecyclerPrestasiBinding
import com.aziz.buttomproject.databinding.RecyclerItemHomeBinding
import com.aziz.buttomproject.fragment.home.HomeFragmentDirections

class AdapterHome (private val listhome: ArrayList<ModelHome>) :
    RecyclerView.Adapter<AdapterHome.HomeViewHolder>() {
    class HomeViewHolder (var bindinghome: RecyclerItemHomeBinding) :
        RecyclerView.ViewHolder(bindinghome.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val bindinghomes =
            RecyclerItemHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeViewHolder( bindinghomes )
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val homeBinding = listhome[position]

        holder.bindinghome.txtNamaHome.text = homeBinding.namaHome
        holder.bindinghome.imgHome.setImageResource(homeBinding.gmbrHome!!)
        holder.bindinghome.txtDeskHome.text = homeBinding.deskHome


        holder.itemView.setOnClickListener { view ->
            val dariAdaterHomeKeDetailHome = HomeFragmentDirections.actionHomeFragmentToDetailHomeFragment()
//detailnamagallery = sebagai arguments untuk meneruskan data dari model namagallery
//            namagallery dari object data gallery
            dariAdaterHomeKeDetailHome.detailNamaHome =homeBinding.namaHome .toString()
            dariAdaterHomeKeDetailHome.detailDeskHome = homeBinding.deskHome.toString()
            dariAdaterHomeKeDetailHome.detailGambarHome=homeBinding.gmbrHome!!
            view.findNavController().navigate(dariAdaterHomeKeDetailHome)
        }
    }

    override fun getItemCount(): Int = listhome.size


}


