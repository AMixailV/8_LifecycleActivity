package ru.mixail_akulov.lifecycleactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondaryLifecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG.toString(), "onCreate, saveState=$savedInstanceState")
        setContentView(R.layout.activity_secondary_lifecycle)
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
        @JvmStatic val TAG = SecondaryLifecycleActivity::class.java
    }
}