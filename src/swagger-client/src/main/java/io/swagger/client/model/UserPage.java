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
 * a paging-object containing users
 */
@ApiModel(description = "a paging-object containing users")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T09:00:24.682Z")
public class UserPage {
  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("total")
  private Integer total = null;

  @SerializedName("items")
  private List<User> items = null;

  public UserPage offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * offset of the number of users skipped
   * minimum: 0
   * @return offset
  **/
  @ApiModelProperty(value = "offset of the number of users skipped")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public UserPage limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * amount of users that should have been returned
   * minimum: 1
   * maximum: 50
   * @return limit
  **/
  @ApiModelProperty(value = "amount of users that should have been returned")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public UserPage total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * total amount of users loaded by the request
   * minimum: 0
   * @return total
  **/
  @ApiModelProperty(value = "total amount of users loaded by the request")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public UserPage items(List<User> items) {
    this.items = items;
    return this;
  }

  public UserPage addItemsItem(User itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<User>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<User> getItems() {
    return items;
  }

  public void setItems(List<User> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPage userPage = (UserPage) o;
    return Objects.equals(this.offset, userPage.offset) &&
        Objects.equals(this.limit, userPage.limit) &&
        Objects.equals(this.total, userPage.total) &&
        Objects.equals(this.items, userPage.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, limit, total, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPage {\n");
    
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

