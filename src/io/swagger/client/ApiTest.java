package io.swagger.client;

import io.swagger.client.api.CustomersApi;
import io.swagger.client.model.Customer;


public class ApiTest {
	public static Customer newCustomer(String name, String lastName, String eMail) {
		Customer customer = new Customer();
		customer.setFirstName(name);
		customer.setLastName(lastName);
		customer.setEmailAddress(eMail);
		customer.setPhoneNumbers(null);

		return customer;
	}

	public static void postCustomer(Customer newCustomer) {
		CustomersApi customerApi = new CustomersApi();
		try {
			// update customerApi String[] authNames = new String[] { "keyAuth",
			// "secretKey" };
			customerApi.customersPost(newCustomer);
		} catch (ApiException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Customer customer =  ApiTest.newCustomer("Custo5", "Santa5", "santa@gmail.com");
		ApiTest.postCustomer(customer);
	}

}
