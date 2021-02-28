package com.example.androiddevchallenge.detail

import android.os.Bundle
import android.widget.Scroller
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.detail.ui.theme.AndroidDevChallengeTheme
import com.example.androiddevchallenge.utils.Puppy
import com.example.androiddevchallenge.utils.getDescription
import com.example.androiddevchallenge.utils.getPuppyByIndex

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val index = intent.getIntExtra("index", 0)
        setContent {
            AndroidDevChallengeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = Color(0xFFF9F9F9), modifier = Modifier.fillMaxHeight()) {
                    PuppyDetails(getPuppyByIndex(index))
                }
            }
        }
    }
}

@Composable
fun PuppyDetails(puppy: Puppy) {
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {
            Image(
                painter = painterResource(puppy.dogImage),
                contentDescription = null,
                modifier = Modifier
                    .height(180.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )

            Row(modifier = Modifier.padding(16.dp, 8.dp, 0.dp, 8.dp)) {
                Text(
                    "Name: ", style = TextStyle(
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                )

                Text(
                    puppy.name, style = TextStyle(
                        color = Color.Black,
                        fontSize = 16.sp,
                    ), modifier = Modifier.padding(8.dp, 0.dp, 0.dp, 0.dp)
                )
            }

            Row(modifier = Modifier.padding(16.dp, 0.dp, 0.dp, 8.dp)) {
                Text(
                    "Breed: ", style = TextStyle(
                        color = Color.Gray,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                )

                Text(
                    puppy.breed, style = TextStyle(
                        color = Color.Gray,
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center
                    ), modifier = Modifier.padding(8.dp, 0.dp, 0.dp, 0.dp)
                )
            }

            Row(modifier = Modifier.padding(16.dp, 0.dp, 0.dp, 8.dp)) {
                Text(
                    "Age: ", style = TextStyle(
                        color = Color.Gray,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                )

                Text(
                    puppy.age, style = TextStyle(
                        color = Color.Gray,
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center
                    ), modifier = Modifier.padding(8.dp, 0.dp, 0.dp, 0.dp)
                )
            }

            Row(modifier = Modifier.padding(16.dp, 0.dp, 0.dp, 8.dp)) {
                Text(
                    "Description: ", style = TextStyle(
                        color = Color.Gray,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                )

                Text(
                    getDescription(), style = TextStyle(
                        color = Color.Gray,
                        fontSize = 12.sp,
                        textAlign = TextAlign.Justify
                    ), modifier = Modifier.padding(8.dp, 0.dp, 16.dp, 0.dp)
                )
            }
        }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidDevChallengeTheme {
        PuppyDetails(getPuppyByIndex(0))
    }
}