package com.example.skyscanner.dependencies;

import com.example.skyscanner.FlightsListActivity;
import com.example.skyscanner.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ApplicationBuilderModule {

    @ContributesAndroidInjector
    abstract MainActivity mainActivity();

    @ContributesAndroidInjector
    abstract FlightsListActivity flightsListActivity();
}
