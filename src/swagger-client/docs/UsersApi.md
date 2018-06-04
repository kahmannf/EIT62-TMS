# UsersApi

All URIs are relative to *https://virtserver.swaggerhub.com/eit62-tms/TMS-Webserver/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersMeGet**](UsersApi.md#usersMeGet) | **GET** /users/me | get user data for the logged in user
[**usersSearchGet**](UsersApi.md#usersSearchGet) | **GET** /users/search | searches for a user by name or email


<a name="usersMeGet"></a>
# **usersMeGet**
> User usersMeGet()

get user data for the logged in user

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
try {
    User result = apiInstance.usersMeGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersMeGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usersSearchGet"></a>
# **usersSearchGet**
> UserPage usersSearchGet(offset, limit, search)

searches for a user by name or email

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Integer offset = 0; // Integer | amount of users to be skipped
Integer limit = 20; // Integer | amount of users that should be returned
String search = "search_example"; // String | a search string that will be machted with the username
try {
    UserPage result = apiInstance.usersSearchGet(offset, limit, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersSearchGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| amount of users to be skipped | [optional] [default to 0]
 **limit** | **Integer**| amount of users that should be returned | [optional] [default to 20]
 **search** | **String**| a search string that will be machted with the username | [optional]

### Return type

[**UserPage**](UserPage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

