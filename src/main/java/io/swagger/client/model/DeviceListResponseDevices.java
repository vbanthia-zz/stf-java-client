package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;




@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-21T02:18:31.391Z")
public class DeviceListResponseDevices   {

  @JsonProperty("serial")
  public String serial;

  @JsonProperty("name")
  public String name;

  @JsonProperty("model")
  public String model;

  @JsonProperty("version")
  public String version;

  @JsonProperty("sdk")
  public String sdk;

  @JsonProperty("image")
  public String image;

  @JsonProperty("present")
  public boolean present;

  @JsonProperty("owner")
  public Owner owner;

  @JsonProperty("remoteConnectUrl")
  public String remoteConnectUrl;

  @JsonProperty("notes")
  public String notes;

  @JsonProperty("manufacturer")
  public String manufacturer;

  @JsonProperty("provider")
  public Provider provider;

  @JsonProperty("abi")
  public String abi;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceListResponseDevices deviceListResponseDevices = (DeviceListResponseDevices) o;

    return true
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceListResponseDevices {\n");

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
