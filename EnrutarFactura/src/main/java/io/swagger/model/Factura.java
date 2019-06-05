package io.swagger.model;

import java.math.BigDecimal;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;




/**
 * Factura
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2019-05-18T18:08:15.193-05:00")

public class Factura   {
  private BigDecimal idFactura = null;

  private BigDecimal valor = null;

  public Factura idFactura(BigDecimal idFactura) {
    this.idFactura = idFactura;
    return this;
  }

   /**
   * Get idFactura
   * @return idFactura
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getIdFactura() {
    return idFactura;
  }

  public void setIdFactura(BigDecimal idFactura) {
    this.idFactura = idFactura;
  }

  public Factura valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }

   /**
   * Get valor
   * @return valor
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getValor() {
    return valor;
  }

  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Factura factura = (Factura) o;
    return Objects.equals(this.idFactura, factura.idFactura) &&
        Objects.equals(this.valor, factura.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idFactura, valor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Factura {\n");
    
    sb.append("    idFactura: ").append(toIndentedString(idFactura)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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

