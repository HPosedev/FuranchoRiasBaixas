package com.hposedev.Furanchos2022.ui.theme

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hposedev.Furanchos2022.data.Furancho
import com.hposedev.Furanchos2022.data.ListaFuranchos

@OptIn(ExperimentalFoundationApi::class)
@Preview(showBackground = true)
@Composable
fun FuranchoList() {

    val furancho = ListaFuranchos.listaFuranchos
    LazyVerticalGrid(
        contentPadding = PaddingValues(4.dp),
        cells = GridCells.Fixed(2)
    ) {
        items(ListaFuranchos.listaFuranchos.size) { index ->
            FuranchoItem(furancho[index])
        }
    }
}

@Composable
fun FuranchoItem(item: Furancho) {
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
                painterResource(id = item.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize(),
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.secondary)
                .padding(8.dp),
            contentAlignment = Alignment.Center

        )
        {
            Text(
                text = item.name
            )
        }
    }
}


@Composable
fun OverflowMenu(content: @Composable () -> Unit) {
    var showMenu by remember { mutableStateOf(false) }

    IconButton(onClick = {
        showMenu = !showMenu
    }) {
        Icon(
            imageVector = Icons.Filled.Menu,
            contentDescription = null
        )
    }
    DropdownMenu(
        expanded = showMenu,
        onDismissRequest = { showMenu = false }
    ) {
        content()
    }
}
@Composable
fun navegation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "Detailed") {
        composable(route = "Detailed") {
            DetailedScreen()
        }
    }
}