package com.example.myhomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myhomework.databinding.FragmentProfileBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private var binding: FragmentProfileBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)

        binding?.run{
            btnToSecretFromProfile.setOnClickListener{
                findNavController().navigate(
                R.id.action_profileFragment_to_secretFragment,
                SecretFragment.createBundle("From Profile Segment"))
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}