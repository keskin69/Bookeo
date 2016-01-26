package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.StringUtil;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-16T13:57:18.496Z")
public class BookingLimit   {
  
  private String peopleCategoryId = null;
  private Integer min = null;
  private Integer max = null;

  
  /**
   * If not present, this limit represents the limit for the total number of people in the booking.\n\n If present, this limit represents how many people in the given\ncategory can be included in a single booking.\n\n To obtain a list of people categories for an account, call\n/settings/peoplecategories [read-only]
   **/
  @ApiModelProperty(value = "If not present, this limit represents the limit for the total number of people in the booking.\n\n If present, this limit represents how many people in the given\ncategory can be included in a single booking.\n\n To obtain a list of people categories for an account, call\n/settings/peoplecategories [read-only]")
  @JsonProperty("peopleCategoryId")
  public String getPeopleCategoryId() {
    return peopleCategoryId;
  }
  public void setPeopleCategoryId(String peopleCategoryId) {
    this.peopleCategoryId = peopleCategoryId;
  }

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(required = true, value = "[read-only]")
  @JsonProperty("min")
  public Integer getMin() {
    return min;
  }
  public void setMin(Integer min) {
    this.min = min;
  }

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(required = true, value = "[read-only]")
  @JsonProperty("max")
  public Integer getMax() {
    return max;
  }
  public void setMax(Integer max) {
    this.max = max;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingLimit {\n");
    
    sb.append("    peopleCategoryId: ").append(StringUtil.toIndentedString(peopleCategoryId)).append("\n");
    sb.append("    min: ").append(StringUtil.toIndentedString(min)).append("\n");
    sb.append("    max: ").append(StringUtil.toIndentedString(max)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
