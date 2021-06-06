package com.example.beaglepoc.ui.widgets

import android.view.View
import br.com.zup.beagle.android.widget.RootView
import br.com.zup.beagle.android.widget.WidgetView
import br.com.zup.beagle.annotation.RegisterWidget
import com.example.beaglepoc.ui.components.ColorSelectorView

@RegisterWidget
data class ColorSelector(
    val colors: List<String>
) : WidgetView() {

    override fun buildView(rootView: RootView): View = ColorSelectorView(
        rootView.getContext()
    ).apply {
        setColors(colors)
    }
}
