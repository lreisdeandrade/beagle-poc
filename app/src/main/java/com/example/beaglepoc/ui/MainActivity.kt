package com.example.beaglepoc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.beagle.android.networking.HttpAdditionalData
import br.com.zup.beagle.android.networking.HttpMethod
import br.com.zup.beagle.android.networking.RequestData
import br.com.zup.beagle.android.utils.newServerDrivenIntent
import br.com.zup.beagle.android.view.ScreenRequest
import com.example.beaglepoc.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beagle_two)
        val intent = this.newServerDrivenIntent<BeagleOneActivity>(
            RequestData(
                "/screen",
                HttpAdditionalData(HttpMethod.GET)
            )
        )
        startActivity(intent)
        finish()
    }
}