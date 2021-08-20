package com.varabyte.konsole.text

import com.varabyte.konsole.ansi.AnsiCodes
import com.varabyte.konsole.ansi.AnsiKonsoleCommand
import com.varabyte.konsole.core.KonsoleState

internal val RESET_COMMAND = object : AnsiKonsoleCommand(AnsiCodes.RESET) {
    override fun updateState(state: KonsoleState) {
        state.clear()
    }
}
