package com.example.kshrd.dagger2.app.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by kshrd on 7/17/17.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiKey {

}
