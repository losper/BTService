package org.losper.btservice

import android.annotation.TargetApi
import android.app.Activity
import android.bluetooth.BluetoothAdapter
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log

class BtOn : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestPermission()
        Log.d("BtOn","onCreate")
        BluetoothAdapter.getDefaultAdapter().enable()
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private fun requestPermission() {
        /*val mpm= getSystemService(Context.MEDIA_PROJECTION_SERVICE) as MediaProjectionManager
        startActivityForResult(
                mpm.createScreenCaptureIntent(),
                REQUEST_MEDIA_PROJECTION)*/
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        BluetoothAdapter.getDefaultAdapter().enable()
        Log.d("BtOn","onActivityResult")
    }
}