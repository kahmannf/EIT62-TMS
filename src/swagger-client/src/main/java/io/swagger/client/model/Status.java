package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * a status that can be assigned to a ticket
 */
@ApiModel(description = "a status that can be assigned to a ticket")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T09:00:24.682Z")
public class Status {
  @SerializedName("ID")
  private Integer ID = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Color")
  private String color = null;

  public Status ID(Integer ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Unique id of the status
   * @return ID
  **/
  @ApiModelProperty(required = true, value = "Unique id of the status")
  public Integer getID() {
    return ID;
  }

  public void setID(Integer ID) {
    this.ID = ID;
  }

  public Status description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the status
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of the status")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Status color(String color) {
    this.color = color;
    return this;
  }

   /**
   * a color hex string
   * @return color
  **/
  @ApiModelProperty(value = "a color hex string")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.ID, status.ID) &&
        Objects.equals(this.description, status.description) &&
        Objects.equals(this.color, status.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, description, color);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

