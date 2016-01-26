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
public class Slot   {
  
  private String eventId = null;
  private Date startTime = null;
  private Date endTime = null;
  private Integer numSeatsAvailable = null;
  private CourseSchedule courseSchedule = null;
  private List<Resource> resources = new ArrayList<Resource>();

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(required = true, value = "[read-only]")
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
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

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(required = true, value = "[read-only]")
  @JsonProperty("numSeatsAvailable")
  public Integer getNumSeatsAvailable() {
    return numSeatsAvailable;
  }
  public void setNumSeatsAvailable(Integer numSeatsAvailable) {
    this.numSeatsAvailable = numSeatsAvailable;
  }

  
  /**
   * If the product is of type fixedCourse, this includes the full schedule of the course.\n\n In this case startTime and endTime are the start and end times of the\nfirst event in the schedule. If late enrollment is enabled, startTime and endTime will refer to the first event in the course that is booked.\n\n If the product is not of type fixedCourse, this field is omitted.\n[read-only]
   **/
  @ApiModelProperty(value = "If the product is of type fixedCourse, this includes the full schedule of the course.\n\n In this case startTime and endTime are the start and end times of the\nfirst event in the schedule. If late enrollment is enabled, startTime and endTime will refer to the first event in the course that is booked.\n\n If the product is not of type fixedCourse, this field is omitted.\n[read-only]")
  @JsonProperty("courseSchedule")
  public CourseSchedule getCourseSchedule() {
    return courseSchedule;
  }
  public void setCourseSchedule(CourseSchedule courseSchedule) {
    this.courseSchedule = courseSchedule;
  }

  
  /**
   * Resources involved in this slot. This field is only included for products of type fixed or fixedCourse.\n\n Only resources whose type is \"public\" are listed here. [read-only]
   **/
  @ApiModelProperty(value = "Resources involved in this slot. This field is only included for products of type fixed or fixedCourse.\n\n Only resources whose type is \"public\" are listed here. [read-only]")
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
    sb.append("class Slot {\n");
    
    sb.append("    eventId: ").append(StringUtil.toIndentedString(eventId)).append("\n");
    sb.append("    startTime: ").append(StringUtil.toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(StringUtil.toIndentedString(endTime)).append("\n");
    sb.append("    numSeatsAvailable: ").append(StringUtil.toIndentedString(numSeatsAvailable)).append("\n");
    sb.append("    courseSchedule: ").append(StringUtil.toIndentedString(courseSchedule)).append("\n");
    sb.append("    resources: ").append(StringUtil.toIndentedString(resources)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
