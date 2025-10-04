package com.example.imageviewer.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.imageviewer.data.ImageRepository
import com.example.imageviewer.model.ImageItem

class DetailViewModel : ViewModel() {

    private val repository = ImageRepository()

    private val _imageItem = MutableLiveData<ImageItem?>()
    val imageItem: LiveData<ImageItem?> = _imageItem

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    fun loadImage(imageId: Int) {
        _isLoading.value = true
        _imageItem.value = repository.getImageById(imageId)
        _isLoading.value = false
    }
}