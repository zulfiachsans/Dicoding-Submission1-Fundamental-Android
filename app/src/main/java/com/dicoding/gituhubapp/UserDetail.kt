package com.dicoding.gituhubapp

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.user_detail.*

class UserDetail : AppCompatActivity() {
    private lateinit var appBgImage: ImageView
    companion object{
        var EXTRA_DATA = "0"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_detail)
        val actionbar = supportActionBar
        actionbar!!.title = "User Detail"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val listUser : UserData = intent.getParcelableExtra(EXTRA_DATA)!!

        detail_user_avatar.setImageResource(listUser.avatar!!)
        detail_user_repositories.text = getString(R.string.repository, listUser.repository)
        detail_user_username.text = getString(R.string.username, listUser.username)
        detail_user_name.text = listUser.name
        detail_user_location.text = getString(R.string.location, listUser.location)
        detail_company.text = getString(R.string.company, listUser.company)
        detail_user_email.text = getString(R.string.email, listUser.email)
        detail_user_followers.text = getString(R.string.followers, listUser.followers)
        detail_user_following.text = getString(R.string.following, listUser.following)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}