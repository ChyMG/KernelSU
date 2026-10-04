package org.chymg.kernelsu.ui.util

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import top.yukonga.miuix.kmp.blur.BlendColorEntry
import top.yukonga.miuix.kmp.blur.BlurColors
import top.yukonga.miuix.kmp.blur.LayerBackdrop
import top.yukonga.miuix.kmp.blur.rememberLayerBackdrop
import top.yukonga.miuix.kmp.blur.textureBlur
import top.yukonga.miuix.kmp.shader.isRenderEffectSupported

@Composable
fun rememberBlurBackdrop(enableBlur: Boolean): LayerBackdrop? {
    if (!enableBlur || !isRenderEffectSupported()) return null
    // 这里原来先铺一层不透明的 surface：模糊背板里就只剩系统色，主页那张壁纸
    // 被整个替换掉，标题栏/底栏看上去还是跟随系统配色。改成透明，只把背后的内容
    // （含壁纸）原样收进背板去模糊。
    return rememberLayerBackdrop {
        drawRect(Color.Transparent)
        drawContent()
    }
}

@Composable
fun BlurredBar(
    backdrop: LayerBackdrop?,
    blurActive: Boolean = true,
    content: @Composable () -> Unit,
) {
    Box(
        modifier = if (blurActive && backdrop != null) {
            Modifier.textureBlur(
                backdrop = backdrop,
                shape = RectangleShape,
                blurRadius = 25f,
                colors = BlurColors(
                    blendColors = listOf(
                        // 原来往模糊结果上混 87% 的 surface，等于把系统色刷回标题栏，
                        // 毛玻璃就变成了实色条。改成全透明，标题栏只剩一层磨砂的壁纸。
                        BlendColorEntry(color = Color.Transparent),
                    ),
                ),
            )
        } else {
            Modifier
        },
    ) {
        content()
    }
}
