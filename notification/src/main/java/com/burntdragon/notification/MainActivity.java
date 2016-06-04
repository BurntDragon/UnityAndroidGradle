package com.burntdragon.notification;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Nickolas on 15/10/2015.
 */
public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ((Button) findViewById(R.id.send)).setOnClickListener(this);
        ((Button) findViewById(R.id.cancel)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.send) {
            //UnityNotificationManager.SetNotification(this, 1, "com.unity3d.player.UnityPlayerNativeActivity", 5000, "Title", "Long message text", "Long message text", 1, 1, 1);
        } else if (id == R.id.cancel) {
            //UnityNotificationManager.CancelNotification(this, 1);
        }
    }
}
