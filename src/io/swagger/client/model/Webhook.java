package io.swagger.client.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.StringUtil;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-16T13:57:18.496Z")
public class Webhook   {
  
  private String id = null;
  private String url = null;

public enum DomainEnum {
  BOOKINGS("bookings"),
  SEATBLOCKS("seatblocks"),
  RESOURCEBLOCKS("resourceblocks"),
  CUSTOMERS("customers"),
  PAYMENTS("payments");

  private String value;

  DomainEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private DomainEnum domain = null;

public enum TypeEnum {
  CREATED("created"),
  UPDATED("updated"),
  DELETED("deleted");

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
  private Date blockedTime = null;
  private String blockedReason = null;

  
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
   * The URL that Bookeo will request when an event triggers the webhook.\n The protocol must be https
   **/
  @ApiModelProperty(required = true, value = "The URL that Bookeo will request when an event triggers the webhook.\n The protocol must be https")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * What type of object this webhook applies to
   **/
  @ApiModelProperty(required = true, value = "What type of object this webhook applies to")
  @JsonProperty("domain")
  public DomainEnum getDomain() {
    return domain;
  }
  public void setDomain(DomainEnum domain) {
    this.domain = domain;
  }

  
  /**
   * What type of operation triggers this webhook
   **/
  @ApiModelProperty(required = true, value = "What type of operation triggers this webhook")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * If this field is present, it indicates that the webhook was blocked at this time.\n\n The blockedReason will indicate the reason for the block. Typically,\na webhook gets blocked when too many consecutive notifications are dropped due to repeat conection errors.\n\n Once a webhook is blocked, no more notifications will be sent to it.\nYour application will need to fix the cause of the block, and then create a new webhook. [read-only]
   **/
  @ApiModelProperty(value = "If this field is present, it indicates that the webhook was blocked at this time.\n\n The blockedReason will indicate the reason for the block. Typically,\na webhook gets blocked when too many consecutive notifications are dropped due to repeat conection errors.\n\n Once a webhook is blocked, no more notifications will be sent to it.\nYour application will need to fix the cause of the block, and then create a new webhook. [read-only]")
  @JsonProperty("blockedTime")
  public Date getBlockedTime() {
    return blockedTime;
  }
  public void setBlockedTime(Date blockedTime) {
    this.blockedTime = blockedTime;
  }

  
  /**
   * The reason why the webhook was blocked. [read-only]
   **/
  @ApiModelProperty(value = "The reason why the webhook was blocked. [read-only]")
  @JsonProperty("blockedReason")
  public String getBlockedReason() {
    return blockedReason;
  }
  public void setBlockedReason(String blockedReason) {
    this.blockedReason = blockedReason;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("    domain: ").append(StringUtil.toIndentedString(domain)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    blockedTime: ").append(StringUtil.toIndentedString(blockedTime)).append("\n");
    sb.append("    blockedReason: ").append(StringUtil.toIndentedString(blockedReason)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
