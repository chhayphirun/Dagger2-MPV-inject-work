package com.example.kshrd.dagger2.app.di;

import com.example.kshrd.dagger2.MainActivity;

import dagger.Component;

/**
 * Created by kshrd on 7/17/17.
 */
@Component(modules =ConstantModule.class)
public interface ApplicationComponent {
    void inject(MainActivity mainActivity);
}
