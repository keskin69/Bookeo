package io.swagger.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.StringUtil;


/**
 * Represents a Bookeo account, i.e. the business taking bookings, selling products, etc.
 **/
@ApiModel(description = "Represents a Bookeo account, i.e. the business taking bookings, selling products, etc.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-16T13:57:18.496Z")
public class Business   {
  
  private String id = null;
  private String name = null;
  private String legalIdentifiers = null;
  private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
  private String websiteURL = null;
  private String emailAddress = null;
  private StreetAddress streetAddress = null;
  private Image logo = null;
  private String description = null;

  
  /**
   * The unique id for this business (Bookeo account) [read-only]
   **/
  @ApiModelProperty(required = true, value = "The unique id for this business (Bookeo account) [read-only]")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
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
   * Tax ID, Vat ID, other legal identifiers [read-only]
   **/
  @ApiModelProperty(value = "Tax ID, Vat ID, other legal identifiers [read-only]")
  @JsonProperty("legalIdentifiers")
  public String getLegalIdentifiers() {
    return legalIdentifiers;
  }
  public void setLegalIdentifiers(String legalIdentifiers) {
    this.legalIdentifiers = legalIdentifiers;
  }

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(required = true, value = "[read-only]")
  @JsonProperty("phoneNumbers")
  public List<PhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }
  public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(value = "[read-only]")
  @JsonProperty("websiteURL")
  public String getWebsiteURL() {
    return websiteURL;
  }
  public void setWebsiteURL(String websiteURL) {
    this.websiteURL = websiteURL;
  }

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(value = "[read-only]")
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(required = true, value = "[read-only]")
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
  @ApiModelProperty(value = "[read-only]")
  @JsonProperty("logo")
  public Image getLogo() {
    return logo;
  }
  public void setLogo(Image logo) {
    this.logo = logo;
  }

  
  /**
   * A description of the business, provided by the business itself. The content is in HTML. [read-only]
   **/
  @ApiModelProperty(value = "A description of the business, provided by the business itself. The content is in HTML. [read-only]")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Business {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    legalIdentifiers: ").append(StringUtil.toIndentedString(legalIdentifiers)).append("\n");
    sb.append("    phoneNumbers: ").append(StringUtil.toIndentedString(phoneNumbers)).append("\n");
    sb.append("    websiteURL: ").append(StringUtil.toIndentedString(websiteURL)).append("\n");
    sb.append("    emailAddress: ").append(StringUtil.toIndentedString(emailAddress)).append("\n");
    sb.append("    streetAddress: ").append(StringUtil.toIndentedString(streetAddress)).append("\n");
    sb.append("    logo: ").append(StringUtil.toIndentedString(logo)).append("\n");
    sb.append("    description: ").append(StringUtil.toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
