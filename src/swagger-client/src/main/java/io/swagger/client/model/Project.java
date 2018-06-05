package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Project
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-05T11:14:24.857Z")
public class Project {
  @SerializedName("ID")
  private Integer ID = null;

  @SerializedName("Timestamp")
  private String timestamp = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Members")
  private List<User> members = null;

  public Project ID(Integer ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Unique id of the project
   * @return ID
  **/
  @ApiModelProperty(required = true, value = "Unique id of the project")
  public Integer getID() {
    return ID;
  }

  public void setID(Integer ID) {
    this.ID = ID;
  }

  public Project timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * creation timestamp of the project
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "creation timestamp of the project")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public Project description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Name of the project
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Name of the project")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Project members(List<User> members) {
    this.members = members;
    return this;
  }

  public Project addMembersItem(User membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<User>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Array of users the are project-members
   * @return members
  **/
  @ApiModelProperty(value = "Array of users the are project-members")
  public List<User> getMembers() {
    return members;
  }

  public void setMembers(List<User> members) {
    this.members = members;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.ID, project.ID) &&
        Objects.equals(this.timestamp, project.timestamp) &&
        Objects.equals(this.description, project.description) &&
        Objects.equals(this.members, project.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, timestamp, description, members);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

