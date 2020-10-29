package com.pensource.ignouspaq.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.pensource.ignouspaq.data.model.GeneralCategory
import com.pensource.ignouspaq.databinding.ItemHomeListBinding

class HomeListAdapter : ListAdapter<GeneralCategory, HomeListViewHolder>(HomeListDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeListViewHolder {
        return HomeListViewHolder(
            ItemHomeListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: HomeListViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class HomeListViewHolder(
    private val binding: ItemHomeListBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(generalCategory: GeneralCategory) {
        binding.category = generalCategory
        binding.executePendingBindings()
    }
}

open class HomeListDiffUtil : DiffUtil.ItemCallback<GeneralCategory>() {
    override fun areItemsTheSame(oldItem: GeneralCategory, newItem: GeneralCategory): Boolean {
        return oldItem.uuid == newItem.uuid
    }

    override fun areContentsTheSame(oldItem: GeneralCategory, newItem: GeneralCategory): Boolean {
        return oldItem == newItem
    }
}