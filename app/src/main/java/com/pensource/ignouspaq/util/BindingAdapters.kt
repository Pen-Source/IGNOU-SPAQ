package com.pensource.ignouspaq.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("loadWithGlide")
fun loadWithGlide(imageView: ImageView, url: String?) {
    Glide.with(imageView).load(url).into(imageView)
}