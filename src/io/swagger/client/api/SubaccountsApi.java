package io.swagger.client.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;
import io.swagger.client.model.PortalSubaccountsList;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-16T13:57:18.496Z")
public class SubaccountsApi {
  private ApiClient apiClient;

  public SubaccountsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SubaccountsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * List all subaccounts in the portal
   * Retrieve all the webhooks for this api key
   * @param itemsPerPage maximum: 300
   * @param pageNavigationToken 
   * @param pageNumber 
   * @return PortalSubaccountsList
   */
  public PortalSubaccountsList subaccountsGet (Integer itemsPerPage, String pageNavigationToken, Integer pageNumber) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/subaccounts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "itemsPerPage", itemsPerPage));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pageNavigationToken", pageNavigationToken));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<PortalSubaccountsList>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Create a new API Key for this application to access a subaccount
   * Install this application in a subaccount.\n\n Note that the API key used in this call must be that of the portal\nmanager account. The application installed in the subaccount will be the same as this one, with the same permissions.\n\n If this application was already installed in the subaccount, its API key\nwill be replaced by the one created in this call.
   * @param subaccountId the id of the subaccount where to install this application
   * @return void
   */
  public void subaccountsSubaccountIdApikeysPost (String subaccountId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'subaccountId' is set
     if (subaccountId == null) {
        throw new ApiException(400, "Missing the required parameter 'subaccountId' when calling subaccountsSubaccountIdApikeysPost");
     }
     
    // create path and map variables
    String path = "/subaccounts/{subaccountId}/apikeys".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "subaccountId" + "\\}", apiClient.escapeString(subaccountId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    


  }
  
  /**
   * Delete the API Key for this application from a subaccount
   * Uninstall this application from a subaccount.
   * @param subaccountId 
   * @param apiKey 
   * @return void
   */
  public void subaccountsSubaccountIdApikeysApiKeyDelete (String subaccountId, String apiKey) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'subaccountId' is set
     if (subaccountId == null) {
        throw new ApiException(400, "Missing the required parameter 'subaccountId' when calling subaccountsSubaccountIdApikeysApiKeyDelete");
     }
     
     // verify the required parameter 'apiKey' is set
     if (apiKey == null) {
        throw new ApiException(400, "Missing the required parameter 'apiKey' when calling subaccountsSubaccountIdApikeysApiKeyDelete");
     }
     
    // create path and map variables
    String path = "/subaccounts/{subaccountId}/apikeys/{apiKey}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "subaccountId" + "\\}", apiClient.escapeString(subaccountId.toString()))
      .replaceAll("\\{" + "apiKey" + "\\}", apiClient.escapeString(apiKey.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    


  }
  
}
