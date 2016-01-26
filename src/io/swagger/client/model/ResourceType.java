package io.swagger.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.StringUtil;


/**
 * Types of resource used in private bookings or events.\n Consultants, teachers, guides, vehicles, etc.
 **/
@ApiModel(description = "Types of resource used in private bookings or events.\n Consultants, teachers, guides, vehicles, etc.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-16T13:57:18.496Z")
public class ResourceType   {
  
  private String name = null;
  private String id = null;
  private Boolean isPublic = null;
  private List<Resource> resources = new ArrayList<Resource>();

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(value = "[read-only]")
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
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Whether this type of resources should be shown to customers, and can be used as filter to search for availability [read-only]
   **/
  @ApiModelProperty(value = "Whether this type of resources should be shown to customers, and can be used as filter to search for availability [read-only]")
  @JsonProperty("isPublic")
  public Boolean getIsPublic() {
    return isPublic;
  }
  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(value = "[read-only]")
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
    sb.append("class ResourceType {\n");
    
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    isPublic: ").append(StringUtil.toIndentedString(isPublic)).append("\n");
    sb.append("    resources: ").append(StringUtil.toIndentedString(resources)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
