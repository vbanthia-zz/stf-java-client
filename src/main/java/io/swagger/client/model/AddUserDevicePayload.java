package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * payload object for adding device to user
 **/

@ApiModel(description = "payload object for adding device to user")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-21T02:18:31.391Z")
public class AddUserDevicePayload   {
  
  private String serial = null;
  private Integer timeout = null;

  
  /**
   * Device Serial
   **/
  
  @ApiModelProperty(required = true, value = "Device Serial")
  @JsonProperty("serial")
  public String getSerial() {
    return serial;
  }
  public void setSerial(String serial) {
    this.serial = serial;
  }

  
  /**
   * Device timeout in ms. If device is kept idle for this period, it will be automatically disconnected. Default is provider group timeout
   **/
  
  @ApiModelProperty(value = "Device timeout in ms. If device is kept idle for this period, it will be automatically disconnected. Default is provider group timeout")
  @JsonProperty("timeout")
  public Integer getTimeout() {
    return timeout;
  }
  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddUserDevicePayload addUserDevicePayload = (AddUserDevicePayload) o;

    return true && Objects.equals(serial, addUserDevicePayload.serial) &&
        Objects.equals(timeout, addUserDevicePayload.timeout)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(serial, timeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddUserDevicePayload {\n");
    
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

