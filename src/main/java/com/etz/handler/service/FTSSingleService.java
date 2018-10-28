/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etz.handler.service;

import com.etz.handler.request.FtRSingleRequest;
import java.io.IOException;

import com.etz.handler.request.FtSingleRequest;
import com.etz.handler.response.FTSSingleResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 *
 * @author Cyprian Omenuko
 */
public interface FTSSingleService{
    
    FTSSingleResponse getFundTransferStatus(FtRSingleRequest request) throws Exception;
  
}
