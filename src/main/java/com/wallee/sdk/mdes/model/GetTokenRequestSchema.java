/*
 * MDES for Merchants
 * The MDES APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously. <br> __Authentication__ Mastercard uses OAuth 1.0a with body hash extension for authenticating the API clients. This requires every request that you send to  Mastercard to be signed with an RSA private key. A private-public RSA key pair must be generated consisting of: <br> 1 . A private key for the OAuth signature for API requests. It is recommended to keep the private key in a password-protected or hardware keystore. <br> 2. A public key is shared with Mastercard during the project setup process through either a certificate signing request (CSR) or the API Key Generator. Mastercard will use the public key to verify the OAuth signature that is provided on every API call.<br>  An OAUTH1.0a signer library is available on [GitHub](https://github.com/Mastercard/oauth1-signer-java) <br>  __Encryption__<br>  All communications between Issuer web service and the Mastercard gateway is encrypted using TLS. <br> __Additional Encryption of Sensitive Data__ In addition to the OAuth authentication, when using MDES Digital Enablement Service, any PCI sensitive and all account holder Personally Identifiable Information (PII) data must be encrypted. This requirement applies to the API fields containing encryptedData. Sensitive data is encrypted using a symmetric session (one-time-use) key. The symmetric session key is then wrapped with an RSA Public Key supplied by Mastercard during API setup phase (the Customer Encryption Key). <br>  Java Client Encryption Library available on [GitHub](https://github.com/Mastercard/client-encryption-java) 
 *
 * OpenAPI spec version: 1.2.10
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.wallee.sdk.mdes.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * GetTokenRequestSchema
 */

public class GetTokenRequestSchema {
  @SerializedName("responseHost")
  private String responseHost = null;

  @SerializedName("requestId")
  private String requestId = null;

  @SerializedName("paymentAppInstanceId")
  private String paymentAppInstanceId = null;

  @SerializedName("tokenUniqueReference")
  private String tokenUniqueReference = null;

  @SerializedName("includeTokenDetail")
  private String includeTokenDetail = null;

  public GetTokenRequestSchema responseHost(String responseHost) {
    this.responseHost = responseHost;
    return this;
  }

   /**
   * The host that originated the request. Future calls in the same conversation may be routed to this host. 
   * @return responseHost
  **/
  public String getResponseHost() {
    return responseHost;
  }

  public void setResponseHost(String responseHost) {
    this.responseHost = responseHost;
  }

  public GetTokenRequestSchema requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Unique identifier for the request. 
   * @return requestId
  **/
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public GetTokenRequestSchema paymentAppInstanceId(String paymentAppInstanceId) {
    this.paymentAppInstanceId = paymentAppInstanceId;
    return this;
  }

   /**
   * Identifier for the specific Mobile Payment App instance, unique across a given Wallet Identifier. This value cannot be changed after digitization. This field is alphanumeric and additionally web-safe base64 characters per RFC 4648 (minus \&quot;-\&quot;, underscore \&quot;_\&quot;) up to a maximum length of 48, &#x3D; should not be URL encoded. Conditional - not applicable for server-based tokens but required otherwise.     __Max Length:48__ 
   * @return paymentAppInstanceId
  **/
  public String getPaymentAppInstanceId() {
    return paymentAppInstanceId;
  }

  public void setPaymentAppInstanceId(String paymentAppInstanceId) {
    this.paymentAppInstanceId = paymentAppInstanceId;
  }

  public GetTokenRequestSchema tokenUniqueReference(String tokenUniqueReference) {
    this.tokenUniqueReference = tokenUniqueReference;
    return this;
  }

   /**
   * The specific Token to be queried.     __Max Length:64__  
   * @return tokenUniqueReference
  **/
  public String getTokenUniqueReference() {
    return tokenUniqueReference;
  }

  public void setTokenUniqueReference(String tokenUniqueReference) {
    this.tokenUniqueReference = tokenUniqueReference;
  }

  public GetTokenRequestSchema includeTokenDetail(String includeTokenDetail) {
    this.includeTokenDetail = includeTokenDetail;
    return this;
  }

   /**
   * Flag to indicate if the encrypted token should be returned.     __Max Length:5__  
   * @return includeTokenDetail
  **/
  public String getIncludeTokenDetail() {
    return includeTokenDetail;
  }

  public void setIncludeTokenDetail(String includeTokenDetail) {
    this.includeTokenDetail = includeTokenDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTokenRequestSchema getTokenRequestSchema = (GetTokenRequestSchema) o;
    return Objects.equals(this.responseHost, getTokenRequestSchema.responseHost) &&
        Objects.equals(this.requestId, getTokenRequestSchema.requestId) &&
        Objects.equals(this.paymentAppInstanceId, getTokenRequestSchema.paymentAppInstanceId) &&
        Objects.equals(this.tokenUniqueReference, getTokenRequestSchema.tokenUniqueReference) &&
        Objects.equals(this.includeTokenDetail, getTokenRequestSchema.includeTokenDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHost, requestId, paymentAppInstanceId, tokenUniqueReference, includeTokenDetail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTokenRequestSchema {\n");
    
    sb.append("    responseHost: ").append(toIndentedString(responseHost)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    paymentAppInstanceId: ").append(toIndentedString(paymentAppInstanceId)).append("\n");
    sb.append("    tokenUniqueReference: ").append(toIndentedString(tokenUniqueReference)).append("\n");
    sb.append("    includeTokenDetail: ").append(toIndentedString(includeTokenDetail)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

