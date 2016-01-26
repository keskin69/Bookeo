package io.swagger.client;

@SuppressWarnings("restriction")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-16T13:57:18.496Z")
public class Configuration {
	public static String apiKey = null;
	public static String secretKey = null;

	private static ApiClient defaultApiClient = null;

	public static void setKey(String aKey, String sKey) {
		apiKey = aKey;
		secretKey = sKey;
		defaultApiClient = new ApiClient();
	}

	/**
	 * Get the default API client, which would be used when creating API
	 * instances without providing an API client.
	 */
	public static ApiClient getDefaultApiClient() {
		return defaultApiClient;
	}

	/**
	 * Set the default API client, which would be used when creating API
	 * instances without providing an API client.
	 */
	public static void setDefaultApiClient(ApiClient apiClient) {
		defaultApiClient = apiClient;
	}
}
