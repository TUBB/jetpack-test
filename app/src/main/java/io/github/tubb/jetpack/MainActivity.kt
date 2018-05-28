package io.github.tubb.jetpack

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.github.tubb.jetpack.ui.main.ViewModelActivity
import io.github.tubb.jetpack.ui.main.nav.NavActivity
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        btn_vm.setOnClickListener {
            startActivity(Intent(this, ViewModelActivity::class.java))
        }
        btn_nv.setOnClickListener {
            startActivity(Intent(this, NavActivity::class.java))
        }
    }

}
