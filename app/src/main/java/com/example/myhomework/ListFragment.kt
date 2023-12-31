package com.example.myhomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myhomework.databinding.FragmentListBinding

class ListFragment : Fragment(R.layout.fragment_list) {
    private var binding: FragmentListBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentListBinding.bind(view)

        binding?.run {
            btnToSecretSegment.setOnClickListener{
                findNavController().navigate(
                    R.id.action_listFragment_to_secretFragment,
                    SecretFragment.createBundle("From ListFragment!")
                )
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}