package com.example.rtklib;

import android.util.Log;

/**
 * Author: Zukhriddin Kamolov
 * Date: 26-Feb-24, 5:51 PM.
 * Project: ToRinex
 */

public class LongLatLocation {
    public final double latitude;
    public final double longitude;

    public LongLatLocation(double lat, double lon) {
        latitude = lat;
        longitude = lon;
    }

    public void print(LongLatLocation location){
        Log.d("TAG", "print  -  lon: " + location.longitude + ";  lat: " + location.latitude );
    }

}
