package com.example.skyscanner.services;

import com.example.skyscanner.models.MainReponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface QuotesService {

    @Headers({
            "X-RapidAPI-Key: a0155a14c1msh2e220116b4e5552p1405a5jsn396c273e9ee3"
    })
    @GET("/browsequotes/v1.0")
    Observable<MainReponse> getTheMainResponse(@Query("country") String country, @Query("currency") String currency,
                                               @Query("locale") String locale,
                                               @Query("originplace") String originPlace, @Query("destinationplace") String destinationPlace,
                                               @Query("outboundpartialdate") String outboundPartialDate);
}
