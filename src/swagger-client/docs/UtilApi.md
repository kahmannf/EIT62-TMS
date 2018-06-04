# UtilApi

All URIs are relative to *https://virtserver.swaggerhub.com/eit62-tms/TMS-Webserver/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statusAllGet**](UtilApi.md#statusAllGet) | **GET** /status/all | returns a list of all available status-valus


<a name="statusAllGet"></a>
# **statusAllGet**
> List&lt;Status&gt; statusAllGet()

returns a list of all available status-valus

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UtilApi;


UtilApi apiInstance = new UtilApi();
try {
    List<Status> result = apiInstance.statusAllGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilApi#statusAllGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Status&gt;**](Status.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

