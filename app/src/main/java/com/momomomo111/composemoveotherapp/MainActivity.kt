package com.momomomo111.composemoveotherapp

import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.momomomo111.composemoveotherapp.domain.AppData
import com.momomomo111.composemoveotherapp.ui.screen.HomeScreen
import com.momomomo111.composemoveotherapp.ui.theme.ComposeMoveOtherAppTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("QueryPermissionsNeeded")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val flags =
            PackageManager.MATCH_UNINSTALLED_PACKAGES or PackageManager.MATCH_DISABLED_COMPONENTS
        val packageManager = packageManager
        val installedAppList = packageManager.getInstalledApplications(flags)

        val appDataList = installedAppList.map {
            AppData(
                label = it.loadLabel(packageManager).toString(),
                icon = it.loadIcon(packageManager),
                packageName = it.packageName
            )
        }

        Log.d("appNum", appDataList.size.toString())

        setContent {
            ComposeMoveOtherAppTheme {
                HomeScreen(appDataList)
            }
        }
    }
}
