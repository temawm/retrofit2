package com.example.retrofit_app.retrofit

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter


@Composable
fun ImageScreen() {
        val imageUrl = "http://books.google.com/books/content?id=lPMnDAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api"
    val painter = rememberImagePainter(
            data = (imageUrl)
    )

    Image(
        painter = painter,
        contentDescription = null,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentScale = ContentScale.Crop
    )
}
