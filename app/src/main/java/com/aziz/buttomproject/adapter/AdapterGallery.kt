package com.aziz.buttomproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.aziz.buttomproject.Model.ModelGallery
import com.aziz.buttomproject.databinding.ItemRecyclerGalleryBinding
import com.aziz.buttomproject.fragment.gallery.GalleryFragmentDirections

class AdapterGallery(private val detailList: ArrayList<ModelGallery>) :
    RecyclerView.Adapter<AdapterGallery.ViewHolder>() {
    class ViewHolder (var bindingGallery: ItemRecyclerGalleryBinding) :
        RecyclerView.ViewHolder(bindingGallery.root) {
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemRecyclerGalleryBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val gallery = detailList[position]

        holder.bindingGallery.txtNamaGallery.text = gallery.namaGallery
        holder.bindingGallery.txtDeskGallery.text = gallery.deskGallery
        holder.bindingGallery.imgGallery.setImageResource(gallery.gmbrGallery)

        holder.itemView.setOnClickListener { view ->
            val dariAdateyGaleryKeDetailGallery = GalleryFragmentDirections.actionGalleryFragmentToDetailGalleryFragment2()
//detailnamagallery = sebagai arguments untuk meneruskan data dari model namagallery
//            namagallery dari object data gallery
            dariAdateyGaleryKeDetailGallery.detailNamaGallery = gallery.namaGallery.toString()
            dariAdateyGaleryKeDetailGallery.detailDeskGallery = gallery.deskGallery.toString()
            dariAdateyGaleryKeDetailGallery.detailGambarGallery = gallery.gmbrGallery!!
            view.findNavController().navigate(dariAdateyGaleryKeDetailGallery)
        }


    }
    override fun getItemCount(): Int = detailList.size
}
