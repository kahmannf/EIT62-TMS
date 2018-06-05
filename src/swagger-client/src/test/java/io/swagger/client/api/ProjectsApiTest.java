package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Project;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectsApi
 */
@Ignore
public class ProjectsApiTest {

    private final ProjectsApi api = new ProjectsApi();

    
    /**
     * returns an array of projects associated to the logged in user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void secureProjectsMineGetTest() throws ApiException {
        List<Project> response = api.secureProjectsMineGet();

        // TODO: test validations
    }
    
    /**
     * adds a user to a project
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void secureProjectsProjectidAddUserUseridPostTest() throws ApiException {
        Integer projectid = null;
        Integer userid = null;
        api.secureProjectsProjectidAddUserUseridPost(projectid, userid);

        // TODO: test validations
    }
    
    /**
     * saves a project. if projectid is 0 or null/undefined, creates a new project
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void secureProjectsSavePostTest() throws ApiException {
        Project project = null;
        api.secureProjectsSavePost(project);

        // TODO: test validations
    }
    
}
