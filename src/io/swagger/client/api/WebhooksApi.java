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
import io.swagger.client.model.Webhook;
import io.swagger.client.model.WebhooksList;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-16T13:57:18.496Z")
public class WebhooksApi {
  private ApiClient apiClient;

  public WebhooksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WebhooksApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * List all webhooks
   * Retrieve all the webhooks for this api key
   * @return WebhooksList
   */
  public WebhooksList webhooksGet () throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/webhooks".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<WebhooksList>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Create a new webhook
   * Note that if an existing webhook for the same domain and type was already set for this api key, it will be automatically replaced by this new webhook.\n\n In other words, there can be only one webhook for each combination of\ndomain and type, for an API key.\n\n So to upgrade an existing webhook URL, simply create a new one with the\nsame domain and type, but a different URL.\n\n\n\n For webhook with domain \&quot;bookings\&quot; and type \&quot;deleted\&quot;, the notification\nwill be sent whether the booking is canceled or completely deleted.\n\n Users can delete bookings by, for example, deleting their associated\ncustomer.\n\n Also note that these \&quot;bookings\&quot; \&quot;deleted\&quot; notifications are sent even\nfor bookings in the past.
   * @param webhook 
   * @return void
   */
  public void webhooksPost (Webhook webhook) throws ApiException {
    Object postBody = webhook;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'webhook' is set
     if (webhook == null) {
        throw new ApiException(400, "Missing the required parameter 'webhook' when calling webhooksPost");
     }
     
    // create path and map variables
    String path = "/webhooks".replaceAll("\\{format\\}","json");

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
   * Retrieve a webhook
   * Retrieve a webhook
   * @param webhookId 
   * @return Webhook
   */
  public Webhook webhooksWebhookIdGet (String webhookId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'webhookId' is set
     if (webhookId == null) {
        throw new ApiException(400, "Missing the required parameter 'webhookId' when calling webhooksWebhookIdGet");
     }
     
    // create path and map variables
    String path = "/webhooks/{webhookId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "webhookId" + "\\}", apiClient.escapeString(webhookId.toString()));

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

    

    
    
    TypeRef returnType = new TypeRef<Webhook>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Delete a webhook
   * Delete a webhook
   * @param webhookId 
   * @return void
   */
  public void webhooksWebhookIdDelete (String webhookId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'webhookId' is set
     if (webhookId == null) {
        throw new ApiException(400, "Missing the required parameter 'webhookId' when calling webhooksWebhookIdDelete");
     }
     
    // create path and map variables
    String path = "/webhooks/{webhookId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "webhookId" + "\\}", apiClient.escapeString(webhookId.toString()));

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
