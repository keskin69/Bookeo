package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.StringUtil;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-16T13:57:18.496Z")
public class PeopleCategory   {
  
  private String name = null;
  private String id = null;
  private Integer numSeats = null;

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(required = true, value = "[read-only]")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(required = true, value = "[read-only]")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * How many seats a unit of this category actually takes. Ex a category \"Family\" may take up 4 seats. [read-only]
   **/
  @ApiModelProperty(required = true, value = "How many seats a unit of this category actually takes. Ex a category \"Family\" may take up 4 seats. [read-only]")
  @JsonProperty("numSeats")
  public Integer getNumSeats() {
    return numSeats;
  }
  public void setNumSeats(Integer numSeats) {
    this.numSeats = numSeats;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeopleCategory {\n");
    
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    numSeats: ").append(StringUtil.toIndentedString(numSeats)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
