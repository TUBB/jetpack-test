package io.github.tubb.jetpack.ui.main

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel

class UserProfileViewModel : ViewModel() {
    private lateinit var userId: String;
    private lateinit var user: LiveData<StatusData<User>>;

    fun init(userId: String) {
        this.userId = userId;
        this.user = UserRepository.getInstance().getUser(userId);
    }

    fun getUser(): LiveData<StatusData<User>> {
        return user;
    }
}
