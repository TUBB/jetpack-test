package io.github.tubb.jetpack

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.github.tubb.jetpack.ui.main.UserProfileFragment

class MainActivity : AppCompatActivity() {

    companion object {
        private const val DEFAULT_USER_ID = "1"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, UserProfileFragment.newInstance(DEFAULT_USER_ID))
                    .commitNow()
        }
    }

}
