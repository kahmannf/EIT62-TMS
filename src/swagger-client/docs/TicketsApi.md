# TicketsApi

All URIs are relative to *https://virtserver.swaggerhub.com/eit62-tms/TMS-Webserver/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**projectsProjectidNewTicketPost**](TicketsApi.md#projectsProjectidNewTicketPost) | **POST** /projects/{projectid}/new-ticket | create a new ticket assciated to the project
[**projectsProjectidTicketsGet**](TicketsApi.md#projectsProjectidTicketsGet) | **GET** /projects/{projectid}/tickets | returns a paging-object containing tickets
[**ticketsTicketidAddCommentPost**](TicketsApi.md#ticketsTicketidAddCommentPost) | **POST** /tickets/{ticketid}/add-comment | adds a comment to a ticket
[**ticketsTicketidGet**](TicketsApi.md#ticketsTicketidGet) | **GET** /tickets/{ticketid} | return a ticket by id
[**ticketsUpdatePost**](TicketsApi.md#ticketsUpdatePost) | **POST** /tickets/update | updates a existing ticket


<a name="projectsProjectidNewTicketPost"></a>
# **projectsProjectidNewTicketPost**
> projectsProjectidNewTicketPost(projectid, ticket)

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
    apiInstance.projectsProjectidNewTicketPost(projectid, ticket);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketsApi#projectsProjectidNewTicketPost");
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

<a name="projectsProjectidTicketsGet"></a>
# **projectsProjectidTicketsGet**
> TicketPage projectsProjectidTicketsGet(projectid, offset, limit)

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
    TicketPage result = apiInstance.projectsProjectidTicketsGet(projectid, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketsApi#projectsProjectidTicketsGet");
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

<a name="ticketsTicketidAddCommentPost"></a>
# **ticketsTicketidAddCommentPost**
> ticketsTicketidAddCommentPost(ticketid, comment)

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
    apiInstance.ticketsTicketidAddCommentPost(ticketid, comment);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketsApi#ticketsTicketidAddCommentPost");
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

<a name="ticketsTicketidGet"></a>
# **ticketsTicketidGet**
> Ticket ticketsTicketidGet(ticketid)

return a ticket by id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TicketsApi;


TicketsApi apiInstance = new TicketsApi();
Integer ticketid = 56; // Integer | 
try {
    Ticket result = apiInstance.ticketsTicketidGet(ticketid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketsApi#ticketsTicketidGet");
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

<a name="ticketsUpdatePost"></a>
# **ticketsUpdatePost**
> ticketsUpdatePost(ticket)

updates a existing ticket

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TicketsApi;


TicketsApi apiInstance = new TicketsApi();
Ticket ticket = new Ticket(); // Ticket | 
try {
    apiInstance.ticketsUpdatePost(ticket);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketsApi#ticketsUpdatePost");
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

