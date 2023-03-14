package com.islamzada.project.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.islamzada.project.R
import com.islamzada.project.databinding.FragmentProductsBinding

class ProductsFragment : Fragment() {
    private lateinit var binding: FragmentProductsBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentProductsBinding.inflate(inflater, container, false)

        binding.productButton.setOnClickListener {
            val bundle = Bundle().apply {
                putString("productName", "Samsung Galaxy A32 5G")
                putInt("productImage", R.drawable.product_image)
                putString("productDetails", "Product Details: \n \nThe Samsung Galaxy A32 5G is a mid-range smartphone that was released in January 2021. It features a 6.5-inch TFT display with a resolution of 720 x 1600 pixels. The device is powered by a MediaTek Dimensity 720 processor and comes with 4GB, 6GB, or 8GB of RAM, depending on the variant. It also has a 5,000mAh battery that supports 15W fast charging, and runs on Android 11 with Samsung's One UI 3.0 interface. In terms of cameras, the Samsung A32 5G has a quad-camera setup on the back, consisting of a 48-megapixel primary sensor, an 8-megapixel ultra-wide-angle lens, a 5-megapixel macro lens, and a 2-megapixel depth sensor. On the front, it has a 13-megapixel selfie camera. One of the key features of the Samsung A32 5G is its support for 5G connectivity, which enables faster download and upload speeds compared to 4G LTE. Other features of the Samsung A32 5G include a side-mounted fingerprint sensor, face unlock, dual-SIM support, and expandable storage up to 1TB via a microSD card.")
                putString("productReviews", "Product Reviews: \n \nGreat phone! \nAmazing camera quality! \nVauuuu ")
            }
            findNavController().navigate(R.id.toProduct, bundle)
        }

        return binding.root
    }
}