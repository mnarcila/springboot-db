package com.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Factura;




/**
 * Repository
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2019-05-20T11:01:28.864-05:00")

public class Repository   {
  private Factura factura = null;

  private String mmId = null;

  private String endpoint = null;

  private String tipo = null;

  private String config = null;

  private String metodo = null;

  private String accion = null;

  private String campoValor = null;

  private String campoMensaje = null;

  public Repository factura(Factura factura) {
    this.factura = factura;
    return this;
  }

   /**
   * Get factura
   * @return factura
  **/
  @ApiModelProperty(value = "")
  public Factura getFactura() {
    return factura;
  }

  public void setFactura(Factura factura) {
    this.factura = factura;
  }

  public Repository mmId(String mmId) {
    this.mmId = mmId;
    return this;
  }

   /**
   * Get mmId
   * @return mmId
  **/
  @ApiModelProperty(value = "")
  public String getMmId() {
    return mmId;
  }

  public void setMmId(String mmId) {
    this.mmId = mmId;
  }

  public Repository endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @ApiModelProperty(value = "")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public Repository tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }

   /**
   * Get tipo
   * @return tipo
  **/
  @ApiModelProperty(value = "")
  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public Repository config(String config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @ApiModelProperty(value = "")
  public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
    this.config = config;
  }

  public Repository metodo(String metodo) {
    this.metodo = metodo;
    return this;
  }

   /**
   * Get metodo
   * @return metodo
  **/
  @ApiModelProperty(value = "")
  public String getMetodo() {
    return metodo;
  }

  public void setMetodo(String metodo) {
    this.metodo = metodo;
  }

  public Repository accion(String accion) {
    this.accion = accion;
    return this;
  }

   /**
   * Get accion
   * @return accion
  **/
  @ApiModelProperty(value = "")
  public String getAccion() {
    return accion;
  }

  public void setAccion(String accion) {
    this.accion = accion;
  }

  public Repository campoValor(String campoValor) {
    this.campoValor = campoValor;
    return this;
  }

   /**
   * Get campoValor
   * @return campoValor
  **/
  @ApiModelProperty(value = "")
  public String getCampoValor() {
    return campoValor;
  }

  public void setCampoValor(String campoValor) {
    this.campoValor = campoValor;
  }

  public Repository campoMensaje(String campoMensaje) {
    this.campoMensaje = campoMensaje;
    return this;
  }

   /**
   * Get campoMensaje
   * @return campoMensaje
  **/
  @ApiModelProperty(value = "")
  public String getCampoMensaje() {
    return campoMensaje;
  }

  public void setCampoMensaje(String campoMensaje) {
    this.campoMensaje = campoMensaje;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Repository repository = (Repository) o;
    return Objects.equals(this.factura, repository.factura) &&
        Objects.equals(this.mmId, repository.mmId) &&
        Objects.equals(this.endpoint, repository.endpoint) &&
        Objects.equals(this.tipo, repository.tipo) &&
        Objects.equals(this.config, repository.config) &&
        Objects.equals(this.metodo, repository.metodo) &&
        Objects.equals(this.accion, repository.accion) &&
        Objects.equals(this.campoValor, repository.campoValor) &&
        Objects.equals(this.campoMensaje, repository.campoMensaje);
  }

  @Override
  public int hashCode() {
    return Objects.hash(factura, mmId, endpoint, tipo, config, metodo, accion, campoValor, campoMensaje);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Repository {\n");
    
    sb.append("    factura: ").append(toIndentedString(factura)).append("\n");
    sb.append("    factura:facturaId: ").append(toIndentedString(factura.getIdFactura())).append("\n");
    sb.append("    factura:valor: ").append(toIndentedString(factura.getValor())).append("\n");
    sb.append("    mmId: ").append(toIndentedString(mmId)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    metodo: ").append(toIndentedString(metodo)).append("\n");
    sb.append("    accion: ").append(toIndentedString(accion)).append("\n");
    sb.append("    campoValor: ").append(toIndentedString(campoValor)).append("\n");
    sb.append("    campoMensaje: ").append(toIndentedString(campoMensaje)).append("\n");
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

