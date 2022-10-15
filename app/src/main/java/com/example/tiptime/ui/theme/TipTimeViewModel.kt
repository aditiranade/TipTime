package com.example.tiptime.ui.theme

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class TipTimeViewModel : ViewModel(){
    val _uiState = MutableStateFlow(TipTimeUiState())

    fun tip() {
        _uiState.value = TipTimeUiState(Aditi = "adorable")
    }

    fun adorableAditi(){
        print("Aditi is awesome human being...")
    }
}