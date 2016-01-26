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
import io.swagger.client.model.ApiKeyInfo;
import io.swagger.client.model.Business;
import io.swagger.client.model.LanguagesList;
import io.swagger.client.model.PeopleCategoryList;
import io.swagger.client.model.ProductList;
import io.swagger.client.model.ResourceTypesList;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-16T13:57:18.496Z")
public class SettingsApi {
	private ApiClient apiClient;

	public SettingsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public SettingsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * Get information about your own API Key
	 * 
	 * @return ApiKeyInfo
	 */
	public ApiKeyInfo settingsApikeyinfoGet() throws ApiException {
		Object postBody = null;
		byte[] postBinaryBody = null;

		// create path and map variables
		String path = "/settings/apikeyinfo".replaceAll("\\{format\\}", "json");

		// query params
		List<Pair> queryParams = new ArrayList<Pair>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, Object> formParams = new HashMap<String, Object>();

		final String[] accepts = { "application/json" };
		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = { "application/json" };
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] { "keyAuth", "secretKey" };

		TypeRef returnType = new TypeRef<ApiKeyInfo>() {
		};
		return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept,
				contentType, authNames, returnType);

	}

	/**
	 * Get information, location and contact details about the business
	 * 
	 * @return Business
	 */
	public Business settingsBusinessGet() throws ApiException {
		Object postBody = null;
		byte[] postBinaryBody = null;

		// create path and map variables
		String path = "/settings/business".replaceAll("\\{format\\}", "json");

		// query params
		List<Pair> queryParams = new ArrayList<Pair>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, Object> formParams = new HashMap<String, Object>();

		final String[] accepts = { "application/json" };
		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = { "application/json" };
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] { "keyAuth", "secretKey" };

		TypeRef returnType = new TypeRef<Business>() {
		};
		return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept,
				contentType, authNames, returnType);

	}

	/**
	 * Retrieve all supported languages
	 * 
	 * @return LanguagesList
	 */
	public LanguagesList settingsLanguagesGet() throws ApiException {
		Object postBody = null;
		byte[] postBinaryBody = null;

		// create path and map variables
		String path = "/settings/languages".replaceAll("\\{format\\}", "json");

		// query params
		List<Pair> queryParams = new ArrayList<Pair>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, Object> formParams = new HashMap<String, Object>();

		final String[] accepts = { "application/json" };
		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = { "application/json" };
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] { "keyAuth", "secretKey" };

		TypeRef returnType = new TypeRef<LanguagesList>() {
		};
		return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept,
				contentType, authNames, returnType);

	}

	/**
	 * Retrieve all supported people categories Retrieve the people categories
	 * supported by this account.\n This can include the default ones
	 * (\&quot;Adults\&quot;,\&quot;Children\&quot;,\&quot;Infants\&quot;) and
	 * also custom ones defined by the account (\&quot;Students\&quot;, ...)
	 * 
	 * @return PeopleCategoryList
	 */
	public PeopleCategoryList settingsPeoplecategoriesGet() throws ApiException {
		Object postBody = null;
		byte[] postBinaryBody = null;

		// create path and map variables
		String path = "/settings/peoplecategories".replaceAll("\\{format\\}", "json");

		// query params
		List<Pair> queryParams = new ArrayList<Pair>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, Object> formParams = new HashMap<String, Object>();

		final String[] accepts = { "application/json" };
		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = { "application/json" };
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] { "keyAuth", "secretKey" };

		TypeRef returnType = new TypeRef<PeopleCategoryList>() {
		};
		return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept,
				contentType, authNames, returnType);

	}

	/**
	 * Get information about the products offered Get information about all the
	 * products (things that can be booked) offered.\n\n 3 types of product are
	 * available:\n\n - fixed are products with a fixed schedule and a given
	 * number of seats.\nEx a group tour, a class, a workshop\n\n - fixedCourse
	 * are fixed products that are defined as a course, i.e.\ncomprise of a
	 * series of dates\n\n - flexibleTime are products that describe private
	 * appointments, i.e.\nwhen one booking uses one resource (teacher,
	 * consultant, etc)\n\n\n\n Although Bookeo applies a minimum amount of
	 * caching, it is recommended\nto cache these results for 10-15 minutes to
	 * improve the performance of your application, as product settings change
	 * rarely.
	 * 
	 * @param type
	 *            if not specified, get all products
	 * @param itemsPerPage
	 *            .\nmaximum: 100
	 * @param pageNavigationToken
	 * @param pageNumber
	 * @return ProductList
	 */
	public ProductList settingsProductsGet(String type, Integer itemsPerPage, String pageNavigationToken,
			Integer pageNumber) throws ApiException {
		Object postBody = null;
		byte[] postBinaryBody = null;

		// create path and map variables
		String path = "/settings/products".replaceAll("\\{format\\}", "json");

		// query params
		List<Pair> queryParams = new ArrayList<Pair>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, Object> formParams = new HashMap<String, Object>();

		queryParams.addAll(apiClient.parameterToPairs("", "type", type));

		queryParams.addAll(apiClient.parameterToPairs("", "itemsPerPage", itemsPerPage));

		queryParams.addAll(apiClient.parameterToPairs("", "pageNavigationToken", pageNavigationToken));

		queryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));

		final String[] accepts = { "application/json" };
		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = { "application/json" };
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] { "keyAuth", "secretKey" };

		TypeRef<ProductList> returnType = new TypeRef<ProductList>() {
		};
		return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept,
				contentType, authNames, returnType);

	}

	/**
	 * Retrieve all available resources
	 * 
	 * @param itemsPerPage
	 *            maximum: 100
	 * @param pageNavigationToken
	 * @param pageNumber
	 * @return ResourceTypesList
	 */
	public ResourceTypesList settingsResourcesGet(Integer itemsPerPage, String pageNavigationToken, Integer pageNumber)
			throws ApiException {
		Object postBody = null;
		byte[] postBinaryBody = null;

		// create path and map variables
		String path = "/settings/resources".replaceAll("\\{format\\}", "json");

		// query params
		List<Pair> queryParams = new ArrayList<Pair>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, Object> formParams = new HashMap<String, Object>();

		queryParams.addAll(apiClient.parameterToPairs("", "itemsPerPage", itemsPerPage));

		queryParams.addAll(apiClient.parameterToPairs("", "pageNavigationToken", pageNavigationToken));

		queryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));

		final String[] accepts = { "application/json" };
		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = { "application/json" };
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		TypeRef returnType = new TypeRef<ResourceTypesList>() {
		};
		return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept,
				contentType, authNames, returnType);

	}

}
