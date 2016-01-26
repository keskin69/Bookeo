package io.swagger.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.StringUtil;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-16T13:57:18.496Z")
public class Product   {
  
  private String name = null;
  private String description = null;
  private List<Image> images = new ArrayList<Image>();
  private String productId = null;
  private String productCode = null;
  private List<BookingLimit> bookingLimits = new ArrayList<BookingLimit>();
  private List<PriceRate> defaultRates = new ArrayList<PriceRate>();
  private Duration duration = null;

public enum TypeEnum {
  FIXED("fixed"),
  FIXEDCOURSE("fixedCourse"),
  FLEXIBLETIME("flexibleTime");

  private String value;

  TypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private TypeEnum type = null;
  private Boolean membersOnly = null;
  private Boolean prepaidOnly = null;
  private Boolean acceptDeny = null;
  private Boolean apiBookingsAllowed = null;

  
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
  @ApiModelProperty(value = "[read-only]")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(value = "[read-only]")
  @JsonProperty("images")
  public List<Image> getImages() {
    return images;
  }
  public void setImages(List<Image> images) {
    this.images = images;
  }

  
  /**
   * A unique, never changing id that identifies this product [read-only]
   **/
  @ApiModelProperty(required = true, value = "A unique, never changing id that identifies this product [read-only]")
  @JsonProperty("productId")
  public String getProductId() {
    return productId;
  }
  public void setProductId(String productId) {
    this.productId = productId;
  }

  
  /**
   * The product code chosen for this product by the account manager.\n It can (but rarely does) change [read-only]
   **/
  @ApiModelProperty(required = true, value = "The product code chosen for this product by the account manager.\n It can (but rarely does) change [read-only]")
  @JsonProperty("productCode")
  public String getProductCode() {
    return productCode;
  }
  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  
  /**
   * Defines, for each people category, how many people can be present in a single booking.\n\n If a people category is not included here, it means it is not\nsupported in this product. [read-only]
   **/
  @ApiModelProperty(required = true, value = "Defines, for each people category, how many people can be present in a single booking.\n\n If a people category is not included here, it means it is not\nsupported in this product. [read-only]")
  @JsonProperty("bookingLimits")
  public List<BookingLimit> getBookingLimits() {
    return bookingLimits;
  }
  public void setBookingLimits(List<BookingLimit> bookingLimits) {
    this.bookingLimits = bookingLimits;
  }

  
  /**
   * Define the STANDARD rates (prices) for each people category.\n\n These are the headline rates only. The business may have set special\nprices/rules, which will be calculated by Bookeo.\n\n If a product does not have any price, this field is not included.\n[read-only]
   **/
  @ApiModelProperty(value = "Define the STANDARD rates (prices) for each people category.\n\n These are the headline rates only. The business may have set special\nprices/rules, which will be calculated by Bookeo.\n\n If a product does not have any price, this field is not included.\n[read-only]")
  @JsonProperty("defaultRates")
  public List<PriceRate> getDefaultRates() {
    return defaultRates;
  }
  public void setDefaultRates(List<PriceRate> defaultRates) {
    this.defaultRates = defaultRates;
  }

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(required = true, value = "[read-only]")
  @JsonProperty("duration")
  public Duration getDuration() {
    return duration;
  }
  public void setDuration(Duration duration) {
    this.duration = duration;
  }

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(required = true, value = "[read-only]")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Whether this product can only be booked by current members [read-only]
   **/
  @ApiModelProperty(required = true, value = "Whether this product can only be booked by current members [read-only]")
  @JsonProperty("membersOnly")
  public Boolean getMembersOnly() {
    return membersOnly;
  }
  public void setMembersOnly(Boolean membersOnly) {
    this.membersOnly = membersOnly;
  }

  
  /**
   * Whether this product can only be booked by customers who have purchase prepaid credits for it. [read-only]
   **/
  @ApiModelProperty(required = true, value = "Whether this product can only be booked by customers who have purchase prepaid credits for it. [read-only]")
  @JsonProperty("prepaidOnly")
  public Boolean getPrepaidOnly() {
    return prepaidOnly;
  }
  public void setPrepaidOnly(Boolean prepaidOnly) {
    this.prepaidOnly = prepaidOnly;
  }

  
  /**
   * Whether the business has reserved the faculty to accept/deny any booking for this product.\n\n If this field is true, any booking submitted MAY not be confirmed\nimmediately, but instead tracked as a 'pending request'. [read-only]
   **/
  @ApiModelProperty(required = true, value = "Whether the business has reserved the faculty to accept/deny any booking for this product.\n\n If this field is true, any booking submitted MAY not be confirmed\nimmediately, but instead tracked as a 'pending request'. [read-only]")
  @JsonProperty("acceptDeny")
  public Boolean getAcceptDeny() {
    return acceptDeny;
  }
  public void setAcceptDeny(Boolean acceptDeny) {
    this.acceptDeny = acceptDeny;
  }

  
  /**
   * Whether API applications can query availability and create bookings for this product.\n\n The account manager can block some products from being booked via the\nAPI. [read-only]
   **/
  @ApiModelProperty(required = true, value = "Whether API applications can query availability and create bookings for this product.\n\n The account manager can block some products from being booked via the\nAPI. [read-only]")
  @JsonProperty("apiBookingsAllowed")
  public Boolean getApiBookingsAllowed() {
    return apiBookingsAllowed;
  }
  public void setApiBookingsAllowed(Boolean apiBookingsAllowed) {
    this.apiBookingsAllowed = apiBookingsAllowed;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    description: ").append(StringUtil.toIndentedString(description)).append("\n");
    sb.append("    images: ").append(StringUtil.toIndentedString(images)).append("\n");
    sb.append("    productId: ").append(StringUtil.toIndentedString(productId)).append("\n");
    sb.append("    productCode: ").append(StringUtil.toIndentedString(productCode)).append("\n");
    sb.append("    bookingLimits: ").append(StringUtil.toIndentedString(bookingLimits)).append("\n");
    sb.append("    defaultRates: ").append(StringUtil.toIndentedString(defaultRates)).append("\n");
    sb.append("    duration: ").append(StringUtil.toIndentedString(duration)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    membersOnly: ").append(StringUtil.toIndentedString(membersOnly)).append("\n");
    sb.append("    prepaidOnly: ").append(StringUtil.toIndentedString(prepaidOnly)).append("\n");
    sb.append("    acceptDeny: ").append(StringUtil.toIndentedString(acceptDeny)).append("\n");
    sb.append("    apiBookingsAllowed: ").append(StringUtil.toIndentedString(apiBookingsAllowed)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
