package com.oolong.would_you_rather_app.presentation.question_screen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oolong.would_you_rather_app.data.remote.WouldYouRatherApi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuestionScreenViewModel @Inject constructor(
    private val wouldYouRatherApi: WouldYouRatherApi
): ViewModel(){

    init {
        getQuestion()
    }

    fun getQuestion() {
        viewModelScope.launch {
            val q = wouldYouRatherApi.getQuestion()
            Log.d("QuestionScreen", "id: ${q.id}")
            Log.d("QuestionScreen", "data: ${q.data}")
        }
    }
}