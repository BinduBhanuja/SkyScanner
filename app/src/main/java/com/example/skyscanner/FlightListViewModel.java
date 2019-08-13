package com.example.skyscanner;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import javax.inject.Inject;

public class FlightListViewModel implements LifecycleObserver {

    private FlightListAdapter flightListAdapter;

    @Inject
    public FlightListViewModel() { }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        flightListAdapter = new FlightListAdapter();
    }
}
