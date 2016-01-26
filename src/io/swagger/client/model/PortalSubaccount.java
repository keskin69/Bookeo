package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.StringUtil;


/**
 * Represents a Bookeo account, i.e. the business taking bookings, selling products, etc.
 **/
@ApiModel(description = "Represents a Bookeo account, i.e. the business taking bookings, selling products, etc.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-16T13:57:18.496Z")
public class PortalSubaccount   {
  
  private String id = null;
  private String name = null;

  
  /**
   * The unique id for this subaccount [read-only]
   **/
  @ApiModelProperty(required = true, value = "The unique id for this subaccount [read-only]")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The unique account name [read-only]
   **/
  @ApiModelProperty(required = true, value = "The unique account name [read-only]")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortalSubaccount {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
