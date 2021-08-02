package com.example.notesfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.notesfragments.databinding.ActivityMainBinding
import com.example.notesfragments.utilits.APP_ACTIVITY

class MainActivity : AppCompatActivity() {

    lateinit var mToolbar: androidx.appcompat.widget.Toolbar
    lateinit var mNavControlller: NavController
    lateinit var binding: ActivityMainBinding
    val mBinding get() = binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        APP_ACTIVITY = this
        mToolbar = mBinding.toolbar
        mNavControlller = Navigation.findNavController(this, R.id.nav_host_fragment)
        setSupportActionBar(mToolbar)
        mToolbar.title = getString(R.string.title)

    }
}