package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import com.udacity.shoestore.databinding.FragmentInstructionScreenBinding

class InstructionScreen : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding : FragmentInstructionScreenBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_instruction_screen, container, false)
        binding.instructionButton.setOnClickListener (Navigation.createNavigateOnClickListener(R.id.action_instructionScreen_to_shoeList))
        return binding.root
    }

}