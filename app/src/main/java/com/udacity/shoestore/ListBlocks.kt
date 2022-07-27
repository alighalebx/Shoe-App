package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.udacity.shoestore.databinding.FragmentListBlocksBinding
import com.udacity.shoestore.databinding.FragmentShoeListBinding


class ListBlocks : Fragment() {

    lateinit var binding : FragmentListBlocksBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_blocks, container, false)
    }

}