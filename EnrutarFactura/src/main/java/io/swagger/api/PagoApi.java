package io.swagger.api;

import io.swagger.model.Resultado;
import io.swagger.model.Factura;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2019-05-18T18:08:15.193-05:00")

@Api(value = "pago", description = "the pago API")
public interface PagoApi {

    @ApiOperation(value = "Pago de valores", notes = "", response = Resultado.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Exitoso", response = Resultado.class),
        @ApiResponse(code = 404, message = "Error", response = Resultado.class) })
    @RequestMapping(value = "/pago",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Resultado> pago(

@ApiParam(value = "Pago de valores" ,required=true ) @RequestBody Factura factura

);

}
