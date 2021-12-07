package com.demo.sharedelementdemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.app.ActivityOptionsCompat
import androidx.databinding.DataBindingUtil
import com.demo.sharedelementdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // For Dark theme
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        imageClick()
    }

    // On Image Click
    private fun imageClick() {

        binding.imgGatewayofindia.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this, binding.imgGatewayofindia, getString(R.string.transition_name)
            )
            intent.putExtra("flag", 1)
            startActivity(intent, options.toBundle())
        }
        binding.imgRedfort.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this, binding.imgRedfort, getString(R.string.transition_name)
            )
            intent.putExtra("flag", 2)
            startActivity(intent, options.toBundle())
        }
        binding.imgTajmahal.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this, binding.imgTajmahal, getString(R.string.transition_name)
            )
            intent.putExtra("flag", 3)
            startActivity(intent, options.toBundle())
        }
        binding.imgVaransi.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this, binding.imgVaransi, getString(R.string.transition_name)
            )
            intent.putExtra("flag", 4)
            startActivity(intent, options.toBundle())
        }
    }

}