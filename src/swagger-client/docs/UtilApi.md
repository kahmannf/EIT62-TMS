# UtilApi

All URIs are relative to *https://virtserver.swaggerhub.com/eit62-tms/TMS-Webserver/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**secureStatusAllGet**](UtilApi.md#secureStatusAllGet) | **GET** /secure/status/all | returns a list of all available status-valus


<a name="secureStatusAllGet"></a>
# **secureStatusAllGet**
> List&lt;Status&gt; secureStatusAllGet()

returns a list of all available status-valus

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UtilApi;


UtilApi apiInstance = new UtilApi();
try {
    List<Status> result = apiInstance.secureStatusAllGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilApi#secureStatusAllGet");
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

