package com.taghavi.streamchat.ui.auth

import android.os.Bundle
import android.view.View
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import com.taghavi.streamchat.R
import com.taghavi.streamchat.databinding.FragmentSetupProfileBinding

class SetupProfileFragment : Fragment(R.layout.fragment_setup_profile) {
    private lateinit var binding: FragmentSetupProfileBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSetupProfileBinding.bind(view)

        binding.buttonNext.isEnabled = false
        binding.editTextName.addTextChangedListener {
            binding.buttonNext.isEnabled = it?.isNotEmpty() == true
        }

        binding.buttonNext.setOnClickListener {
            setupProfile()
        }
    }

    private fun setupProfile(){

    }
}