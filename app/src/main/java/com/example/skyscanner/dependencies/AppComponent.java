package com.example.skyscanner.dependencies;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = { NetworkModule.class,
        ApplicationBuilderModule.class,
        AndroidSupportInjectionModule.class })
public interface AppComponent extends AndroidInjector<MyApplication> {
}
