package io.swagger.client.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.StringUtil;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-16T13:57:18.496Z")
public class MatchingSlotsSearchParameters   {
  
  private String productId = null;
  private Date startTime = null;
  private Date endTime = null;
  private List<PeopleNumber> peopleNumbers = new ArrayList<PeopleNumber>();
  private List<BookingOption> options = new ArrayList<BookingOption>();
  private List<Resource> resources = new ArrayList<Resource>();

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("productId")
  public String getProductId() {
    return productId;
  }
  public void setProductId(String productId) {
    this.productId = productId;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("peopleNumbers")
  public List<PeopleNumber> getPeopleNumbers() {
    return peopleNumbers;
  }
  public void setPeopleNumbers(List<PeopleNumber> peopleNumbers) {
    this.peopleNumbers = peopleNumbers;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("options")
  public List<BookingOption> getOptions() {
    return options;
  }
  public void setOptions(List<BookingOption> options) {
    this.options = options;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("resources")
  public List<Resource> getResources() {
    return resources;
  }
  public void setResources(List<Resource> resources) {
    this.resources = resources;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchingSlotsSearchParameters {\n");
    
    sb.append("    productId: ").append(StringUtil.toIndentedString(productId)).append("\n");
    sb.append("    startTime: ").append(StringUtil.toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(StringUtil.toIndentedString(endTime)).append("\n");
    sb.append("    peopleNumbers: ").append(StringUtil.toIndentedString(peopleNumbers)).append("\n");
    sb.append("    options: ").append(StringUtil.toIndentedString(options)).append("\n");
    sb.append("    resources: ").append(StringUtil.toIndentedString(resources)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
