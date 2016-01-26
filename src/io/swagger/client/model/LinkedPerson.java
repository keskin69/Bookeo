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
public class LinkedPerson   {
  
  private String id = null;
  private String firstName = null;
  private String middleName = null;
  private String lastName = null;
  private String emailAddress = null;
  private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
  private StreetAddress streetAddress = null;
  private Date creationTime = null;
  private Date startTimeOfNextBooking = null;
  private Date startTimeOfPreviousBooking = null;
  private Date dateOfBirth = null;
  private List<CustomField> customFields = new ArrayList<CustomField>();
  private String customerId = null;

  
  /**
   * Globally unique ID that identifies this person [read-only]
   **/
  @ApiModelProperty(required = true, value = "Globally unique ID that identifies this person [read-only]")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("phoneNumbers")
  public List<PhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }
  public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("streetAddress")
  public StreetAddress getStreetAddress() {
    return streetAddress;
  }
  public void setStreetAddress(StreetAddress streetAddress) {
    this.streetAddress = streetAddress;
  }

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(required = true, value = "[read-only]")
  @JsonProperty("creationTime")
  public Date getCreationTime() {
    return creationTime;
  }
  public void setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
  }

  
  /**
   * The start time of the next booking. null if there are no bookings starting after 'now'. [read-only]
   **/
  @ApiModelProperty(value = "The start time of the next booking. null if there are no bookings starting after 'now'. [read-only]")
  @JsonProperty("startTimeOfNextBooking")
  public Date getStartTimeOfNextBooking() {
    return startTimeOfNextBooking;
  }
  public void setStartTimeOfNextBooking(Date startTimeOfNextBooking) {
    this.startTimeOfNextBooking = startTimeOfNextBooking;
  }

  
  /**
   * The start time of the last booking that occurred before 'now'. It is updated only after that booking's stop time [read-only]
   **/
  @ApiModelProperty(value = "The start time of the last booking that occurred before 'now'. It is updated only after that booking's stop time [read-only]")
  @JsonProperty("startTimeOfPreviousBooking")
  public Date getStartTimeOfPreviousBooking() {
    return startTimeOfPreviousBooking;
  }
  public void setStartTimeOfPreviousBooking(Date startTimeOfPreviousBooking) {
    this.startTimeOfPreviousBooking = startTimeOfPreviousBooking;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("dateOfBirth")
  public Date getDateOfBirth() {
    return dateOfBirth;
  }
  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("customFields")
  public List<CustomField> getCustomFields() {
    return customFields;
  }
  public void setCustomFields(List<CustomField> customFields) {
    this.customFields = customFields;
  }

  
  /**
   * The id of the customer to whom this person is linked. [read-only]
   **/
  @ApiModelProperty(required = true, value = "The id of the customer to whom this person is linked. [read-only]")
  @JsonProperty("customerId")
  public String getCustomerId() {
    return customerId;
  }
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedPerson {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(StringUtil.toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(StringUtil.toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(StringUtil.toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(StringUtil.toIndentedString(emailAddress)).append("\n");
    sb.append("    phoneNumbers: ").append(StringUtil.toIndentedString(phoneNumbers)).append("\n");
    sb.append("    streetAddress: ").append(StringUtil.toIndentedString(streetAddress)).append("\n");
    sb.append("    creationTime: ").append(StringUtil.toIndentedString(creationTime)).append("\n");
    sb.append("    startTimeOfNextBooking: ").append(StringUtil.toIndentedString(startTimeOfNextBooking)).append("\n");
    sb.append("    startTimeOfPreviousBooking: ").append(StringUtil.toIndentedString(startTimeOfPreviousBooking)).append("\n");
    sb.append("    dateOfBirth: ").append(StringUtil.toIndentedString(dateOfBirth)).append("\n");
    sb.append("    customFields: ").append(StringUtil.toIndentedString(customFields)).append("\n");
    sb.append("    customerId: ").append(StringUtil.toIndentedString(customerId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
