package io.swagger.client.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;
import io.swagger.client.model.MatchingSlotList;
import io.swagger.client.model.MatchingSlotsSearchParameters;
import io.swagger.client.model.SlotList;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-16T13:57:18.496Z")
public class AvailabilityApi {
	private ApiClient apiClient;

	public AvailabilityApi() {
		this(Configuration.getDefaultApiClient());
	}

	public AvailabilityApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * Find available slots matching given search parameters Create a search for
	 * available slots that match the given search parameters.\n\n Note that
	 * there are two different searches possible, /availability/slots\nand
	 * /availability/matchingslots (this endpoint).\n\n The former simply shows
	 * the number of available seats for each available\nslot. The latter (this
	 * one) takes as input the participant numbers, and shows the slots that are
	 * available for those numbers, and an estimate of the price.\n\n Parameters
	 * include product code, number of people and options.\n\n The response
	 * contains a \&quot;Location\&quot; header, which can be invoked
	 * to\nnavigate the results of the search.
	 * 
	 * @param search
	 * @param itemsPerPage
	 *            .\nmaximum: 300
	 * @return void
	 */
	public void availabilityMatchingslotsPost(MatchingSlotsSearchParameters search, Integer itemsPerPage)
			throws ApiException {
		Object postBody = search;
		byte[] postBinaryBody = null;

		// verify the required parameter 'search' is set
		if (search == null) {
			throw new ApiException(400,
					"Missing the required parameter 'search' when calling availabilityMatchingslotsPost");
		}

		// create path and map variables
		String path = "/availability/matchingslots".replaceAll("\\{format\\}", "json");

		// query params
		List<Pair> queryParams = new ArrayList<Pair>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, Object> formParams = new HashMap<String, Object>();

		queryParams.addAll(apiClient.parameterToPairs("", "itemsPerPage", itemsPerPage));

		final String[] accepts = { "application/json" };
		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = { "application/json" };
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {"keyAuth", "secretKey"};

		apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept,
				contentType, authNames, null);

	}

	/**
	 * Navigate results of a matching slots search
	 * 
	 * @param pageNavigationToken
	 * @param pageNumber
	 * @return MatchingSlotList
	 */
	public MatchingSlotList availabilityMatchingslotsPageNavigationTokenGet(String pageNavigationToken,
			Integer pageNumber) throws ApiException {
		Object postBody = null;
		byte[] postBinaryBody = null;

		// verify the required parameter 'pageNavigationToken' is set
		if (pageNavigationToken == null) {
			throw new ApiException(400,
					"Missing the required parameter 'pageNavigationToken' when calling availabilityMatchingslotsPageNavigationTokenGet");
		}

		// create path and map variables
		String path = "/availability/matchingslots/{pageNavigationToken}".replaceAll("\\{format\\}", "json").replaceAll(
				"\\{" + "pageNavigationToken" + "\\}", apiClient.escapeString(pageNavigationToken.toString()));

		// query params
		List<Pair> queryParams = new ArrayList<Pair>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, Object> formParams = new HashMap<String, Object>();

		queryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));

		final String[] accepts = { "application/json" };
		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = { "application/json" };
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {"keyAuth", "secretKey"};

		TypeRef<MatchingSlotList> returnType = new TypeRef<MatchingSlotList>() {
		};
		return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept,
				contentType, authNames, returnType);

	}

	/**
	 * Get information about the availability of a product Performs a basic
	 * search to find available slots and number of seats in each.\n\n Note that
	 * there are two different searches possible, /availability/slots\n(this
	 * endpoint) and /availability/matchingslots .\n\n The former simply shows
	 * the number of available seats for each available\nslot. The latter takes
	 * as input the participant numbers, and shows the slots that are available
	 * for those numbers, and an estimate of the price.\n\n /availability/slots
	 * cannot be used for products of type flexibleTime\n. For those products,
	 * use /availability/matchingslots .
	 * 
	 * @param productId
	 *            the product code (see /availability/products). Required unless
	 *            pageNavigationToken is used. Note that the product must be of
	 *            type \&quot;fixed\&quot; or \&quot;fixedCourse\&quot;. For
	 *            products of type \&quot;flexibleTime\&quot;, use
	 *            /availability/matchingslots instead.
	 * @param startTime
	 *            the start time to search from. Required unless
	 *            pageNavigationToken is used.
	 * @param endTime
	 *            the end time to search to. Required unless pageNavigationToken
	 *            is used. The maximum date range in a single call is 31 days.
	 * @param itemsPerPage
	 *            .\nmaximum: 300
	 * @param pageNavigationToken
	 * @param pageNumber
	 * @return SlotList
	 */
	public SlotList availabilitySlotsGet(String productId, Date startTime, Date endTime, Integer itemsPerPage,
			String pageNavigationToken, Integer pageNumber) throws ApiException {
		Object postBody = null;
		byte[] postBinaryBody = null;

		// create path and map variables
		String path = "/availability/slots".replaceAll("\\{format\\}", "json");

		// query params
		List<Pair> queryParams = new ArrayList<Pair>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, Object> formParams = new HashMap<String, Object>();

		queryParams.addAll(apiClient.parameterToPairs("", "productId", productId));

		queryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));

		queryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));

		queryParams.addAll(apiClient.parameterToPairs("", "itemsPerPage", itemsPerPage));

		queryParams.addAll(apiClient.parameterToPairs("", "pageNavigationToken", pageNavigationToken));

		queryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));

		final String[] accepts = { "application/json" };
		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = { "application/json" };
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {"keyAuth", "secretKey"};

		TypeRef<SlotList> returnType = new TypeRef<SlotList>() {
		};
		return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept,
				contentType, authNames, returnType);

	}

}
