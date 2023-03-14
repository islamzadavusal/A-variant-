package com.islamzada.project.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.islamzada.project.databinding.FragmentProductReviewsBinding

class ProductReviewsFragment : Fragment() {
    private lateinit var binding: FragmentProductReviewsBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentProductReviewsBinding.inflate(inflater, container, false)

        return binding.root
    }
}