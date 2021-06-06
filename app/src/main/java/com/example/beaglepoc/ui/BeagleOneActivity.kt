package com.example.beaglepoc.ui

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.view.BeagleActivity
import br.com.zup.beagle.android.view.ServerDrivenState
import com.example.beaglepoc.R
import kotlinx.android.synthetic.main.activity_beagle_one.*

@BeagleComponent
class BeagleOneActivity : BeagleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beagle_one)
    }

    override fun getServerDrivenContainerId() = R.id.beagleOneFl

    override fun getToolbar(): Toolbar = toolbar

    override fun onServerDrivenContainerStateChanged(state: ServerDrivenState) {
        when (state) {
            ServerDrivenState.Started -> progress_bar.visibility = View.VISIBLE
            ServerDrivenState.Finished -> progress_bar.visibility = View.GONE
            is ServerDrivenState.Error -> showToastError(state.throwable)
            else -> {
                // nothing
            }
        }
    }

    private fun showToastError(throwable: Throwable) {
        Toast.makeText(
            this,
            throwable.localizedMessage,
            Toast.LENGTH_SHORT
        ).show()
    }
}