package com.momomomo111.composemoveotherapp.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.drawablepainter.rememberDrawablePainter
import com.momomomo111.composemoveotherapp.AppData
import com.momomomo111.composemoveotherapp.R

@Composable
fun HomeScreen(appDataList: List<AppData>) {
    val dividerColor = if (isSystemInDarkTheme()) Color.White else Color.Black
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        LazyColumn(
            modifier = Modifier.padding(8.dp)
        ) {
            items(appDataList) { data ->
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = rememberDrawablePainter(drawable = data.icon),
                        contentDescription = null,
                        modifier = Modifier.size(64.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column {
                        Text(text = data.label, fontWeight = FontWeight.Bold)
                        Text(text = data.packageName)
                    }
                }
                Spacer(modifier = Modifier.height(4.dp))
                Divider(color = dividerColor)
                Spacer(modifier = Modifier.height(4.dp))
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun PreviewHomeScreen() {
    val context = LocalContext.current
    HomeScreen(
        mutableListOf(
            AppData(
                label = "test1",
                icon = context.getDrawable(R.drawable.ic_launcher_foreground)!!,
                packageName = "com.hoge.test1"
            ),
            AppData(
                label = "test2",
                icon = context.getDrawable(R.drawable.ic_launcher_foreground)!!,
                packageName = "com.hoge.test2"
            ),
            AppData(
                label = "test3",
                icon = context.getDrawable(R.drawable.ic_launcher_foreground)!!,
                packageName = "com.hoge.test3"
            )
        )
    )
}
