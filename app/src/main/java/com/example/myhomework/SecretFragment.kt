package com.example.myhomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myhomework.databinding.FragmentSecretBinding
import com.google.android.material.snackbar.Snackbar

class SecretFragment : Fragment(R.layout.fragment_secret) {
    private var binding: FragmentSecretBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecretBinding.bind(view)
        val className = arguments?.getString(ARG_CLASS_NAME)
        Snackbar.make(binding?.root!!,className.toString(),Snackbar.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    companion object{

        private const val ARG_CLASS_NAME = "ARG_CLASS_NAME";

        fun createBundle(nameClass: String) : Bundle{
            var bundle = Bundle();
            bundle.putString(ARG_CLASS_NAME, nameClass)
            return bundle
        }
    }
}