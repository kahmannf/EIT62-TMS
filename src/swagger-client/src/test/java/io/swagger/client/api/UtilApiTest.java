package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Status;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UtilApi
 */
@Ignore
public class UtilApiTest {

    private final UtilApi api = new UtilApi();

    
    /**
     * returns a list of all available status-valus
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void secureStatusAllGetTest() throws ApiException {
        List<Status> response = api.secureStatusAllGet();

        // TODO: test validations
    }
    
}
