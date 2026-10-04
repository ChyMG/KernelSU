package org.chymg.kernelsu.ui.component.uninstalldialog

import androidx.compose.runtime.Composable
import org.chymg.kernelsu.ui.LocalUiMode
import org.chymg.kernelsu.ui.UiMode

@Composable
fun UninstallDialog(
    show: Boolean,
    onDismissRequest: () -> Unit
) {
    when (LocalUiMode.current) {
        UiMode.Miuix -> UninstallDialogMiuix(show, onDismissRequest)
        UiMode.Material -> UninstallDialogMaterial(show, onDismissRequest)
    }
}
