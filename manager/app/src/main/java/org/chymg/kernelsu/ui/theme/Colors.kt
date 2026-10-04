package org.chymg.kernelsu.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb

/**
 * 全局文字色。壁纸是深色画面，正文/标题统一走淡蓝，跟随主题的 on* 角色只覆盖
 * 「画在页面背景上的文字」；按钮、色块上的文字仍用各自的 on*Container。
 */
val GlobalTextColor = Color(0xFF9ECBFF)

val keyColorOptions = listOf(
    Color(0xFFF44336).toArgb(),
    Color(0xFFE91E63).toArgb(),
    Color(0xFF9C27B0).toArgb(),
    Color(0xFF673AB7).toArgb(),
    Color(0xFF3F51B5).toArgb(),
    Color(0xFF2196F3).toArgb(),
    Color(0xFF00BCD4).toArgb(),
    Color(0xFF009688).toArgb(),
    Color(0xFF4FAF50).toArgb(),
    Color(0xFFFFEB3B).toArgb(),
    Color(0xFFFFC107).toArgb(),
    Color(0xFFFF9800).toArgb(),
    Color(0xFF795548).toArgb(),
    Color(0xFF607D8F).toArgb(),
    Color(0xFFFF9CA8).toArgb(),
)
