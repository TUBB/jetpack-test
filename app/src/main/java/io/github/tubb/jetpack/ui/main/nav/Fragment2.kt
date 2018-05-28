package io.github.tubb.jetpack.ui.main.nav

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import io.github.tubb.jetpack.R
import kotlinx.android.synthetic.main.fragment_2.*

class Fragment2: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_page1.setOnClickListener {
            Navigation.findNavController(it).navigateUp()
        }
        btn_page3.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_page3)
        }
    }
}