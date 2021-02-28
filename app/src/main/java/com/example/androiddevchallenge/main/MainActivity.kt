/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.main

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.detail.DetailActivity
import com.example.androiddevchallenge.utils.Puppy
import com.example.androiddevchallenge.utils.getPuppyList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(color = Color(0xFFF9F9F9)) {
                LazyColumnItemsScrollableComponent(
                    getPuppyList()
                )
            }
        }
    }
}

// Start building your app here!
@Composable
fun LazyColumnItemsScrollableComponent(puppyList: List<Puppy>) {
    val context = LocalContext.current

    LazyColumn(modifier = Modifier.fillMaxHeight()) {
        items(
            items = puppyList,
            itemContent = { puppy ->
                val index = puppyList.indexOf(puppy)
                Card(
                    shape = RoundedCornerShape(8.dp),
                    backgroundColor = Color.White,
                    modifier = Modifier
                        .fillParentMaxWidth()
                        .padding(12.dp)
                        .clickable {
                            val intent = Intent(context, DetailActivity::class.java)
                            intent.putExtra("index", index)
                            context.startActivity(intent)
                        }
                ) {
                    Column {
                        Image(
                            painter = painterResource(puppy.dogImage),
                            contentDescription = null,
                            modifier = Modifier
                                .height(180.dp)
                                .fillMaxWidth(),
                            contentScale = ContentScale.Crop
                        )

                        Text(
                            puppy.name,
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 16.sp,
                                textAlign = TextAlign.Center
                            ),
                            modifier = Modifier.padding(16.dp, 8.dp, 0.dp, 0.dp)
                        )

                        Text(
                            puppy.breed,
                            style = TextStyle(
                                color = Color.Gray,
                                fontSize = 12.sp,
                                textAlign = TextAlign.Center
                            ),
                            modifier = Modifier.padding(16.dp, 0.dp, 0.dp, 16.dp)
                        )
                    }
                }
            }
        )
    }
}

@Preview
@Composable
fun LazyColumnItemsScrollableComponentPreview() {
    LazyColumnItemsScrollableComponent(
        getPuppyList()
    )
}
