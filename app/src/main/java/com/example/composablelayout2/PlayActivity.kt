package com.example.composablelayout2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import org.w3c.dom.Text

@Preview(showBackground = true)
@Composable
fun PlayActivity(
    modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        SectionHeader()
        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = "Kepada YTH", Modifier.padding(start = 15.dp))
        Text(text = "Jod Jodi", Modifier.padding(start = 15.dp))
        Spacer(modifier = Modifier.padding(8.dp))
        MainSection(
            judulParameter = "Nama", isiParam = "Jodi"
        )
        MainSection(
            judulParameter = "Kelas", isiParam = "PKN A"
        )
        MainSection(
            judulParameter = "NIM", isiParam = "5252522252"
        )
        MainSection(
            judulParameter = "Keterangan", isiParam = "Tidak ada keterangan"
        )
    }
}

@Composable
fun SectionHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.DarkGray)){

        Row (modifier = Modifier.padding(15.dp)
        ){
            Box(contentAlignment = Alignment.BottomEnd){
                Image(painter = painterResource(id = R.drawable.logoumy),
                    contentDescription = " ",
                    Modifier.size(100.dp).clip(shape = CircleShape)
                )
                Icon(Icons.Filled.Check,
                    contentDescription = " ",
                    Modifier.padding(end = 15.dp).size(25.dp),
                    tint = Color.Red
                )
            }
            Column(Modifier.padding(15.dp)){

                Text(text = "Teknolodi Informasi",
                    color = Color.White
                )
                Spacer(Modifier.padding(3.dp))
                Text(text = "Universitas Gamping Mengidul",
                    color = Color.White
                )
            }
        }
    }
}

@Composable
fun MainSection(judulParameter:String, isiParam:String){
    Column(
        horizontalAlignment = Alignment.Start,
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text= judulParameter, modifier = Modifier.weight(0.8f))
            Text(text= ":",modifier = Modifier.weight(0.2f))
            Text(
                text= "$isiParam" ,
                modifier = Modifier.weight(2f))
        }

    }
}