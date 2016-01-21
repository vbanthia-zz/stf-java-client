package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DeviceListResponseDevices;
import java.util.*;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-21T02:18:31.391Z")
public class DeviceListResponse   {
  
  private List<DeviceListResponseDevices> devices = new ArrayList<DeviceListResponseDevices>();

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("devices")
  public List<DeviceListResponseDevices> getDevices() {
    return devices;
  }
  public void setDevices(List<DeviceListResponseDevices> devices) {
    this.devices = devices;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceListResponse deviceListResponse = (DeviceListResponse) o;

    return true && Objects.equals(devices, deviceListResponse.devices)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(devices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceListResponse {\n");
    
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

