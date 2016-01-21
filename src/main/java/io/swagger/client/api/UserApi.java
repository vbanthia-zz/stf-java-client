package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.UserResponse;
import io.swagger.client.model.ErrorResponse;
import io.swagger.client.model.AccessTokensResponse;
import io.swagger.client.model.DeviceListResponse;
import io.swagger.client.model.AddUserDevicePayload;
import io.swagger.client.model.DeviceResponse;
import io.swagger.client.model.RemoteConnectUserDeviceResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-21T02:18:31.391Z")
public class UserApi {
  private ApiClient apiClient;

  public UserApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * User Profile
   * The User Profile endpoint returns information about current authorized user
   * @return UserResponse
   */
  public UserResponse getUser() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/user".replaceAll("\\{format\\}","json");

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

    String[] authNames = new String[] { "accessTokenAuth" };

    
    GenericType<UserResponse> returnType = new GenericType<UserResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Access Tokens
   * The Access Tokens endpoints returns titles of all the valid access tokens
   * @return AccessTokensResponse
   */
  public AccessTokensResponse getUserAccessTokens() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/user/accessTokens".replaceAll("\\{format\\}","json");

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

    String[] authNames = new String[] { "accessTokenAuth" };

    
    GenericType<AccessTokensResponse> returnType = new GenericType<AccessTokensResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * User Devices
   * The User Devices endpoint returns device list owner by current authorized user
   * @param fields Fields query parameter takes a comma seperated list of fields. Only listed field will be return in response
   * @return DeviceListResponse
   */
  public DeviceListResponse getUserDevices(String fields) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/user/devices".replaceAll("\\{format\\}","json");

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
   * Add a device to a user
   * The User Devices endpoint will request stf server for a new device.
   * @param device Device to add
   * @return void
   */
  public void addUserDevice(AddUserDevicePayload device) throws ApiException {
    Object postBody = device;
    
     // verify the required parameter 'device' is set
     if (device == null) {
        throw new ApiException(400, "Missing the required parameter 'device' when calling addUserDevice");
     }
     
    // create path and map variables
    String path = "/user/devices".replaceAll("\\{format\\}","json");

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

    String[] authNames = new String[] { "accessTokenAuth" };

    
    apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * User Device
   * The devices enpoint return information about device owned by user
   * @param serial Device Serial
   * @param fields Fields query parameter takes a comma seperated list of fields. Only listed field will be return in response
   * @return DeviceResponse
   */
  public DeviceResponse getUserDeviceBySerial(String serial, String fields) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'serial' is set
     if (serial == null) {
        throw new ApiException(400, "Missing the required parameter 'serial' when calling getUserDeviceBySerial");
     }
     
    // create path and map variables
    String path = "/user/devices/{serial}".replaceAll("\\{format\\}","json")
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
  
  /**
   * Delete User Device
   * The User Devices endpoint will request for device release from stf server. It will return request accepted if device is being used by current user
   * @param serial Device Serial
   * @return void
   */
  public void deleteUserDeviceBySerial(String serial) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'serial' is set
     if (serial == null) {
        throw new ApiException(400, "Missing the required parameter 'serial' when calling deleteUserDeviceBySerial");
     }
     
    // create path and map variables
    String path = "/user/devices/{serial}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "serial" + "\\}", apiClient.escapeString(serial.toString()));

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

    String[] authNames = new String[] { "accessTokenAuth" };

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * Remote Connect
   * The device connect endpoint will request stf server to connect remotely
   * @param serial Device Serial
   * @return RemoteConnectUserDeviceResponse
   */
  public RemoteConnectUserDeviceResponse remoteConnectUserDeviceBySerial(String serial) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'serial' is set
     if (serial == null) {
        throw new ApiException(400, "Missing the required parameter 'serial' when calling remoteConnectUserDeviceBySerial");
     }
     
    // create path and map variables
    String path = "/user/devices/{serial}/remoteConnect".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "serial" + "\\}", apiClient.escapeString(serial.toString()));

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

    String[] authNames = new String[] { "accessTokenAuth" };

    
    GenericType<RemoteConnectUserDeviceResponse> returnType = new GenericType<RemoteConnectUserDeviceResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Remote Disconnect
   * The device connect endpoint will request stf server to disconnect remotely
   * @param serial Device Serial
   * @return void
   */
  public void remoteDisconnectUserDeviceBySerial(String serial) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'serial' is set
     if (serial == null) {
        throw new ApiException(400, "Missing the required parameter 'serial' when calling remoteDisconnectUserDeviceBySerial");
     }
     
    // create path and map variables
    String path = "/user/devices/{serial}/remoteConnect".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "serial" + "\\}", apiClient.escapeString(serial.toString()));

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

    String[] authNames = new String[] { "accessTokenAuth" };

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
}
