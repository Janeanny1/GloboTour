package com.example.globotour.city

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.globotour.R

class CityAdapter(val context: Context, var cityList: ArrayList<City>) : RecyclerView.Adapter<CityAdapter.CityViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.list_item_city, parent, false)
        return CityViewHolder(itemView)

    }

    override fun onBindViewHolder(cityViewHolder: CityViewHolder, position: Int) {
        val city = cityList[position]
        cityViewHolder.setData(city, position)

    }

    override fun getItemCount(): Int = cityList.size


    inner class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var currentPosition: Int = -1
        private var curentCity: City? =null

        private val txvCityName = itemView.findViewById<TextView>(R.id.txv_city_name)
        private val imvCityImage = itemView.findViewById<TextView>(R.id.imv_city)
        private val imvDelete = itemView.findViewById<TextView>(R.id.imv_delete)
        private val imvFavorute = itemView.findViewById<TextView>(R.id.imv_favorite)

        private val icFavoriteFilledImage = ResourcesCompat.getDrawable(context.resources,
            R.drawable.ic_favorite_filled, null)
        private val icFavoriteBorderedImage = ResourcesCompat.getDrawable(context.resources,
            R.drawable.ic_favorite_bordered, null)


        fun setData(city:City, position: Int){

            txvCityName.text = city.name
            setImageResource()

            if (city.isFavorite)
                setImageDrawable()
            else
                setImageDrawable()

            this.currentPosition = position
            this.curentCity= city

        }

    }

}

private fun setImageDrawable() {

}

private fun setImageResource() {

}


