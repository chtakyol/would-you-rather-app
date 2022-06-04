package com.oolong.would_you_rather_app.presentation.question_screen

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun QuestionScreen(
    viewModel: QuestionScreenViewModel = hiltViewModel()
) {
    viewModel.getQuestion()
}