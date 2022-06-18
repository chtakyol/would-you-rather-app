package com.oolong.would_you_rather_app.presentation.question_screen.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SelectionButton(
    modifier: Modifier = Modifier,
    text: String = "",
    selection: Int = 0,
    onClick: () -> Unit
) {
    val boxBackgroundColor = if (selection == 0) {
        Color(0xFFD32323)
    } else {
        Color(0xFF44B3E0)
    }
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(234.dp)
            .clip(RoundedCornerShape(12.dp))
            .clickable {
                onClick()
            },
        contentAlignment = Alignment.Center,
    ) {
        Canvas(modifier = modifier.fillMaxSize()) {
            drawRoundRect(
                color = boxBackgroundColor,
                cornerRadius = CornerRadius(16f,16f)
            )
        }
        Text(
            text = text,
            color = Color.White,
            fontSize = 24.sp
        )
    }
}

@Preview
@Composable
fun PreviewSelectionButton(){
    SelectionButton(
        text = "Try"
    ) {

    }
}