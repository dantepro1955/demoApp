package com.p000;

import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;

/* renamed from: auk */
public class auk implements bpt {
    /* renamed from: a */
    public Location mo735a(GoogleApiClient googleApiClient) {
        try {
            return LocationServices.zzj(googleApiClient).mo344e();
        } catch (Exception e) {
            return null;
        }
    }
}
