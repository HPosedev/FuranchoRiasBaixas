package com.hposedev.furanchos2022.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.hposedev.furanchos2022.R


@Preview
@Composable
fun DetailedScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .padding(4.dp)
            .clip(RoundedCornerShape(10.dp))
    ) {
        Box(
            modifier = Modifier
                .height(160.dp)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.a_de_juan ),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize(),
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.secondary)
                .padding(16.dp),
            contentAlignment = Alignment.Center

        )
        {
            Text(
                text = "item.name"
            )
        }
    }
}