package com.example.ryosuke.daggersample;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by ryosuke on 2018/02/14.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomerScope {
}
