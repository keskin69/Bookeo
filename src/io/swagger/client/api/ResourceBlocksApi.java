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
import io.swagger.client.model.ResourceBlock;
import io.swagger.client.model.ResourceBlocksList;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-16T13:57:18.496Z")
public class ResourceBlocksApi {
	private ApiClient apiClient;

	public ResourceBlocksApi() {
		this(Configuration.getDefaultApiClient());
	}

	public ResourceBlocksApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * Retrieve resource blocks Retrieve existing resource blocks\n\n The result
	 * is limited by the permissions of the apiKey.\n\n &lt;p/&gt;\n\n It is
	 * possible to filter by time blocked and/or time of the last\nchange.\n\n
	 * To filter by time blocked, the parameters startTime and endTime
	 * are\nrequired.\n\n To filter by last time changed, the parameters
	 * lastUpdatedStartTime and\nlastUpdatedEndTime are required.\n\n It is
	 * possible to filter by both at the same time. At least one of the\ntwo
	 * filters must be used.\n\n &lt;p/&gt;\n\n It is further possible to filter
	 * by resource.
	 * 
	 * @param startTime
	 *            if specified, only include blocks that start on or after this
	 *            time. If specified, endTime must be specified as well.
	 * @param endTime
	 *            if specified, only include blocks that start on or before this
	 *            time. If specified, startTime must be specified as well. The
	 *            maximum allowed interval is 31 days.
	 * @param lastUpdatedStartTime
	 *            if specified, only include blocks that were last changed (or
	 *            created) on or after this time. If specified,
	 *            lastUpdatedEndTime must be specified as well.
	 * @param lastUpdatedEndTime
	 *            if specified, only include blocks that were last changed (or
	 *            created) on or before this time. If specified,
	 *            lastUpdatedStartTime must be specified as well. The maximum
	 *            allowed interval is 31 days.
	 * @param resourceId
	 *            if specified, only include blocks that affect this resource
	 * @param itemsPerPage
	 *            maximum: 100
	 * @param pageNavigationToken
	 * @param pageNumber
	 * @return ResourceBlocksList
	 */
	public ResourceBlocksList resourceblocksGet(Date startTime, Date endTime, Date lastUpdatedStartTime,
			Date lastUpdatedEndTime, String resourceId, Integer itemsPerPage, String pageNavigationToken,
			Integer pageNumber) throws ApiException {
		Object postBody = null;
		byte[] postBinaryBody = null;

		// create path and map variables
		String path = "/resourceblocks".replaceAll("\\{format\\}", "json");

		// query params
		List<Pair> queryParams = new ArrayList<Pair>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, Object> formParams = new HashMap<String, Object>();

		queryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));

		queryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));

		queryParams.addAll(apiClient.parameterToPairs("", "lastUpdatedStartTime", lastUpdatedStartTime));

		queryParams.addAll(apiClient.parameterToPairs("", "lastUpdatedEndTime", lastUpdatedEndTime));

		queryParams.addAll(apiClient.parameterToPairs("", "resourceId", resourceId));

		queryParams.addAll(apiClient.parameterToPairs("", "itemsPerPage", itemsPerPage));

		queryParams.addAll(apiClient.parameterToPairs("", "pageNavigationToken", pageNavigationToken));

		queryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));

		final String[] accepts = { "application/json" };
		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = { "application/json" };
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] { "keyAuth", "secretKey" };

		TypeRef returnType = new TypeRef<ResourceBlocksList>() {
		};
		return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept,
				contentType, authNames, returnType);

	}

	/**
	 * Create a new resource block \&quot;blocks\&quot; time for one or more
	 * resources, so that they&#39;re not available for booking.\n\n A resource
	 * block must be for at least one resource, but it can block\nmore than
	 * one.\n\n When setting the resources in the block, only the id is
	 * required.
	 * 
	 * @param block
	 * @return void
	 */
	public void resourceblocksPost(ResourceBlock block) throws ApiException {
		Object postBody = block;
		byte[] postBinaryBody = null;

		// verify the required parameter 'block' is set
		if (block == null) {
			throw new ApiException(400, "Missing the required parameter 'block' when calling resourceblocksPost");
		}

		// create path and map variables
		String path = "/resourceblocks".replaceAll("\\{format\\}", "json");

		// query params
		List<Pair> queryParams = new ArrayList<Pair>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, Object> formParams = new HashMap<String, Object>();

		final String[] accepts = { "application/json" };
		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = { "application/json" };
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept,
				contentType, authNames, null);

	}

	/**
	 * Retrieve a block Retrieve a block by its id
	 * 
	 * @param id
	 * @return ResourceBlock
	 */
	public ResourceBlock resourceblocksIdGet(String id) throws ApiException {
		Object postBody = null;
		byte[] postBinaryBody = null;

		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling resourceblocksIdGet");
		}

		// create path and map variables
		String path = "/resourceblocks/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",
				apiClient.escapeString(id.toString()));

		// query params
		List<Pair> queryParams = new ArrayList<Pair>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, Object> formParams = new HashMap<String, Object>();

		final String[] accepts = { "application/json" };
		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = { "application/json" };
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		TypeRef returnType = new TypeRef<ResourceBlock>() {
		};
		return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept,
				contentType, authNames, returnType);

	}

	/**
	 * Update an existing block A resource block must be for at least one
	 * resource, but it can block more than one.\n\n When setting the resources
	 * in the block, only the id is required.
	 * 
	 * @param block
	 * @param id
	 * @return void
	 */
	public void resourceblocksIdPut(ResourceBlock block, String id) throws ApiException {
		Object postBody = block;
		byte[] postBinaryBody = null;

		// verify the required parameter 'block' is set
		if (block == null) {
			throw new ApiException(400, "Missing the required parameter 'block' when calling resourceblocksIdPut");
		}

		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling resourceblocksIdPut");
		}

		// create path and map variables
		String path = "/resourceblocks/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",
				apiClient.escapeString(id.toString()));

		// query params
		List<Pair> queryParams = new ArrayList<Pair>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, Object> formParams = new HashMap<String, Object>();

		final String[] accepts = { "application/json" };
		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = { "application/json" };
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept,
				contentType, authNames, null);

	}

	/**
	 * Delete a block
	 * 
	 * @param id
	 * @return void
	 */
	public void resourceblocksIdDelete(String id) throws ApiException {
		Object postBody = null;
		byte[] postBinaryBody = null;

		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling resourceblocksIdDelete");
		}

		// create path and map variables
		String path = "/resourceblocks/{id}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",
				apiClient.escapeString(id.toString()));

		// query params
		List<Pair> queryParams = new ArrayList<Pair>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, Object> formParams = new HashMap<String, Object>();

		final String[] accepts = { "application/json" };
		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = { "application/json" };
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept,
				contentType, authNames, null);

	}

}
