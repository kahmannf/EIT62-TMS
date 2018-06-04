
# Ticket

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ID** | **Integer** | Unique id of the ticket | 
**timestamp** | **String** | creation timestamp of the ticket | 
**userstory** | **String** | userstory associated to the ticket | 
**acceptanceCriteria** | **String** | criteria that must be met to close the ticket | 
**title** | **String** | title of the ticket | 
**creator** | [**User**](User.md) |  | 
**status** | [**Status**](Status.md) |  | 
**comments** | [**List&lt;Comment&gt;**](Comment.md) | comments associated to the tickets. May not be filled |  [optional]



