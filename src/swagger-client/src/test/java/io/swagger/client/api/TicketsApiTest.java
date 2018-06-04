package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Comment;
import io.swagger.client.model.Ticket;
import io.swagger.client.model.TicketPage;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TicketsApi
 */
@Ignore
public class TicketsApiTest {

    private final TicketsApi api = new TicketsApi();

    
    /**
     * create a new ticket assciated to the project
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectsProjectidNewTicketPostTest() throws ApiException {
        Integer projectid = null;
        Ticket ticket = null;
        api.projectsProjectidNewTicketPost(projectid, ticket);

        // TODO: test validations
    }
    
    /**
     * returns a paging-object containing tickets
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectsProjectidTicketsGetTest() throws ApiException {
        Integer projectid = null;
        Integer offset = null;
        Integer limit = null;
        TicketPage response = api.projectsProjectidTicketsGet(projectid, offset, limit);

        // TODO: test validations
    }
    
    /**
     * adds a comment to a ticket
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ticketsTicketidAddCommentPostTest() throws ApiException {
        Integer ticketid = null;
        Comment comment = null;
        api.ticketsTicketidAddCommentPost(ticketid, comment);

        // TODO: test validations
    }
    
    /**
     * return a ticket by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ticketsTicketidGetTest() throws ApiException {
        Integer ticketid = null;
        Ticket response = api.ticketsTicketidGet(ticketid);

        // TODO: test validations
    }
    
    /**
     * updates a existing ticket
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ticketsUpdatePostTest() throws ApiException {
        Ticket ticket = null;
        api.ticketsUpdatePost(ticket);

        // TODO: test validations
    }
    
}
