# TicketsApi

All URIs are relative to *https://virtserver.swaggerhub.com/eit62-tms/TMS-Webserver/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**secureProjectsProjectidNewTicketPost**](TicketsApi.md#secureProjectsProjectidNewTicketPost) | **POST** /secure/projects/{projectid}/new-ticket | create a new ticket assciated to the project
[**secureProjectsProjectidTicketsGet**](TicketsApi.md#secureProjectsProjectidTicketsGet) | **GET** /secure/projects/{projectid}/tickets | returns a paging-object containing tickets
[**secureTicketsTicketidAddCommentPost**](TicketsApi.md#secureTicketsTicketidAddCommentPost) | **POST** /secure/tickets/{ticketid}/add-comment | adds a comment to a ticket
[**secureTicketsTicketidGet**](TicketsApi.md#secureTicketsTicketidGet) | **GET** /secure/tickets/{ticketid} | return a ticket by id
[**secureTicketsUpdatePost**](TicketsApi.md#secureTicketsUpdatePost) | **POST** /secure/tickets/update | updates a existing ticket


<a name="secureProjectsProjectidNewTicketPost"></a>
# **secureProjectsProjectidNewTicketPost**
> secureProjectsProjectidNewTicketPost(projectid, ticket)

create a new ticket assciated to the project

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TicketsApi;


TicketsApi apiInstance = new TicketsApi();
Integer projectid = 56; // Integer | id of the project
Ticket ticket = new Ticket(); // Ticket | 
try {
    apiInstance.secureProjectsProjectidNewTicketPost(projectid, ticket);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketsApi#secureProjectsProjectidNewTicketPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectid** | **Integer**| id of the project |
 **ticket** | [**Ticket**](Ticket.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="secureProjectsProjectidTicketsGet"></a>
# **secureProjectsProjectidTicketsGet**
> TicketPage secureProjectsProjectidTicketsGet(projectid, offset, limit)

returns a paging-object containing tickets

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TicketsApi;


TicketsApi apiInstance = new TicketsApi();
Integer projectid = 56; // Integer | id of the project
Integer offset = 0; // Integer | amount of tickets to be skipped
Integer limit = 20; // Integer | amount of tickets that should be returned
try {
    TicketPage result = apiInstance.secureProjectsProjectidTicketsGet(projectid, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketsApi#secureProjectsProjectidTicketsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectid** | **Integer**| id of the project |
 **offset** | **Integer**| amount of tickets to be skipped | [optional] [default to 0]
 **limit** | **Integer**| amount of tickets that should be returned | [optional] [default to 20]

### Return type

[**TicketPage**](TicketPage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="secureTicketsTicketidAddCommentPost"></a>
# **secureTicketsTicketidAddCommentPost**
> secureTicketsTicketidAddCommentPost(ticketid, comment)

adds a comment to a ticket

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TicketsApi;


TicketsApi apiInstance = new TicketsApi();
Integer ticketid = 56; // Integer | 
Comment comment = new Comment(); // Comment | 
try {
    apiInstance.secureTicketsTicketidAddCommentPost(ticketid, comment);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketsApi#secureTicketsTicketidAddCommentPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticketid** | **Integer**|  |
 **comment** | [**Comment**](Comment.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="secureTicketsTicketidGet"></a>
# **secureTicketsTicketidGet**
> Ticket secureTicketsTicketidGet(ticketid)

return a ticket by id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TicketsApi;


TicketsApi apiInstance = new TicketsApi();
Integer ticketid = 56; // Integer | 
try {
    Ticket result = apiInstance.secureTicketsTicketidGet(ticketid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketsApi#secureTicketsTicketidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticketid** | **Integer**|  |

### Return type

[**Ticket**](Ticket.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="secureTicketsUpdatePost"></a>
# **secureTicketsUpdatePost**
> secureTicketsUpdatePost(ticket)

updates a existing ticket

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TicketsApi;


TicketsApi apiInstance = new TicketsApi();
Ticket ticket = new Ticket(); // Ticket | 
try {
    apiInstance.secureTicketsUpdatePost(ticket);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketsApi#secureTicketsUpdatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticket** | [**Ticket**](Ticket.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

