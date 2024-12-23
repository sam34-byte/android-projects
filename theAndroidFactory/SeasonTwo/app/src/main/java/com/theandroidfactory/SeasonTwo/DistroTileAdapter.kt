package com.theandroidfactory.SeasonTwo

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton

class DistroTileAdapter(
    private val data : ArrayList<DistroTile>,
    private val distroTileInterface: DistroTileInterface
) : RecyclerView.Adapter<DistroTileAdapter.DistroTileHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DistroTileHolder {
        return DistroTileHolder(parent)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: DistroTileHolder, position: Int) {
        holder.onBind(data[position], distroTileInterface)
    }

    inner class DistroTileHolder(parent : ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.view_holder_distro_tile, parent, false)
    ){
        private val headerImageView : ImageView = itemView.findViewById(R.id.textHeaderImageView)
        private val titleTextView : TextView = itemView.findViewById(R.id.titleTextView)
        private val descriptionTextView : TextView = itemView.findViewById(R.id.descriptionTextView)
        private val button : MaterialButton = itemView.findViewById(R.id.button)

        fun onBind(distroTile : DistroTile, distroTileInterface: DistroTileInterface){

            headerImageView.setImageResource(distroTile.headerImgResId)
            titleTextView.text = distroTile.title
            descriptionTextView.text = distroTile.description

            button.setOnClickListener{
                distroTileInterface.onLearnMoreButtonClicked(adapterPosition)
            }
        }
    }
}