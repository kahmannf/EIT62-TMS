package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Authdata;
import io.swagger.client.model.Data;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthApi
 */
@Ignore
public class AuthApiTest {

    private final AuthApi api = new AuthApi();

    
    /**
     * attempts a login operation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authLoginPostTest() throws ApiException {
        Authdata authdata = null;
        InlineResponse200 response = api.authLoginPost(authdata);

        // TODO: test validations
    }
    
    /**
     * takes a refresh-token and return a new access-token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authRefreshPostTest() throws ApiException {
        String refreshToken = null;
        InlineResponse2001 response = api.authRefreshPost(refreshToken);

        // TODO: test validations
    }
    
    /**
     * register a new user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authRegisterPostTest() throws ApiException {
        Data data = null;
        api.authRegisterPost(data);

        // TODO: test validations
    }
    
}
