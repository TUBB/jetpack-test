package io.github.tubb.jetpack.ui.main.nav

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import io.github.tubb.jetpack.R
import kotlinx.android.synthetic.main.fragment_3.*

class Fragment3: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_page2.setOnClickListener {
            Navigation.findNavController(it).navigateUp()
        }
    }
}