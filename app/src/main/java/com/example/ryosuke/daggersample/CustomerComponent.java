package com.example.ryosuke.daggersample;

import dagger.Subcomponent;

/**
 * Created by ryosuke on 2018/02/14.
 */

@CustomerScope
@Subcomponent
public interface CustomerComponent {

    Customer enter();

    @Subcomponent.Builder
    static interface Builder{
        CustomerComponent build();
    }
}
