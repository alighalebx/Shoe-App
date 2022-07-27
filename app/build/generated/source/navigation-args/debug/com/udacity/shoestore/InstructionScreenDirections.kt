package com.udacity.shoestore

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class InstructionScreenDirections private constructor() {
  public companion object {
    public fun actionInstructionScreenToShoeList(): NavDirections =
        ActionOnlyNavDirections(R.id.action_instructionScreen_to_shoeList)
  }
}
