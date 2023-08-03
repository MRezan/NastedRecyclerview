package com.example.boighar.utils

import android.annotation.SuppressLint

class ChildItem {
    // Declaration of the variable
    private var ChildItemTitle: String? = null

    // Constructor of the class
    // to initialize the variable*
    @SuppressLint("NotConstructor")
    fun ChildItem(childItemTitle: String?) {
        ChildItemTitle = childItemTitle
    }

    // Getter and Setter method
    // for the parameter
    fun getChildItemTitle(): String? {
        return ChildItemTitle
    }

    fun setChildItemTitle(
        childItemTitle: String?
    ) {
        ChildItemTitle = childItemTitle
    }
}