/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etz.handler.client;

import com.etz.handler.request.FtRSingleRequest;
import com.etz.handler.response.FTSSingleResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 *
 * @author Cyprian Omenuko
 */
public interface FTSClient {
    
    @POST("api/transaction/status")
    Call<FTSSingleResponse> getFundTransferStatus(@Body FtRSingleRequest request);
    }
