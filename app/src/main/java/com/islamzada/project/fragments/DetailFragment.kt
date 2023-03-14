package com.islamzada.project.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.islamzada.project.R
import com.islamzada.project.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)

        binding.productReviews.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toReviews)
        }

        binding.reviews.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toReviews)
        }

        val productName = arguments?.getString("productName")
        val productImage = arguments?.getInt("productImage")
        val productDetails = arguments?.getString("productDetails")
        val productReviews = arguments?.getString("productReviews")

        binding.productName.text = productName
        productImage?.let { binding.productImage.setImageResource(it) }
        binding.productDetails.text = productDetails
        binding.productReviews.text = productReviews

        return binding.root
    }
}