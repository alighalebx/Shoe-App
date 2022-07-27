package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.udacity.shoestore.databinding.FragmentShoeDetailBinding
import com.udacity.shoestore.databinding.FragmentShoeListBinding

class ShoeDetail : Fragment() {

    lateinit var viewModel : AppViewModel
    lateinit var binding : FragmentShoeDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_shoe_detail, container, false
        )
        viewModel = ViewModelProvider(requireActivity())[AppViewModel::class.java]

        // Inflate the layout for this fragment

        binding.lifecycleOwner=viewLifecycleOwner
        binding.viewModelshoe = viewModel
        binding.save.setOnClickListener {view ->
            viewModel.addshoe()
            view.findNavController().navigate(R.id.action_shoeDetail_to_shoeList)

        }
        binding.cancel.setOnClickListener (Navigation.createNavigateOnClickListener(R.id.action_shoeDetail_to_shoeList))
        return binding.root

    }

}