package com.example.imageviewer.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.imageviewer.data.ImageRepository
import com.example.imageviewer.model.ImageItem

class GalleryViewModel : ViewModel() {

    private val repository = ImageRepository()

    private val _images = MutableLiveData<List<ImageItem>>()
    val images: LiveData<List<ImageItem>> = _images

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    init {
        loadImages()
    }

    private fun loadImages() {
        _isLoading.value = true
        _images.value = repository.getAllImages()
        _isLoading.value = false
    }

    fun refreshImages() {
        loadImages()
    }
}