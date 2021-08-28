package com.mad.mysqlroomdb.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mad.mysqlroomdb.R

class ProductAdapter (private val products : List<Product>) : RecyclerView.Adapter<ProductAdapter.myViewHolder>(){

    class myViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvName : TextView = itemView.findViewById(R.id.tvProductName)
        val tvPrice : TextView = itemView.findViewById(R.id.tvProductPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.product_item, parent,false)

        return myViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val currentProduct = products[position]
        holder.tvName.text = currentProduct.name
        holder.tvPrice.text = currentProduct.price.toString()

    }

    override fun getItemCount(): Int {
        return products.size
    }
}