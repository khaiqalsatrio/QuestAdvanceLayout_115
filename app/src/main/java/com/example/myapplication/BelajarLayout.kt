package com.example.myapplication

import android.telecom.Call.Details
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun BelajarLayout(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        HeaderSection()
        Details(
            Param = "Nama",
            Argu = "Khaiqal satrio"
        )
        Details(
            Param = "Nim",
            Argu = "20220140115"
        )
        Details(
            Param = "Prodi",
            Argu = "Teknologi Informasi"
        )
        Details(
            Param = "Fakultas",
            Argu = "Teknik"
        )
        Details(
            Param = "Universitas",
            Argu = "Universitas Muhammdaiayh Yogyakarta"
        )
        Details(
            Param = "Alamat",
            Argu = "Jl. Pahlawan No 1. Samarinda"
        )
        Details(
            Param = "Email",
            Argu = "khaiqalsatrio@gmail.com"
        )
    }
}

@Composable
fun HeaderSection(){
    Box(modifier = Modifier.fillMaxSize()
        .background(Color.LightGray))
    {
        Row(modifier = Modifier.fillMaxWidth().padding(16.dp))
        {
            Box(contentAlignment = Alignment.BottomEnd){
                Image(painter = painterResource(id = R.drawable.gambar),
                    contentDescription = null,
                    modifier = Modifier.clip(CircleShape))
                Icon(Icons.Filled.Check, contentDescription = null,
                    modifier = Modifier.size(30.dp))
            }

            Column(modifier = Modifier.padding(14.dp)) {
                Text(text = "Teknologi Informasi")
                Text(text = "Universitas Muhammadiyah Yogyakarta")
            }
        }
    }
}

@Composable
fun Details(Param : String, Argu : String){
    Column(modifier = Modifier.padding(16.dp)) {
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween){
            Text(text = Param, modifier = Modifier.weight(0.8f))
            Text(text = ": ", modifier = Modifier.weight(0.2f))
            Text(text = Argu, modifier = Modifier.weight(2f))
        }
    }
}
