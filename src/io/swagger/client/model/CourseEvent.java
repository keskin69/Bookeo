package io.swagger.client.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.StringUtil;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-16T13:57:18.496Z")
public class CourseEvent   {
  
  private Integer eventNumber = null;
  private Date startTime = null;
  private Date endTime = null;

  
  /**
   * The index of the event in the course. The first event is number 1. [read-only]
   **/
  @ApiModelProperty(required = true, value = "The index of the event in the course. The first event is number 1. [read-only]")
  @JsonProperty("eventNumber")
  public Integer getEventNumber() {
    return eventNumber;
  }
  public void setEventNumber(Integer eventNumber) {
    this.eventNumber = eventNumber;
  }

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(required = true, value = "[read-only]")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(required = true, value = "[read-only]")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseEvent {\n");
    
    sb.append("    eventNumber: ").append(StringUtil.toIndentedString(eventNumber)).append("\n");
    sb.append("    startTime: ").append(StringUtil.toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(StringUtil.toIndentedString(endTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
