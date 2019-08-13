package com.example.skyscanner.services;

import com.example.skyscanner.models.MainReponse;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class ServiceManager {

    QuotesService quotesService;

    @Inject
    public ServiceManager(QuotesService quotesService) {
        this.quotesService = quotesService;
    }

    Observable<MainReponse> getTheMainResponse(String country, String currency, String locale, String originPlace,
                                               String destinationPlace, String outboundPartialDate) {
        return quotesService.getTheMainResponse(country, currency, locale, originPlace, destinationPlace, outboundPartialDate)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
