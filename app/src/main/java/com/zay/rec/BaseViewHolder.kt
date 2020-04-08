package com.zay.rec

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class  BaseViewHolder<T>(view : View) : RecyclerView.ViewHolder(view){
    abstract fun setData(d : T)
}
