package com.example.beaglepoc.beagle.config

import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.setup.DesignSystem
import com.example.beaglepoc.R

@BeagleComponent
class AppDesignSystem : DesignSystem() {

    override fun buttonStyle(id: String) = when (id) {
        "customButton" -> R.style.DefaultButton
        else -> R.style.DefaultButton
    }

    override fun image(id: String) = when (id) {
        "vitao" -> R.drawable.vitao
        else -> android.R.drawable.ic_menu_help
    }

    override fun textStyle(id: String): Int? = when (id) {
        "boldStyle" -> R.style.DefaultTextAppearance_CustomText
        else -> R.style.DefaultTextAppearance
    }

    override fun toolbarStyle(id: String) = when (id) {
        "customNavigation" -> R.style.DefaultToolbar_CustomToolbar
        else -> R.style.DefaultToolbar
    }
}
