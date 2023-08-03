package com.example.boighar.utils

import android.annotation.SuppressLint

class ParentItem {

    // Declaration of the variables
    private var ParentItemTitle: String? = null
    private var ChildItemList: List<ChildItem>? = null

    // Constructor of the class
    // to initialize the variables
    @SuppressLint("NotConstructor")
    fun ParentItem(
        ParentItemTitle: String?,
        ChildItemList: List<ChildItem>?
    ) {
        this.ParentItemTitle = ParentItemTitle
        this.ChildItemList = ChildItemList
    }

    // Getter and Setter methods
    // for each parameter
    fun getParentItemTitle(): String? {
        return ParentItemTitle
    }

    fun setParentItemTitle(
        parentItemTitle: String?
    ) {
        ParentItemTitle = parentItemTitle
    }

    fun getChildItemList(): List<ChildItem>? {
        return ChildItemList
    }

    fun setChildItemList(
        childItemList: List<ChildItem>?
    ) {
        ChildItemList = childItemList
    }
}