package io.github.tubb.jetpack.ui.main

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.tubb.jetpack.R
import kotlinx.android.synthetic.main.user_profile_fragment.*

class UserProfileFragment : Fragment() {

    companion object {
        private const val TAG = "JETPACK"
        private const val UID_KEY = "uid"
        fun newInstance(userId: String): UserProfileFragment {
            val fragment = UserProfileFragment();
            val bundle = Bundle();
            bundle.putString(UID_KEY, userId);
            fragment.arguments = bundle;
            return fragment;
        }
    }

    private lateinit var viewModel: UserProfileViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.user_profile_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val userId:String? = arguments?.getString(UID_KEY)
        viewModel = ViewModelProviders.of(this).get(UserProfileViewModel::class.java)
        viewModel.init(userId!!);
        viewModel.getUser().observe(this, Observer<StatusData<User>> { statusData ->
            if (statusData!!.isSuccess()) {
                tv_username.text = statusData.data?.userName
            } else {
                tv_username.text = statusData.msg
            }
        })
    }

}
