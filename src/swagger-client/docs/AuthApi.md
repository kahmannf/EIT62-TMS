# AuthApi

All URIs are relative to *https://virtserver.swaggerhub.com/eit62-tms/TMS-Webserver/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authLoginPost**](AuthApi.md#authLoginPost) | **POST** /auth/login | attempts a login operation
[**authRefreshPost**](AuthApi.md#authRefreshPost) | **POST** /auth/refresh | takes a refresh-token and return a new access-token
[**authRegisterPost**](AuthApi.md#authRegisterPost) | **POST** /auth/register | register a new user


<a name="authLoginPost"></a>
# **authLoginPost**
> InlineResponse200 authLoginPost(authdata)

attempts a login operation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
Authdata authdata = new Authdata(); // Authdata | 
try {
    InlineResponse200 result = apiInstance.authLoginPost(authdata);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#authLoginPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authdata** | [**Authdata**](Authdata.md)|  |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="authRefreshPost"></a>
# **authRefreshPost**
> InlineResponse2001 authRefreshPost(refreshToken)

takes a refresh-token and return a new access-token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
String refreshToken = "refreshToken_example"; // String | 
try {
    InlineResponse2001 result = apiInstance.authRefreshPost(refreshToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#authRefreshPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refreshToken** | **String**|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="authRegisterPost"></a>
# **authRegisterPost**
> authRegisterPost(data)

register a new user

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
Data data = new Data(); // Data | 
try {
    apiInstance.authRegisterPost(data);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#authRegisterPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Data**](Data.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

