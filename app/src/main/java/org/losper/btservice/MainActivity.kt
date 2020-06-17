package org.losper.btservice

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        val tmp = Intent()
        tmp.action= ACTION_APPLICATION_DETAILS_SETTINGS
        tmp.data= Uri.fromParts("package",packageName, null)
        startActivity(tmp);
        */
        //if (CheckPermissionUtil.check(this)){
        //    moveTaskToBack(true)
        //}else {
            CheckPermissionUtil.startAppSettings(this)
        //}
        val itt = Intent(applicationContext, BtServiceOn().javaClass)
        applicationContext.startService(itt)
    }
}
