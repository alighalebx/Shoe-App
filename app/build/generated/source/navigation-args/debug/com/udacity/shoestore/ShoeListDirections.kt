package com.udacity.shoestore

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class ShoeListDirections private constructor() {
  public companion object {
    public fun actionShoeListToLoginfragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_shoeList_to_loginfragment)

    public fun actionShoeListToShoeDetail(): NavDirections =
        ActionOnlyNavDirections(R.id.action_shoeList_to_shoeDetail)
  }
}
