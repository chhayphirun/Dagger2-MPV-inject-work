package com.example.kshrd.dagger2.app.di;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kshrd on 7/17/17.
 */
@Module
public class ConstantModule {
    @Provides
    @ApiKey
    public String provideApiKey(){
        return "Key:sdkfjsdfjldfjld";
    }
    @Provides
    public String provideApiUrl(){
        return "http://111.222.333.444:8080";
    }

}
