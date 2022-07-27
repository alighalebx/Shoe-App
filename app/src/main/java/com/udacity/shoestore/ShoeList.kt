package com.udacity.shoestore

import android.os.Bundle
import android.view.*
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.udacity.shoestore.databinding.FragmentLoginBinding
import com.udacity.shoestore.databinding.FragmentShoeListBinding
import com.udacity.shoestore.models.Shoe
import kotlinx.android.synthetic.main.fragment_list_blocks.view.*


class ShoeList : Fragment() {
    //t
    lateinit var viewModel : AppViewModel
    lateinit var binding : FragmentShoeListBinding
    lateinit var containerr: LinearLayout
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding= DataBindingUtil.inflate(
            inflater, R.layout.fragment_shoe_list, container, false)
        viewModel = ViewModelProvider(requireActivity())[AppViewModel::class.java]
        containerr = binding.Containerlayout
        if(container!=null){
            ViewMaker(container,inflater)
        }
        setHasOptionsMenu(true)

        binding.floatingActionButton.setOnClickListener (Navigation.createNavigateOnClickListener(R.id.action_shoeList_to_shoeDetail))
        // Inflate the layout for this fragment
        val binding2: FragmentLoginBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_login, container, false
        )


        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        (activity as AppCompatActivity?)!!.supportActionBar!!.setDisplayHomeAsUpEnabled(false)
    }

    override fun onStop() {
        super.onStop()
        (activity as AppCompatActivity?)!!.supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.logout_menu, menu)


    }
//    val itemBinding = FragmentShoeListBinding.inflate())
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        requireView().findNavController()
            .navigate(ShoeListDirections.actionShoeListToLoginfragment())
        return true
    }
    private fun ViewMaker(container: ViewGroup, inflater: LayoutInflater) {
        val count = viewModel.shoeList.value?.size
        for(item in 0..count?.minus(1)!!){
            val shoe:Shoe?=viewModel.shoeList.value?.elementAt(item)
            val view:View=inflater.inflate(R.layout.fragment_list_blocks,container,false)
            view.shoe_name.text=shoe?.name
            view.company_name.text=shoe?.company
            view.shoe_size.text=shoe?.size.toString()
            view.description.text=shoe?.description
            containerr.addView(view)
        }
    }

//val itemBinding = FragmentListBlocksBinding.inflate(LayoutInflater.from(requireContext()))
//    var vieww : View? = getView(); // returns base view of the fragment
//    var viewgroup : ViewGroup = (ViewGroup) view;
//    View popup = View.inflate(viewGroup.getContext(), R.layout.someView, viewGroup);
//    (view as? ViewGroup)?.let {
//        View.inflate(context, R.layout.add_credit_card, it)
//    }
//    private fun createShoes(shoes: List<Shoe>) {
//        context?.let { context ->
//            val shoeContainer = binding.list
//            shoes.forEach { shoe ->
//                val shoeLayout = ShoeLayout(context)
//                shoeLayout.loadShoe(shoe)
//                shoeContainer.addView(shoeLayout)
//            }
//        }
//    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//
//        //binding.welcomebutton.setOnClickListener (Navigation.createNavigateOnClickListener(R.id.action_welcomeScreen_to_instructionScreen))
//        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
//                || super.onOptionsItemSelected(item)
//
//
//    }


}