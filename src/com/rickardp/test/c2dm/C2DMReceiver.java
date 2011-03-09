package com.rickardp.test.c2dm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.google.android.c2dm.C2DMBaseReceiver;

public class C2DMReceiver extends C2DMBaseReceiver {
    public C2DMReceiver() {
        super("rickard.pettersson@viewserve.com");
    }

    @Override
    public void onRegistered(Context context, String registration) {
        // TODO: Handle registration
    	Log.i("C2DMTest", "onRegistrered - registration: \"" + registration + "\"");
    }

    @Override
    public void onUnregistered(Context context) {
    	// TODO: Handle onUnregistered
    	Log.i("C2DMTest", "onUnregistered");
    }

    @Override
    public void onError(Context context, String errorId) {
        // TODO: Handle onError
    	Log.i("C2DMTest", "onError - errorId: \"" + errorId + "\"");
    }

    @Override
    public void onMessage(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String key1 = (String) extras.get("key1");
            // TODO: Handle onMessage
        	Log.i("C2DMTest", "onMessage - key1 = \"" + key1 + "\"");
        }
    }
}
