package io.github.tubb.jetpack.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.github.tubb.jetpack.R

class ViewModelActivity: AppCompatActivity() {
    companion object {
        private const val DEFAULT_USER_ID = "1"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_model_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, UserProfileFragment.newInstance(DEFAULT_USER_ID))
                    .commitNow()
        }
    }
}