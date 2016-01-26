package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.StringUtil;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-16T13:57:18.496Z")
public class PaginationInfo   {
  
  private Integer totalItems = null;
  private Integer totalPages = null;
  private Integer currentPage = null;
  private String pageNavigationToken = null;

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(required = true, value = "[read-only]")
  @JsonProperty("totalItems")
  public Integer getTotalItems() {
    return totalItems;
  }
  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(required = true, value = "[read-only]")
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }
  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(required = true, value = "[read-only]")
  @JsonProperty("currentPage")
  public Integer getCurrentPage() {
    return currentPage;
  }
  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  
  /**
   * If there are more than 1 pages of items available, you can use this token in more calls (combined with pageNumber) to navigate the results. When navigating pages, you do not need to include the search parameters again - just pageNavigationToken and pageNumber.\n\n If there is only one page, this field is not present in the response.\n[read-only]
   **/
  @ApiModelProperty(value = "If there are more than 1 pages of items available, you can use this token in more calls (combined with pageNumber) to navigate the results. When navigating pages, you do not need to include the search parameters again - just pageNavigationToken and pageNumber.\n\n If there is only one page, this field is not present in the response.\n[read-only]")
  @JsonProperty("pageNavigationToken")
  public String getPageNavigationToken() {
    return pageNavigationToken;
  }
  public void setPageNavigationToken(String pageNavigationToken) {
    this.pageNavigationToken = pageNavigationToken;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationInfo {\n");
    
    sb.append("    totalItems: ").append(StringUtil.toIndentedString(totalItems)).append("\n");
    sb.append("    totalPages: ").append(StringUtil.toIndentedString(totalPages)).append("\n");
    sb.append("    currentPage: ").append(StringUtil.toIndentedString(currentPage)).append("\n");
    sb.append("    pageNavigationToken: ").append(StringUtil.toIndentedString(pageNavigationToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
