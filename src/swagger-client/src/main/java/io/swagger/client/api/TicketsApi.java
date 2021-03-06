

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.Comment;
import io.swagger.client.model.Ticket;
import io.swagger.client.model.TicketPage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketsApi {
    private ApiClient apiClient;

    public TicketsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TicketsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for secureProjectsProjectidNewTicketPost
     * @param projectid id of the project (required)
     * @param ticket  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call secureProjectsProjectidNewTicketPostCall(Integer projectid, Ticket ticket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = ticket;

        // create path and map variables
        String localVarPath = "/secure/projects/{projectid}/new-ticket"
            .replaceAll("\\{" + "projectid" + "\\}", apiClient.escapeString(projectid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call secureProjectsProjectidNewTicketPostValidateBeforeCall(Integer projectid, Ticket ticket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectid' is set
        if (projectid == null) {
            throw new ApiException("Missing the required parameter 'projectid' when calling secureProjectsProjectidNewTicketPost(Async)");
        }
        
        // verify the required parameter 'ticket' is set
        if (ticket == null) {
            throw new ApiException("Missing the required parameter 'ticket' when calling secureProjectsProjectidNewTicketPost(Async)");
        }
        

        com.squareup.okhttp.Call call = secureProjectsProjectidNewTicketPostCall(projectid, ticket, progressListener, progressRequestListener);
        return call;

    }

    /**
     * create a new ticket assciated to the project
     * 
     * @param projectid id of the project (required)
     * @param ticket  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void secureProjectsProjectidNewTicketPost(Integer projectid, Ticket ticket) throws ApiException {
        secureProjectsProjectidNewTicketPostWithHttpInfo(projectid, ticket);
    }

    /**
     * create a new ticket assciated to the project
     * 
     * @param projectid id of the project (required)
     * @param ticket  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> secureProjectsProjectidNewTicketPostWithHttpInfo(Integer projectid, Ticket ticket) throws ApiException {
        com.squareup.okhttp.Call call = secureProjectsProjectidNewTicketPostValidateBeforeCall(projectid, ticket, null, null);
        return apiClient.execute(call);
    }

    /**
     * create a new ticket assciated to the project (asynchronously)
     * 
     * @param projectid id of the project (required)
     * @param ticket  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call secureProjectsProjectidNewTicketPostAsync(Integer projectid, Ticket ticket, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = secureProjectsProjectidNewTicketPostValidateBeforeCall(projectid, ticket, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for secureProjectsProjectidTicketsGet
     * @param projectid id of the project (required)
     * @param offset amount of tickets to be skipped (optional, default to 0)
     * @param limit amount of tickets that should be returned (optional, default to 20)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call secureProjectsProjectidTicketsGetCall(Integer projectid, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/secure/projects/{projectid}/tickets"
            .replaceAll("\\{" + "projectid" + "\\}", apiClient.escapeString(projectid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call secureProjectsProjectidTicketsGetValidateBeforeCall(Integer projectid, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectid' is set
        if (projectid == null) {
            throw new ApiException("Missing the required parameter 'projectid' when calling secureProjectsProjectidTicketsGet(Async)");
        }
        

        com.squareup.okhttp.Call call = secureProjectsProjectidTicketsGetCall(projectid, offset, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * returns a paging-object containing tickets
     * 
     * @param projectid id of the project (required)
     * @param offset amount of tickets to be skipped (optional, default to 0)
     * @param limit amount of tickets that should be returned (optional, default to 20)
     * @return TicketPage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TicketPage secureProjectsProjectidTicketsGet(Integer projectid, Integer offset, Integer limit) throws ApiException {
        ApiResponse<TicketPage> resp = secureProjectsProjectidTicketsGetWithHttpInfo(projectid, offset, limit);
        return resp.getData();
    }

    /**
     * returns a paging-object containing tickets
     * 
     * @param projectid id of the project (required)
     * @param offset amount of tickets to be skipped (optional, default to 0)
     * @param limit amount of tickets that should be returned (optional, default to 20)
     * @return ApiResponse&lt;TicketPage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TicketPage> secureProjectsProjectidTicketsGetWithHttpInfo(Integer projectid, Integer offset, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = secureProjectsProjectidTicketsGetValidateBeforeCall(projectid, offset, limit, null, null);
        Type localVarReturnType = new TypeToken<TicketPage>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * returns a paging-object containing tickets (asynchronously)
     * 
     * @param projectid id of the project (required)
     * @param offset amount of tickets to be skipped (optional, default to 0)
     * @param limit amount of tickets that should be returned (optional, default to 20)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call secureProjectsProjectidTicketsGetAsync(Integer projectid, Integer offset, Integer limit, final ApiCallback<TicketPage> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = secureProjectsProjectidTicketsGetValidateBeforeCall(projectid, offset, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TicketPage>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for secureTicketsTicketidAddCommentPost
     * @param ticketid  (required)
     * @param comment  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call secureTicketsTicketidAddCommentPostCall(Integer ticketid, Comment comment, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = comment;

        // create path and map variables
        String localVarPath = "/secure/tickets/{ticketid}/add-comment"
            .replaceAll("\\{" + "ticketid" + "\\}", apiClient.escapeString(ticketid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call secureTicketsTicketidAddCommentPostValidateBeforeCall(Integer ticketid, Comment comment, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'ticketid' is set
        if (ticketid == null) {
            throw new ApiException("Missing the required parameter 'ticketid' when calling secureTicketsTicketidAddCommentPost(Async)");
        }
        
        // verify the required parameter 'comment' is set
        if (comment == null) {
            throw new ApiException("Missing the required parameter 'comment' when calling secureTicketsTicketidAddCommentPost(Async)");
        }
        

        com.squareup.okhttp.Call call = secureTicketsTicketidAddCommentPostCall(ticketid, comment, progressListener, progressRequestListener);
        return call;

    }

    /**
     * adds a comment to a ticket
     * 
     * @param ticketid  (required)
     * @param comment  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void secureTicketsTicketidAddCommentPost(Integer ticketid, Comment comment) throws ApiException {
        secureTicketsTicketidAddCommentPostWithHttpInfo(ticketid, comment);
    }

    /**
     * adds a comment to a ticket
     * 
     * @param ticketid  (required)
     * @param comment  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> secureTicketsTicketidAddCommentPostWithHttpInfo(Integer ticketid, Comment comment) throws ApiException {
        com.squareup.okhttp.Call call = secureTicketsTicketidAddCommentPostValidateBeforeCall(ticketid, comment, null, null);
        return apiClient.execute(call);
    }

    /**
     * adds a comment to a ticket (asynchronously)
     * 
     * @param ticketid  (required)
     * @param comment  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call secureTicketsTicketidAddCommentPostAsync(Integer ticketid, Comment comment, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = secureTicketsTicketidAddCommentPostValidateBeforeCall(ticketid, comment, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for secureTicketsTicketidGet
     * @param ticketid  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call secureTicketsTicketidGetCall(Integer ticketid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/secure/tickets/{ticketid}"
            .replaceAll("\\{" + "ticketid" + "\\}", apiClient.escapeString(ticketid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call secureTicketsTicketidGetValidateBeforeCall(Integer ticketid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'ticketid' is set
        if (ticketid == null) {
            throw new ApiException("Missing the required parameter 'ticketid' when calling secureTicketsTicketidGet(Async)");
        }
        

        com.squareup.okhttp.Call call = secureTicketsTicketidGetCall(ticketid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * return a ticket by id
     * 
     * @param ticketid  (required)
     * @return Ticket
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Ticket secureTicketsTicketidGet(Integer ticketid) throws ApiException {
        ApiResponse<Ticket> resp = secureTicketsTicketidGetWithHttpInfo(ticketid);
        return resp.getData();
    }

    /**
     * return a ticket by id
     * 
     * @param ticketid  (required)
     * @return ApiResponse&lt;Ticket&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Ticket> secureTicketsTicketidGetWithHttpInfo(Integer ticketid) throws ApiException {
        com.squareup.okhttp.Call call = secureTicketsTicketidGetValidateBeforeCall(ticketid, null, null);
        Type localVarReturnType = new TypeToken<Ticket>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * return a ticket by id (asynchronously)
     * 
     * @param ticketid  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call secureTicketsTicketidGetAsync(Integer ticketid, final ApiCallback<Ticket> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = secureTicketsTicketidGetValidateBeforeCall(ticketid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Ticket>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for secureTicketsUpdatePost
     * @param ticket  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call secureTicketsUpdatePostCall(Ticket ticket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = ticket;

        // create path and map variables
        String localVarPath = "/secure/tickets/update";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call secureTicketsUpdatePostValidateBeforeCall(Ticket ticket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'ticket' is set
        if (ticket == null) {
            throw new ApiException("Missing the required parameter 'ticket' when calling secureTicketsUpdatePost(Async)");
        }
        

        com.squareup.okhttp.Call call = secureTicketsUpdatePostCall(ticket, progressListener, progressRequestListener);
        return call;

    }

    /**
     * updates a existing ticket
     * 
     * @param ticket  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void secureTicketsUpdatePost(Ticket ticket) throws ApiException {
        secureTicketsUpdatePostWithHttpInfo(ticket);
    }

    /**
     * updates a existing ticket
     * 
     * @param ticket  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> secureTicketsUpdatePostWithHttpInfo(Ticket ticket) throws ApiException {
        com.squareup.okhttp.Call call = secureTicketsUpdatePostValidateBeforeCall(ticket, null, null);
        return apiClient.execute(call);
    }

    /**
     * updates a existing ticket (asynchronously)
     * 
     * @param ticket  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call secureTicketsUpdatePostAsync(Ticket ticket, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = secureTicketsUpdatePostValidateBeforeCall(ticket, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
