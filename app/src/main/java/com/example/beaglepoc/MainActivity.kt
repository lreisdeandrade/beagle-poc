package com.example.beaglepoc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.beagle.android.components.Text
import br.com.zup.beagle.android.components.layout.Container
import br.com.zup.beagle.android.components.layout.Screen
import br.com.zup.beagle.android.utils.newServerDrivenIntent
import br.com.zup.beagle.android.utils.toView
import br.com.zup.beagle.android.view.ScreenRequest
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.core.AlignSelf
import br.com.zup.beagle.widget.core.EdgeValue
import br.com.zup.beagle.widget.core.Flex
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test_content.addView(testScreen().toView(this))

    }

    private fun testScreen() = Screen(
        child = Container(
            children = listOf(
                Text(
                    text = "Hello Beagle!"
                ).applyStyle(
                    Style(margin = EdgeValue(top = 16.unitReal()),
                        flex = Flex(alignSelf = AlignSelf.CENTER)
                    )
                ),
                Text(
                    text = "Beagle is a cross-platform framework which provides usage of the " +
                            "Server-Driven UI concept, natively in iOS, Android and Web applications. " +
                            "By using Beagle, your team could easily change application's layout and" +
                            " data by just changing backend code."
                ).applyStyle(
                    Style(margin = EdgeValue(
                        left = 16.unitReal(),
                        right = 16.unitReal(),
                        top = 20.unitReal()
                    )
                    )
                )
            )
        )
    )
}
