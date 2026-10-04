package org.chymg.kernelsu.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import org.chymg.kernelsu.R

/**
 * Full-bleed app wallpaper.
 *
 * Drawn once behind the whole navigation host, so every page shares the same
 * background. Page level scaffolds must stay transparent for it to be visible.
 */
@Composable
fun KsuWallpaper(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.ksu_wallpaper),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = modifier.fillMaxSize(),
    )
}
