package ru.mixail_akulov.lifecycleactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ru.mixail_akulov.lifecycleactivity.databinding.ActivityMainBinding

class MainLifecycleActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG.toString(), "onCreate, saveState=$savedInstanceState")

        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        binding.showAnotherActivityButton.setOnClickListener {
            startActivity(Intent(this, SecondaryLifecycleActivity::class.java))
        }

        binding.showTransparentActivityButton.setOnClickListener {
//            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), 1)
        }

        binding.minimizeTheAppButton.setOnClickListener {
            moveTaskToBack(false)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG.toString(), "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG.toString(), "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG.toString(), "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG.toString(), "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG.toString(), "onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG.toString(), "onSaveInstanceState")
    }

    companion object {
        @JvmStatic val TAG = MainLifecycleActivity::class.java
    }
}