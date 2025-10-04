package com.example.imageviewer.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import coil.load
import com.example.imageviewer.R
import com.example.imageviewer.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    private val viewModel: DetailViewModel by viewModels()
    private val args: DetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupToolbar()
        setupImageZoom()
        observeViewModel()

        // 加载图片数据
        viewModel.loadImage(args.imageId)
    }

    private fun setupToolbar() {
        binding.toolbar.setNavigationOnClickListener {
            findNavController().navigateUp()
        }
    }

    private fun setupImageZoom() {
        // 添加图片点击缩放功能
        var isZoomed = false
        binding.imageViewDetail.setOnClickListener {
            if (isZoomed) {
                binding.imageViewDetail.scaleType = android.widget.ImageView.ScaleType.FIT_CENTER
                isZoomed = false
            } else {
                binding.imageViewDetail.scaleType = android.widget.ImageView.ScaleType.CENTER_CROP
                isZoomed = true
            }
        }
    }

    private fun observeViewModel() {
        viewModel.imageItem.observe(viewLifecycleOwner) { imageItem ->
            imageItem?.let {
                displayImageDetails(it)
            }
        }

        viewModel.isLoading.observe(viewLifecycleOwner) { isLoading ->
            binding.progressBar.isVisible = isLoading
        }
    }

    private fun displayImageDetails(imageItem: com.example.imageviewer.model.ImageItem) {
        binding.apply {
            // 设置标题
            toolbar.title = imageItem.title

            // 加载大图
            imageViewDetail.load(imageItem.imageResId) {
                crossfade(true)
                placeholder(R.drawable.placeholder_image)
                error(R.drawable.error_image)
                listener(
                    onStart = { progressBar.isVisible = true },
                    onSuccess = { _, _ -> progressBar.isVisible = false },
                    onError = { _, _ -> progressBar.isVisible = false }
                )
            }

            // 设置详细信息
            textTitle.text = imageItem.title
            textCategory.text = getString(R.string.category, imageItem.category)
            textPhotographer.text = getString(R.string.director, imageItem.director)
            textDescription.text = imageItem.description
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}