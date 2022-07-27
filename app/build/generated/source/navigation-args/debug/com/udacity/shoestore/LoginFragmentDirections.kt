package com.udacity.shoestore

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class LoginFragmentDirections private constructor() {
  public companion object {
    public fun actionLoginFragmentToWelcomeScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_welcomeScreen)
  }
}
