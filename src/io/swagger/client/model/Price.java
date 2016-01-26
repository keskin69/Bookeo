package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.StringUtil;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-16T13:57:18.496Z")
public class Price   {
  
  private Money totalGross = null;
  private Money totalNet = null;
  private Money totalTaxes = null;
  private Money totalPaid = null;

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(required = true, value = "[read-only]")
  @JsonProperty("totalGross")
  public Money getTotalGross() {
    return totalGross;
  }
  public void setTotalGross(Money totalGross) {
    this.totalGross = totalGross;
  }

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(required = true, value = "[read-only]")
  @JsonProperty("totalNet")
  public Money getTotalNet() {
    return totalNet;
  }
  public void setTotalNet(Money totalNet) {
    this.totalNet = totalNet;
  }

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(required = true, value = "[read-only]")
  @JsonProperty("totalTaxes")
  public Money getTotalTaxes() {
    return totalTaxes;
  }
  public void setTotalTaxes(Money totalTaxes) {
    this.totalTaxes = totalTaxes;
  }

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(required = true, value = "[read-only]")
  @JsonProperty("totalPaid")
  public Money getTotalPaid() {
    return totalPaid;
  }
  public void setTotalPaid(Money totalPaid) {
    this.totalPaid = totalPaid;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    
    sb.append("    totalGross: ").append(StringUtil.toIndentedString(totalGross)).append("\n");
    sb.append("    totalNet: ").append(StringUtil.toIndentedString(totalNet)).append("\n");
    sb.append("    totalTaxes: ").append(StringUtil.toIndentedString(totalTaxes)).append("\n");
    sb.append("    totalPaid: ").append(StringUtil.toIndentedString(totalPaid)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
