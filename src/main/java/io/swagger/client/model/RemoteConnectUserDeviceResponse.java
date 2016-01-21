package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-21T02:18:31.391Z")
public class RemoteConnectUserDeviceResponse   {
  
  private String remoteConnectUrl = null;
  private String serial = null;

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("remoteConnectUrl")
  public String getRemoteConnectUrl() {
    return remoteConnectUrl;
  }
  public void setRemoteConnectUrl(String remoteConnectUrl) {
    this.remoteConnectUrl = remoteConnectUrl;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("serial")
  public String getSerial() {
    return serial;
  }
  public void setSerial(String serial) {
    this.serial = serial;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteConnectUserDeviceResponse remoteConnectUserDeviceResponse = (RemoteConnectUserDeviceResponse) o;

    return true && Objects.equals(remoteConnectUrl, remoteConnectUserDeviceResponse.remoteConnectUrl) &&
        Objects.equals(serial, remoteConnectUserDeviceResponse.serial)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteConnectUrl, serial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteConnectUserDeviceResponse {\n");
    
    sb.append("    remoteConnectUrl: ").append(toIndentedString(remoteConnectUrl)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
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

