package com.udacity.shoestore

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class WelcomeScreenDirections private constructor() {
  public companion object {
    public fun actionWelcomeScreenToInstructionScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_welcomeScreen_to_instructionScreen)
  }
}
