package com.arboleda.footballapp

import androidx.compose.ui.window.ComposeUIViewController
import com.arboleda.footballapp.di.initKoin

fun MainViewController() = ComposeUIViewController(configure = { initKoin() }) { App() }
