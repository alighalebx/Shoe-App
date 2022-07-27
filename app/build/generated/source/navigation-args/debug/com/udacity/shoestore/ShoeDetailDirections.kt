package com.udacity.shoestore

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class ShoeDetailDirections private constructor() {
  public companion object {
    public fun actionShoeDetailToShoeList(): NavDirections =
        ActionOnlyNavDirections(R.id.action_shoeDetail_to_shoeList)
  }
}
