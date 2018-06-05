package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.User;
import io.swagger.client.model.UserPage;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Ignore
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    
    /**
     * get user data for the logged in user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void secureUsersMeGetTest() throws ApiException {
        User response = api.secureUsersMeGet();

        // TODO: test validations
    }
    
    /**
     * searches for a user by name or email
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void secureUsersSearchGetTest() throws ApiException {
        Integer offset = null;
        Integer limit = null;
        String search = null;
        UserPage response = api.secureUsersSearchGet(offset, limit, search);

        // TODO: test validations
    }
    
}
