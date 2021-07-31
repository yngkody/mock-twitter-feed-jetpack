package com.example.samplejetpackcomposeapp.ui.navigation

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.samplejetpackcomposeapp.data.models.FeedModel
import com.example.samplejetpackcomposeapp.ui.view.SampleJetPackComposeAppContent
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@Composable
fun MainContent(navigateToProfile: (FeedModel) -> Unit){
    val systemUiController = rememberSystemUiController()
    val result = remember { mutableStateOf("") }
    val selectedItem = remember { mutableStateOf("upload")}
    val useDarkIcons = MaterialTheme.colors.isLight

    SideEffect {
        // Update all of the system bar colors to be transparent, and use
        // dark icons if we're in light theme
        systemUiController.setStatusBarColor(
            color = Color.Black,
            darkIcons = useDarkIcons
        )
    }
    Scaffold(
        backgroundColor = Color.LightGray,
        topBar = {
            TopAppBar(backgroundColor = Color.Black
            ) {

                IconButton(
                    onClick = {
                        result.value = "Menu clicked"
                    },
                    modifier = Modifier.weight(.5f, true)
                ) {
                    Icon(Icons.Filled.Menu, contentDescription = "", tint = Color.White)
                }

                IconButton(onClick = {
                    result.value = "Home clicked"
                },
                modifier = Modifier.weight(1f, true)){
                    Icon(Icons.Filled.Home, contentDescription = "", tint = Color.White)
                }

                IconButton(onClick = {
                    result.value = "Create clicked"
                },
                    modifier = Modifier.weight(.5f, true)){
                    Icon(Icons.Outlined.Star, contentDescription = "", tint = Color.White)
                }
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {}, backgroundColor = MaterialTheme.colors.secondary
            ) {
                Icon(Icons.Filled.Create,"", )
            }
        },
        content = {
            systemUiController.setSystemBarsColor(Color.Black, darkIcons = useDarkIcons)
            SampleJetPackComposeAppContent(navigateToProfile = navigateToProfile)
        },
        bottomBar = {
            BottomAppBar(
                backgroundColor = Color.Black,
                content = {
                    BottomNavigation( backgroundColor = Color.Black
                    ) {
                        BottomNavigationItem(
                            icon = {
                                Icon(Icons.Filled.Home, "", tint = Color.White)
                            },
                            label = { Text(text = "Home")},
                            selected = selectedItem.value == "",
                            onClick = {
                                result.value = "Home icon clicked"
                                selectedItem.value = "Home"
                            },
                            alwaysShowLabel = false
                        )

                        BottomNavigationItem(
                            icon = {
                                Icon(Icons.Outlined.Search ,  "", tint = Color.White)
                            },
                            label = { Text(text = "")},
                            selected = selectedItem.value == "Search",
                            onClick = {
                                result.value = "Search icon clicked"
                                selectedItem.value = "Search"
                            },
                            alwaysShowLabel = false
                        )

                        BottomNavigationItem(
                            icon = {
                                Icon(Icons.Outlined.Notifications , "", tint = Color.White)
                            },
                            label = { Text(text = "Notifications")},
                            selected = selectedItem.value == "Notifications",
                            onClick = {
                                result.value = "Notifications icon clicked"
                                selectedItem.value = "Notifications"
                            },
                            alwaysShowLabel = false
                        )

                        BottomNavigationItem(
                            icon = {
                                Icon(Icons.Outlined.Email , "", tint = Color.White)
                            },
                            label = { Text(text = "Favorite")},
                            selected = selectedItem.value == "favorite",
                            onClick = {
                                result.value = "Favorite icon clicked"
                                selectedItem.value = "favorite"
                            },
                            alwaysShowLabel = false
                        )
                    }
                },
            )
        },
    )
}

