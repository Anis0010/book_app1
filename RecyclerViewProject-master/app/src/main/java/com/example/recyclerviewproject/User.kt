package com.example.myapplication

import android.widget.ImageView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

data class User( val imageResId:Int,val name: String, val by: String, val antImageResId : Int) {

}

@Composable
fun UserItem(user: User) {
    Column {
        Image(
            painter = painterResource(id = user.imageResId),
            contentDescription = user.name
        )
    }
    @Composable
    fun UserItem(user: User) {
        Column {
            Image(
                painter = painterResource(id = user.antImageResId),
                contentDescription = user.name
            )
        }
    }
}
//val type : Int