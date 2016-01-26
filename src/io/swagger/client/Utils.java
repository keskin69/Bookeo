package io.swagger.client;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class Utils {
	public static String getResponseMessage(HttpResponse response, String jsonBody) {
		String message = null;
		int statusCode = response.getStatusLine().getStatusCode();
		if (statusCode != 201) {
			System.out.println(jsonBody);

			HttpEntity entity = response.getEntity();
			if (entity != null) {
				try {
					String retSrc = EntityUtils.toString(entity);
					// parsing JSON
					JSONObject result = new JSONObject(retSrc);

					message = result.get("message").toString();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		} else {
			Header headers[] = response.getAllHeaders();
			for (Header h : headers) {
				if (h.getName().equals("Location")) {
					message = h.getValue();
				}
			}
		}
		
		return message;
	}

	public static HttpResponse postJSON(String json, String apiBase) {
		HttpResponse response = null;
		HttpClient httpClient = HttpClientBuilder.create().build();
		try {
			HttpPost post = new HttpPost(apiBase);
			StringEntity postingString = new StringEntity(json);

			post.setEntity(postingString);
			post.setHeader("Content-type", "application/json");
			response = httpClient.execute(post);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return response;
	}

	public static Object readObject() {
		Object obj = null;
		try {
			FileInputStream fin = new FileInputStream("C:\\Mustafa\\workspace\\DigiSig\\bookings.ser");
			ObjectInputStream ois = new ObjectInputStream(fin);
			try {
				obj = ois.readObject();
				ois.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return obj;
	}
}
