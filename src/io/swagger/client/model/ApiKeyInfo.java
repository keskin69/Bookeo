package io.swagger.client.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.StringUtil;


/**
 * Provides detailed information about the API Key being used.
 **/
@ApiModel(description = "Provides detailed information about the API Key being used.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-16T13:57:18.496Z")
public class ApiKeyInfo   {
  
  private String accountId = null;
  private List<String> permissions = new ArrayList<String>();
  private Date creationTime = null;

  
  /**
   * The unique identifier of the business (Bookeo account) that has installed this key.\n\n If the application is uninstalled, and then installed again for the\nsame business, the api key would change, but the businessId would not. [read-only]
   **/
  @ApiModelProperty(required = true, value = "The unique identifier of the business (Bookeo account) that has installed this key.\n\n If the application is uninstalled, and then installed again for the\nsame business, the api key would change, but the businessId would not. [read-only]")
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(required = true, value = "[read-only]")
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyInfo {\n");
    
    sb.append("    accountId: ").append(StringUtil.toIndentedString(accountId)).append("\n");
    sb.append("    permissions: ").append(StringUtil.toIndentedString(permissions)).append("\n");
    sb.append("    creationTime: ").append(StringUtil.toIndentedString(creationTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
