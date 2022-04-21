package com.hposedev.Furanchos2022

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.hposedev.Furanchos2022.ui.theme.FuranchoList
import com.hposedev.Furanchos2022.ui.theme.MyApplicationTheme
import com.hposedev.Furanchos2022.ui.theme.OverflowMenu
import com.hposedev.myapplication.R

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
                            TopAppBar(backgroundColor = MaterialTheme.colors.secondary, title = {
                                Text(text = stringResource(id = R.string.app_name))
                            }, actions = {
                                //This icon will be shown on the top bar, on the left of the overflow menu
                                OverflowMenu {
                                    DropdownMenuItem(onClick = { /*TODO*/ }) {
                                        Text("Favoritos")
                                    }
                                    DropdownMenuItem(onClick = { /*TODO*/ }) {
                                        Text("Salir")
                                    }
                                }
                            })
                        }) {
                        FuranchoList()
                    }

                }
            }
        }
    }
}






