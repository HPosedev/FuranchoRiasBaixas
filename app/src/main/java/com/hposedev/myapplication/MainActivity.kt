package com.hposedev.myapplication

import android.os.Bundle
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.core.content.res.ResourcesCompat
import com.hposedev.myapplication.ui.theme.MyApplicationTheme
import com.hposedev.myapplication.ui.theme.Shapes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Scaffold(
                        topBar = {
                            TopAppBar (title = {Text(text = stringResource(id = R.string.app_name)) })}) {
                                FuranchoList()
                    }

                }
            }
        }
    }
}



@OptIn(ExperimentalFoundationApi::class)
@Preview(showBackground = true)
@Composable
fun FuranchoList(){
    val furancho = ListaFuranchos.listaFuranchos
    LazyVerticalGrid(
        contentPadding = PaddingValues(4.dp),
        cells = GridCells.Fixed(2)){
            items(ListaFuranchos.listaFuranchos.size){index ->
                FuranchoItem(furancho[index])
            }
    }
}

@Composable
fun FuranchoItem(item:Furancho) {
    Column(modifier = Modifier
        .padding(4.dp)
        .clip(RoundedCornerShape(10.dp))){
        Box(
            modifier = Modifier
                .height(170.dp)
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
                .padding(16.dp),
            contentAlignment = Alignment.Center

        )
        {
            Text(
                text = item.name )
        }
    }
}

