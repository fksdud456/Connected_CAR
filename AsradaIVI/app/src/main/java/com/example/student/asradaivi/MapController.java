package com.example.student.asradaivi;

import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapController {
    private String TAG = String.format("%20s", "MapController :: ");
    GoogleMap mMap;
    MapManager mapManager;

    public MapController(GoogleMap mMap, MapManager mapManager) {
        Log.d(TAG, "Construct");
        this.mMap = mMap;
        this.mapManager = mapManager;
    }

/*    public void addMarker(Parking parking) {
        com.google.android.gms.maps.model.Marker melbourne = mMap.addMarker(new MarkerOptions()
                .position(parking.getLatLng())
                .title(parking.getName())
                            .snippet(parking.getVicinity())
                .icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(R.drawable.parking)));
        Log.d(TAG, parking.toString());
    }

    public void updateMap(GoogleMap mMap, LatLng latLng) {
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
    }*/
}
