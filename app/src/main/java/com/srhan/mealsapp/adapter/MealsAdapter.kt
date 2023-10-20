package com.srhan.mealsapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.srhan.domain.models.Category
import com.srhan.mealsapp.databinding.CategoryItemBinding

class MealsAdapter(private var categoryList: List<Category>) :
    RecyclerView.Adapter<MealsAdapter.MealsViewHolder>() {

    class MealsViewHolder(private val itemBinding: CategoryItemBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(category: Category) {
            itemBinding.categoryDesTv.text = category.strCategoryDescription
            itemBinding.categoryNameTv.text = category.strCategory
            Glide.with(itemBinding.root.context).load(category.strCategoryThumb)
                .into(itemBinding.categoryIv)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealsViewHolder {
        val itemBinding =
            CategoryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MealsViewHolder(itemBinding)
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }

    override fun onBindViewHolder(holder: MealsViewHolder, position: Int) {
        holder.bind(categoryList[position])
    }
}