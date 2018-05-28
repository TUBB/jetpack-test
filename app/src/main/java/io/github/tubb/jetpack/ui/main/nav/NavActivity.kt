package io.github.tubb.jetpack.ui.main.nav

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.Navigation.findNavController
import io.github.tubb.jetpack.R

class NavActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nav_activity)

    }

    override fun onSupportNavigateUp(): Boolean =  findNavController(this, R.id.nav_host_fragment).navigateUp()
}