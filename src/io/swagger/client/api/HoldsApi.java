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
import io.swagger.client.model.Booking;
import io.swagger.client.model.Hold;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-16T13:57:18.496Z")
public class HoldsApi {
  private ApiClient apiClient;

  public HoldsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public HoldsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a temporary hold to finalize the booking
   * Performs a final check of the booking, and reserves required resources/seats to allow finalization of the booking process (ex. process payment).\n\n The returned object also contains the updated price calculations.\n\n Normally your application should have no more than one hold in place\nduring a customer booking process.\n\n Make sure to not leave many holds around. In any case, holds are deleted\nautomatically after a fixed time from creation.\n\n Note that when creating a hold, the customer field of the booking can be\nmissing, in which case Bookeo will assume a default customer coming from the same country as the account.
   * @param booking 
   * @param holdDurationSeconds the required seats/resources will be reserved for the specified time, ensuring that they cannot be taken by other bookings during this time. The hold cannot be for more than 10 minutes.
   * @param previousHoldId if a previous hold was created during the same session with the customer, it will be automatically removed and replaced by the new one.
   * @return void
   */
  public void holdsPost (Booking booking, Integer holdDurationSeconds, String previousHoldId) throws ApiException {
    Object postBody = booking;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'booking' is set
     if (booking == null) {
        throw new ApiException(400, "Missing the required parameter 'booking' when calling holdsPost");
     }
     
    // create path and map variables
    String path = "/holds".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "holdDurationSeconds", holdDurationSeconds));
    
    queryParams.addAll(apiClient.parameterToPairs("", "previousHoldId", previousHoldId));
    

    

    

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
   * Retrieve a hold previously generated
   * 
   * @param id 
   * @return Hold
   */
  public Hold holdsIdGet (String id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling holdsIdGet");
     }
     
    // create path and map variables
    String path = "/holds/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    

    
    
    TypeRef returnType = new TypeRef<Hold>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Delete a temporary hold
   * Delete a temporary hold previously created.\n Note that you can also delete a hold when creating a new hold (ex. when the customer goes back in the booking process and selects a different time), or when creating a booking (i.e. when the customer checks out), without having to make a separate call to this endpoint.
   * @param id 
   * @return void
   */
  public void holdsIdDelete (String id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling holdsIdDelete");
     }
     
    // create path and map variables
    String path = "/holds/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
