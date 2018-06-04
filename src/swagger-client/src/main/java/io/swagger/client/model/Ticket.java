package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Comment;
import io.swagger.client.model.Status;
import io.swagger.client.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * a ticket
 */
@ApiModel(description = "a ticket")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T09:00:24.682Z")
public class Ticket {
  @SerializedName("ID")
  private Integer ID = null;

  @SerializedName("Timestamp")
  private String timestamp = null;

  @SerializedName("Userstory")
  private String userstory = null;

  @SerializedName("AcceptanceCriteria")
  private String acceptanceCriteria = null;

  @SerializedName("Title")
  private String title = null;

  @SerializedName("Creator")
  private User creator = null;

  @SerializedName("Status")
  private Status status = null;

  @SerializedName("Comments")
  private List<Comment> comments = null;

  public Ticket ID(Integer ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Unique id of the ticket
   * @return ID
  **/
  @ApiModelProperty(required = true, value = "Unique id of the ticket")
  public Integer getID() {
    return ID;
  }

  public void setID(Integer ID) {
    this.ID = ID;
  }

  public Ticket timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * creation timestamp of the ticket
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "creation timestamp of the ticket")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public Ticket userstory(String userstory) {
    this.userstory = userstory;
    return this;
  }

   /**
   * userstory associated to the ticket
   * @return userstory
  **/
  @ApiModelProperty(required = true, value = "userstory associated to the ticket")
  public String getUserstory() {
    return userstory;
  }

  public void setUserstory(String userstory) {
    this.userstory = userstory;
  }

  public Ticket acceptanceCriteria(String acceptanceCriteria) {
    this.acceptanceCriteria = acceptanceCriteria;
    return this;
  }

   /**
   * criteria that must be met to close the ticket
   * @return acceptanceCriteria
  **/
  @ApiModelProperty(required = true, value = "criteria that must be met to close the ticket")
  public String getAcceptanceCriteria() {
    return acceptanceCriteria;
  }

  public void setAcceptanceCriteria(String acceptanceCriteria) {
    this.acceptanceCriteria = acceptanceCriteria;
  }

  public Ticket title(String title) {
    this.title = title;
    return this;
  }

   /**
   * title of the ticket
   * @return title
  **/
  @ApiModelProperty(required = true, value = "title of the ticket")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Ticket creator(User creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @ApiModelProperty(required = true, value = "")
  public User getCreator() {
    return creator;
  }

  public void setCreator(User creator) {
    this.creator = creator;
  }

  public Ticket status(Status status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public Ticket comments(List<Comment> comments) {
    this.comments = comments;
    return this;
  }

  public Ticket addCommentsItem(Comment commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<Comment>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * comments associated to the tickets. May not be filled
   * @return comments
  **/
  @ApiModelProperty(value = "comments associated to the tickets. May not be filled")
  public List<Comment> getComments() {
    return comments;
  }

  public void setComments(List<Comment> comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ticket ticket = (Ticket) o;
    return Objects.equals(this.ID, ticket.ID) &&
        Objects.equals(this.timestamp, ticket.timestamp) &&
        Objects.equals(this.userstory, ticket.userstory) &&
        Objects.equals(this.acceptanceCriteria, ticket.acceptanceCriteria) &&
        Objects.equals(this.title, ticket.title) &&
        Objects.equals(this.creator, ticket.creator) &&
        Objects.equals(this.status, ticket.status) &&
        Objects.equals(this.comments, ticket.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, timestamp, userstory, acceptanceCriteria, title, creator, status, comments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ticket {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    userstory: ").append(toIndentedString(userstory)).append("\n");
    sb.append("    acceptanceCriteria: ").append(toIndentedString(acceptanceCriteria)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

