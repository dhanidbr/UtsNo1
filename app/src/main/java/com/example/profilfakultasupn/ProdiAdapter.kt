package com.example.profilfakultasupn

import android.view.*
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.prodi_list.view.*


class ProdiAdapter (val prodiItemList: List<ProdiData>, val clickListener: (ProdiData) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.prodi_list, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder , position: Int) {
        (holder as PartViewHolder).bind(prodiItemList[position], clickListener)
    }

    override fun getItemCount() = prodiItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(prodi: ProdiData, clickListener: (ProdiData) -> Unit) {
            itemView.tv_nama.text = prodi.namaProdi.toString()
            itemView.tv_foto.setImageResource(prodi.fotoProdi)

            itemView.setOnClickListener{ clickListener(prodi)}
        }
    }
}