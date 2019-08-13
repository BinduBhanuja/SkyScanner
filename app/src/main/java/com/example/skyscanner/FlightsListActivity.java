package com.example.skyscanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.skyscanner.databinding.ActivityFlightsListBinding;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class FlightsListActivity extends AppCompatActivity {

    @Inject
    FlightListViewModel flightListViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        ActivityFlightsListBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_flights_list);
        binding.setViewModel(flightListViewModel);
    }
}
