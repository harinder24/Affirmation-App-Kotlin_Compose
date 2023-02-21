package com.example.affirmation_app_kotlin_compose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.affirmation_app_kotlin_compose.data.AffirmationData
import com.example.affirmation_app_kotlin_compose.data.AffirmationList
import com.example.affirmation_app_kotlin_compose.ui.theme.AffirmationAppKotlin_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AffirmationAppKotlin_ComposeTheme {
               AffirmationApp()
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun AffirmationApp(){

    AffirmationList(AffirmationList.getData())
}

@Composable
fun AffirmationList(listOfAffirmation: List<AffirmationData>){
   LazyColumn{
       items(listOfAffirmation){ item ->  
       LoadUI(quote = item.quote, pic = item.pic)
           
       }
   }
}

@Composable
fun LoadUI(@StringRes quote: Int, @DrawableRes pic: Int){
    Card(modifier = Modifier.padding(all = 8.dp), elevation = 4.dp) {
        Column {
            Image(painter = painterResource(id = pic), contentDescription = stringResource(id = quote), modifier = Modifier
                .fillMaxWidth()
                .height(196.dp), contentScale = ContentScale.Crop)
            Text(text = stringResource(id = quote),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.h6)
        }
    }
}







