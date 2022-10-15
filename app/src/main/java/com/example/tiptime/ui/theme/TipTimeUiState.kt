package com.example.tiptime.ui.theme

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class TipTimeUiState(
    val _uiState: MutableStateFlow<TipTimeUiState> = MutableStateFlow(TipTimeUiState()),
    val uiState: StateFlow<TipTimeUiState> = _uiState.asStateFlow(),
    val Aditi: String = "cute"
)
