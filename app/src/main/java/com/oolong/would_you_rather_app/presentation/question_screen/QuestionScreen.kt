package com.oolong.would_you_rather_app.presentation.question_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.oolong.would_you_rather_app.presentation.question_screen.components.*

@Composable
fun QuestionScreen(
    viewModel: QuestionScreenViewModel = hiltViewModel()
) {
    viewModel.getQuestion()

    Box(
        modifier = Modifier,
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .background(Color(0xFF404040))
                .padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            WouldYouRatherText()
            Box(
                contentAlignment = Alignment.Center
            ) {
                Column {
                    Spacer(Modifier.requiredHeightIn(16.dp))
                    SelectionButton(
                        text = "asd",
                        selection = 0
                    ) {
                    }
                    Spacer(Modifier.requiredHeightIn(8.dp))
                    SelectionButton(
                        text = "Asd",
                        selection = 1
                    ) {
                    }
                }
                OrText()
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewQuestionScreen() {
    QuestionScreen()
}