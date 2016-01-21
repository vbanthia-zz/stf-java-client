package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.DeviceListResponse;
import io.swagger.client.model.ErrorResponse;
import io.swagger.client.model.DeviceResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-21T02:18:31.391Z")
public class DevicesApi {
  private ApiClient apiClient;

  public DevicesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DevicesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Device List
   * The devices endpoint return list of all the STF devices including Disconnected and Offline
   * @param fields Fields query parameter takes a comma seperated list of fields. Only listed field will be return in response
   * @return DeviceListResponse
   */
  public DeviceListResponse getDevices(String fields) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/devices".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "accessTokenAuth" };

    
    GenericType<DeviceListResponse> returnType = new GenericType<DeviceListResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Device Information
   * The device enpoint return information about a single device
   * @param serial Device Serial
   * @param fields Fields query parameter takes a comma seperated list of fields. Only listed field will be return in response
   * @return DeviceResponse
   */
  public DeviceResponse getDeviceBySerial(String serial, String fields) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'serial' is set
     if (serial == null) {
        throw new ApiException(400, "Missing the required parameter 'serial' when calling getDeviceBySerial");
     }
     
    // create path and map variables
    String path = "/devices/{serial}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "serial" + "\\}", apiClient.escapeString(serial.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "accessTokenAuth" };

    
    GenericType<DeviceResponse> returnType = new GenericType<DeviceResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
