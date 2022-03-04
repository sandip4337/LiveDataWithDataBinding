package com.sandip.livedataexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.sandip.livedataexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    lateinit var mainViewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.mutableLiveData.observe(this, Observer {

            val quoteObject = Quote(it,"https://th.bing.com/th/id/OIP.WgQkUtXZXu_OwOJAlYB-vQHaJQ?pid=ImgDet&rs=1")
            binding.quote = quoteObject

        })

        binding.updatebtn.setOnClickListener {
            mainViewModel.UpdateData()
        }
    }
}

