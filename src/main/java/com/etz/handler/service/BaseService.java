/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etz.handler.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author Cyprian Omenuko
 */
public abstract class BaseService {
    
    protected Retrofit retrofit;
    
//    public BaseService(String baseUrl){
//        retrofit= new Retrofit.Builder()
//            .baseUrl(baseUrl)
//            .build();
//    }

    protected static Retrofit getInstance(String baseUrl){
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
