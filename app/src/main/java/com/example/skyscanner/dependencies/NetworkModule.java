package com.example.skyscanner.dependencies;

import com.example.skyscanner.services.QuotesService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {

    private static final String BASE_URL = "https://skyscanner-skyscanner-flight-search-v1.p.rapidapi.com/apiservices";

    @Singleton
    @Provides
    QuotesService getServiceInstance() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
                .create(QuotesService.class);
    }
}
