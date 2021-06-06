package com.example.beaglepoc.beagle.config

import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.setup.DesignSystem
import com.example.beaglepoc.R

@BeagleComponent
class AppDesignSystem : DesignSystem() {

    override fun buttonStyle(id: String) = when (id) {
        "customButton" -> R.style.DefaultButton_CustomButton
        else -> R.style.DefaultButton
    }

    override fun image(id: String) = when (id) {
        "back" -> R.drawable.ic_back
        "bag" -> R.drawable.ic_bag
        "check" -> R.drawable.ic_check
        "red_heart" -> R.drawable.ic_red_heart
        "heart" -> R.drawable.ic_heart
        "plus" -> R.drawable.ic_plus
        "question" -> R.drawable.ic_question
        "shopping" -> R.drawable.ic_shopping
        "tshirt" -> R.drawable.tshirt
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
