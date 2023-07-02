package com.example.myhomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myhomework.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment(R.layout.fragment_settings) {
    private var binging: FragmentSettingsBinding? = null;

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binging = FragmentSettingsBinding.bind(view)

        binging?.run {
            btnToSecretFromSettings.setOnClickListener{
                findNavController().navigate(
                R.id.action_settingsFragment_to_secretFragment,
                SecretFragment.createBundle("From settings Fragment"))
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binging = null
    }
}