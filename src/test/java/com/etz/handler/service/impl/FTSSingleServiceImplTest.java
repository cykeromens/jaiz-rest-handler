package com.etz.handler.service.impl;

import static org.hamcrest.core.Is.is;

import com.etz.handler.Base;
import com.etz.handler.request.FtRSingleRequest;
import com.etz.handler.response.FTSSingleResponse;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class FTSSingleServiceImplTest extends Base {
    private static final String SESSION_ID = "200";
    private static final String STATUS = "00";

    private FTSSingleServiceImpl service;

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Before
    public void setUp() throws Exception {
        service = new FTSSingleServiceImpl(BASE_URL);
    }

    @Test
    public void givenFtSingleRequestGetFundTransferStatus() throws Exception {
        //Arrange
        final FtRSingleRequest request = new FtRSingleRequest();
        request.setSessionId(SESSION_ID);

        //Act
        final FTSSingleResponse status = service.getFundTransferStatus(request);

        //Assert
        collector.checkThat(status.getResponseCode(), is(STATUS));
        collector.checkThat(status.getSessionId(), is(SESSION_ID));
    }
}