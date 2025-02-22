package com.example.composecalculator.ui.views.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(label: String,
                     modifier: Modifier,
                     onClick: ()-> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.clip(shape = CircleShape).clickable { onClick() }.then(modifier)
    ){

        Text(text= label, fontSize = 36.sp, color = Color.White)
    }
}

