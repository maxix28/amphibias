package com.example.amphibias


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.amphibias.network.AmpApi
import kotlinx.coroutines.launch

class AmpViewModel : ViewModel(){
    var UiState : String by mutableStateOf("")
init {
    getAmpInfo()
}
    private  fun getAmpInfo(){
        viewModelScope.launch {
            val listResult = AmpApi.retrofitServive.getAmpihibias()
            UiState = listResult
        }
    }
}