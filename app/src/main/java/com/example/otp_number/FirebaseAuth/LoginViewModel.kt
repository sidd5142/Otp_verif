package com.example.otp_number.FirebaseAuth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.map

class LoginViewModel: ViewModel() {


    enum class AuthenticationState {
        AUTHENTICATED, UNAUTHENTICATED
    }

    val authenticationState = FirebaseUserLiveData().map { user ->
        if (user != null) {
            AuthenticationState.AUTHENTICATED
        } else {
            AuthenticationState.UNAUTHENTICATED
        }
    }
}