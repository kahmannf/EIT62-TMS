# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AuthApi;

import java.io.File;
import java.util.*;

public class AuthApiExample {

    public static void main(String[] args) {
        
        AuthApi apiInstance = new AuthApi();
        Authdata authdata = new Authdata(); // Authdata | 
        try {
            InlineResponse200 result = apiInstance.authLoginPost(authdata);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#authLoginPost");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/eit62-tms/TMS-Webserver/1.0.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthApi* | [**authLoginPost**](docs/AuthApi.md#authLoginPost) | **POST** /auth/login | attempts a login operation
*AuthApi* | [**authRefreshPost**](docs/AuthApi.md#authRefreshPost) | **POST** /auth/refresh | takes a refresh-token and return a new access-token
*AuthApi* | [**authRegisterPost**](docs/AuthApi.md#authRegisterPost) | **POST** /auth/register | register a new user
*ProjectsApi* | [**secureProjectsMineGet**](docs/ProjectsApi.md#secureProjectsMineGet) | **GET** /secure/projects/mine | returns an array of projects associated to the logged in user
*ProjectsApi* | [**secureProjectsProjectidAddUserUseridPost**](docs/ProjectsApi.md#secureProjectsProjectidAddUserUseridPost) | **POST** /secure/projects/{projectid}/add-user/{userid} | adds a user to a project
*ProjectsApi* | [**secureProjectsSavePost**](docs/ProjectsApi.md#secureProjectsSavePost) | **POST** /secure/projects/save | saves a project. if projectid is 0 or null/undefined, creates a new project
*TicketsApi* | [**secureProjectsProjectidNewTicketPost**](docs/TicketsApi.md#secureProjectsProjectidNewTicketPost) | **POST** /secure/projects/{projectid}/new-ticket | create a new ticket assciated to the project
*TicketsApi* | [**secureProjectsProjectidTicketsGet**](docs/TicketsApi.md#secureProjectsProjectidTicketsGet) | **GET** /secure/projects/{projectid}/tickets | returns a paging-object containing tickets
*TicketsApi* | [**secureTicketsTicketidAddCommentPost**](docs/TicketsApi.md#secureTicketsTicketidAddCommentPost) | **POST** /secure/tickets/{ticketid}/add-comment | adds a comment to a ticket
*TicketsApi* | [**secureTicketsTicketidGet**](docs/TicketsApi.md#secureTicketsTicketidGet) | **GET** /secure/tickets/{ticketid} | return a ticket by id
*TicketsApi* | [**secureTicketsUpdatePost**](docs/TicketsApi.md#secureTicketsUpdatePost) | **POST** /secure/tickets/update | updates a existing ticket
*UsersApi* | [**secureUsersMeGet**](docs/UsersApi.md#secureUsersMeGet) | **GET** /secure/users/me | get user data for the logged in user
*UsersApi* | [**secureUsersSearchGet**](docs/UsersApi.md#secureUsersSearchGet) | **GET** /secure/users/search | searches for a user by name or email
*UtilApi* | [**secureStatusAllGet**](docs/UtilApi.md#secureStatusAllGet) | **GET** /secure/status/all | returns a list of all available status-valus


## Documentation for Models

 - [Authdata](docs/Authdata.md)
 - [Comment](docs/Comment.md)
 - [Data](docs/Data.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [Project](docs/Project.md)
 - [Status](docs/Status.md)
 - [Ticket](docs/Ticket.md)
 - [TicketPage](docs/TicketPage.md)
 - [User](docs/User.md)
 - [UserPage](docs/UserPage.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



