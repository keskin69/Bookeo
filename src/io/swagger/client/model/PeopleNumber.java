package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.StringUtil;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-16T13:57:18.496Z")
public class PeopleNumber   {
  
  private String peopleCategoryId = null;
  private Integer number = null;

  
  /**
   * The id of the PeopleCategory to which these participants belong to. See /settings/peoplecategories
   **/
  @ApiModelProperty(required = true, value = "The id of the PeopleCategory to which these participants belong to. See /settings/peoplecategories")
  @JsonProperty("peopleCategoryId")
  public String getPeopleCategoryId() {
    return peopleCategoryId;
  }
  public void setPeopleCategoryId(String peopleCategoryId) {
    this.peopleCategoryId = peopleCategoryId;
  }

  
  /**
   * Indicates how many people of this category are in the booking
   **/
  @ApiModelProperty(required = true, value = "Indicates how many people of this category are in the booking")
  @JsonProperty("number")
  public Integer getNumber() {
    return number;
  }
  public void setNumber(Integer number) {
    this.number = number;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeopleNumber {\n");
    
    sb.append("    peopleCategoryId: ").append(StringUtil.toIndentedString(peopleCategoryId)).append("\n");
    sb.append("    number: ").append(StringUtil.toIndentedString(number)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
