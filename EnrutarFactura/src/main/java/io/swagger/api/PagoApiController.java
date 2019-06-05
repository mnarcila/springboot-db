package io.swagger.api;

import io.swagger.model.Resultado;
import io.swagger.model.Factura;

import io.swagger.annotations.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.model.Mm_repository;
import com.model.Repository;
import com.repository.Imm_repository;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2019-05-18T18:08:15.193-05:00")

@Controller
public class PagoApiController implements PagoApi, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	Imm_repository imm_repository;
	@Autowired
	RestTemplate restTemplate;

	public ResponseEntity<Resultado> pago(

			@ApiParam(value = "Pago de valores", required = true) @RequestBody Factura factura

	) {
		String lEndPoint = "";
		Resultado lFacturaResponse = null;
		Boolean lContinuar = true;
		Mm_repository lrepo = new Mm_repository();
		// conocer el codigo inicial de factura

		List<Mm_repository> lRepo = imm_repository.findAll();

		for (Mm_repository mm_repository : lRepo) {

			System.out.println("1.repo[" + mm_repository.toString() + "]");

			if (String.format("%.0f", factura.getIdFactura()).startsWith(mm_repository.getMmId())
					&& mm_repository.getMetodo().equals("pago")) {
				lrepo = mm_repository;
				if (mm_repository.getTipo().equals("SOAP")) {
					lEndPoint = "http://10.0.75.1:9005/adaptadorSoap/transform/";
				} else {
					lEndPoint = "http://10.0.75.1:9004/adaptadorRest/transform/";
				}

			}
			if (!lContinuar) {
				break;
			}
		}

		System.out.println("2.lEndPoint[" + lEndPoint + "]");
		// consultar servicio de adaptador

		Object lObj = getRequest(lrepo, factura);
		Repository lrepor = (Repository) lObj;
		lFacturaResponse = restTemplate.postForEntity(lEndPoint, lrepor, Resultado.class).getBody();

		// prueba del endpoint

		if (lFacturaResponse != null) {
			return ResponseEntity.ok(lFacturaResponse);

		} else {
			return ResponseEntity.badRequest().body(null);
		}
	}

	public Object getRequest(Mm_repository pRepository, Factura pFactura) {

		Repository lRepo = new Repository();
		lRepo.setMmId(pRepository.getMmId());
		lRepo.setEndpoint(pRepository.getEndPoint());
		lRepo.setTipo(pRepository.getTipo());
		lRepo.setMetodo(pRepository.getMetodo());
		lRepo.setConfig(pRepository.getConfig());
		lRepo.setAccion(pRepository.getAccion());
		lRepo.setCampoValor(pRepository.getCampoValor());
		lRepo.setCampoMensaje(pRepository.getCampoMensaje());
		System.out.println("3.factura::" + pFactura);
		lRepo.setFactura(pFactura);
		System.out.println("3.getRequest::" + lRepo.toString());
		return lRepo;

	}

}
