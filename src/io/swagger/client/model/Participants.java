package io.swagger.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.StringUtil;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-16T13:57:18.496Z")
public class Participants   {
  
  private List<PeopleNumber> numbers = new ArrayList<PeopleNumber>();
  private List<Participant> details = new ArrayList<Participant>();

  
  /**
   * The number of participants in the booking, for each PeopleCategory.\n When reading a booking, this field is always present.\n This field is required when creating or updating a booking
   **/
  @ApiModelProperty(required = true, value = "The number of participants in the booking, for each PeopleCategory.\n When reading a booking, this field is always present.\n This field is required when creating or updating a booking")
  @JsonProperty("numbers")
  public List<PeopleNumber> getNumbers() {
    return numbers;
  }
  public void setNumbers(List<PeopleNumber> numbers) {
    this.numbers = numbers;
  }

  
  /**
   * Details about the participants in the booking, if available.\n\n When reading a booking, this field is present only if the parameter\nexpandParticipants is set to true.\n\n When creating or updating a booking, this field is optional
   **/
  @ApiModelProperty(value = "Details about the participants in the booking, if available.\n\n When reading a booking, this field is present only if the parameter\nexpandParticipants is set to true.\n\n When creating or updating a booking, this field is optional")
  @JsonProperty("details")
  public List<Participant> getDetails() {
    return details;
  }
  public void setDetails(List<Participant> details) {
    this.details = details;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Participants {\n");
    
    sb.append("    numbers: ").append(StringUtil.toIndentedString(numbers)).append("\n");
    sb.append("    details: ").append(StringUtil.toIndentedString(details)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
