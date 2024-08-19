package com.example.multipageapp

import Sayfa_A
import Sayfa_X
import android.text.Layout.Alignment
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

class Anasayfa :Screen {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        Scaffold(topBar = { TopAppBar(title = { Text(text = "Anasayfa") }) }) { paddingValues ->


            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally

            ) {

                Button(onClick = {

                    navigator.push(Sayfa_A())

                }) {
                    Text(text = "Git > A")

                }
                Button(onClick = {

                    navigator.push(Sayfa_X())

                }) {
                    Text(text = "Git > X")

                }

            }


        }
    }



    }




