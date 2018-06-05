# ProjectsApi

All URIs are relative to *https://virtserver.swaggerhub.com/eit62-tms/TMS-Webserver/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**secureProjectsMineGet**](ProjectsApi.md#secureProjectsMineGet) | **GET** /secure/projects/mine | returns an array of projects associated to the logged in user
[**secureProjectsProjectidAddUserUseridPost**](ProjectsApi.md#secureProjectsProjectidAddUserUseridPost) | **POST** /secure/projects/{projectid}/add-user/{userid} | adds a user to a project
[**secureProjectsSavePost**](ProjectsApi.md#secureProjectsSavePost) | **POST** /secure/projects/save | saves a project. if projectid is 0 or null/undefined, creates a new project


<a name="secureProjectsMineGet"></a>
# **secureProjectsMineGet**
> List&lt;Project&gt; secureProjectsMineGet()

returns an array of projects associated to the logged in user

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
try {
    List<Project> result = apiInstance.secureProjectsMineGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#secureProjectsMineGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Project&gt;**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="secureProjectsProjectidAddUserUseridPost"></a>
# **secureProjectsProjectidAddUserUseridPost**
> secureProjectsProjectidAddUserUseridPost(projectid, userid)

adds a user to a project

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
Integer projectid = 56; // Integer | id of the project to add the user to
Integer userid = 56; // Integer | id of the user to add to the project
try {
    apiInstance.secureProjectsProjectidAddUserUseridPost(projectid, userid);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#secureProjectsProjectidAddUserUseridPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectid** | **Integer**| id of the project to add the user to |
 **userid** | **Integer**| id of the user to add to the project |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="secureProjectsSavePost"></a>
# **secureProjectsSavePost**
> secureProjectsSavePost(project)

saves a project. if projectid is 0 or null/undefined, creates a new project

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
Project project = new Project(); // Project | 
try {
    apiInstance.secureProjectsSavePost(project);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#secureProjectsSavePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project** | [**Project**](Project.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

