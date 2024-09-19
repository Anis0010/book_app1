package com.example.recyclerviewproject

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter

object UserBindingAdapter {
    @BindingAdapter("customText")
    @JvmStatic
    fun setCustomText(view: TextView, item: String) {
        view.text = item
    }

    @BindingAdapter("customEmail")
    @JvmStatic
    fun setCustomEmail(view: TextView, item: String) {
        view.text = "by $item"
    }

    @BindingAdapter("imageResId")
    @JvmStatic
    fun setImageResId(view: ImageView, imageResId: Int) {
        view.setImageResource(imageResId)
    }

    @BindingAdapter("antImageResId")
    @JvmStatic
    fun setantImageResId(view: ImageView, antImageResId: Int) {
        view.setImageResource(antImageResId)
    }
}
