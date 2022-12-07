package com.alvaroherrera.trabajorickandmortyapp.ui.detail

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.alvaroherrera.trabajorickandmortyapp.data.model.RickAndMorty

class DetailViewModel(@Suppress("UNUSED_PARAMETER")rickAndMorty: RickAndMorty, app: Application) : AndroidViewModel(app) {

    private val _selectedItem = MutableLiveData<RickAndMorty>()
    val selectedItem: LiveData<RickAndMorty>
        get() = _selectedItem

    init {
        _selectedItem.value = rickAndMorty
    }


}