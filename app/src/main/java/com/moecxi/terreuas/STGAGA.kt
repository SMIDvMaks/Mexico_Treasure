package com.moecxi.terreuas

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp


class STGAGA : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(1024)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.Gray), verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Mexico Treasure", fontSize = 25.sp)

                Button(onClick = { Sta() }) {
                    Text(
                        text = "Start Game", modifier = Modifier.fillMaxWidth(0.3f)
                    )
                }
                Button(onClick = {Starq()})  {
                    Text(
                        text = "Privacy", modifier = Modifier.fillMaxWidth(0.3f)
                    )
                }
                Button(onClick = { Stat() }) {
                    Text(
                        text = "Rules", modifier = Modifier.fillMaxWidth(0.3f)
                    )
                }
                Button(onClick = { finishAffinity() }) {
                    Text(
                        text = "Exit", modifier = Modifier.fillMaxWidth(0.3f)
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.table),
                    contentDescription = "table"
                )
            }
        }
    }

    fun Sta() {
        val intent = Intent(this@STGAGA, AAG::class.java)
        startActivity(intent)
    }

    fun Stat() {
        val insha = Intent(this, Rulele::class.java)
        startActivity(insha)
    }
    fun Starq() {
        val uqus = Intent(this, PRIVAVI::class.java)
        startActivity(uqus)
    }

}



