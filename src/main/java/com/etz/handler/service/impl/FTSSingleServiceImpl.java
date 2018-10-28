/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etz.handler.service.impl;

import com.etz.handler.client.FTSClient;
import com.etz.handler.request.FtRSingleRequest;
import com.etz.handler.response.FTSSingleResponse;
import com.etz.handler.service.BaseService;
import com.etz.handler.service.FTSSingleService;
import retrofit2.Call;

/**
 *
 * @author Cyprian Omenuko
 */
public class FTSSingleServiceImpl extends BaseService implements FTSSingleService {
    private FTSClient client;
    
    public FTSSingleServiceImpl(String baseUrl) {
        client = getInstance(baseUrl).create(FTSClient.class);
    }
    
    public FTSSingleResponse getFundTransferStatus(FtRSingleRequest request) throws Exception {
        Call<FTSSingleResponse> call = client.getFundTransferStatus(request);
        return call.execute().body();
    }
}
