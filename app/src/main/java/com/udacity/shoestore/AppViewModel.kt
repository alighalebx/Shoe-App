package com.udacity.shoestore

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class AppViewModel : ViewModel(){
     private val _shoes = MutableLiveData<MutableList<Shoe>>(mutableListOf())
     val shoeList: MutableLiveData<MutableList<Shoe>>
     get() = _shoes
     val shoe = MutableLiveData(Shoe("",.0,"",""))
     fun addshoe(){


          _shoes.value?.add(  Shoe(shoe.value!!.name, shoe.value!!.size, shoe.value!!.company,
               shoe.value!!.description))
          Log.d("aaaaaaaaa", shoeList.value.toString())
     }
}