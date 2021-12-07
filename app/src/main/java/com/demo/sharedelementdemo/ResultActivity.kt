package com.demo.sharedelementdemo

import android.os.Bundle
import android.transition.Fade
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.databinding.DataBindingUtil
import com.demo.sharedelementdemo.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    lateinit var binding: ActivityResultBinding
    var flag = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_result)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        flag = intent.getIntExtra("flag", 0)

        setData()

    }

    // Set Title,Content and Image
    private fun setData() {
        binding.apply {

            when (flag) {
                1 -> {
                    imgResult.setImageResource(R.drawable.gateway_of_india)
                    txtTitle.text = getString(R.string.gateway_of_india)
                    txtContent.text = getString(R.string.about_gateway_of_india)
                }
                2 -> {
                    imgResult.setImageResource(R.drawable.red_fort)
                    txtTitle.text = getString(R.string.red_fort)
                    txtContent.text = getString(R.string.about_red_fort)
                }
                3 -> {
                    imgResult.setImageResource(R.drawable.taj_mahal)
                    txtTitle.text = getString(R.string.taj_mahal)
                    txtContent.text = getString(R.string.about_taj_mahal)
                }
                4 -> {
                    imgResult.setImageResource(R.drawable.varansi)
                    txtTitle.text = getString(R.string.varanasi)
                    txtContent.text = getString(R.string.about_varansi)
                }
            }
        }
    }
}