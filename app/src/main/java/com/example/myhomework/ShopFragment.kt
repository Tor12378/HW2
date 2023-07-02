package com.example.myhomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myhomework.databinding.FragmentShopBinding

class ShopFragment : Fragment(R.layout.fragment_shop) {
    private var binding: FragmentShopBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentShopBinding.bind(view)
        binding?.run {
            btnFromShopToSecret.setOnClickListener{
                findNavController().navigate(
                    R.id.action_shopFragment_to_secretFragment,
                    SecretFragment.createBundle("From Shop!")
                )
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}