package io.swagger.api;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.model.Mm_repository;
import com.model.Repository;
import com.repository.Imm_repository;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Factura;
import io.swagger.model.Resultado;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2019-05-18T18:08:15.193-05:00")

@Controller
public class ConsultaApiController implements ConsultaApi {

	@Autowired
	Imm_repository imm_repository;
	@Autowired
	RestTemplate restTemplate;

	public ResponseEntity<Resultado> consulta(
			@ApiParam(value = "Id de la factura", required = true) @RequestParam(value = "idFactura", required = true) BigDecimal idFactura

	) {
		String lEndPoint = "";
		Resultado lFacturaResponse = null;
		Integer lIdFactura = idFactura.intValue();
		Boolean lContinuar = true;
		Mm_repository lrepo = new Mm_repository();
		// conocer el codigo inicial de factura

		List<Mm_repository> lRepo = imm_repository.findAll();
		for (Mm_repository mm_repository : lRepo) {
			System.out.println("1.repo["+mm_repository.toString()+"]");
			// buscara la entidad y conocera a que adaptador se enviara la peticion con su
			// debido endpoint
			if (lIdFactura.toString().startsWith(mm_repository.getMmId())
					&& mm_repository.getMetodo().equals("consulta")) {
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
		
		Object lObjeto = getRequest(lrepo, idFactura);
		Repository lrep = (Repository)lObjeto;
		System.out.println(lrep);
		lFacturaResponse = restTemplate.postForEntity(lEndPoint,lObjeto , Resultado.class).getBody();

		// prueba del endpoint

		if (lFacturaResponse != null) {
			return ResponseEntity.ok(lFacturaResponse);

		} else {
			return ResponseEntity.badRequest().body(null);
		}
	}

	public Object getRequest(Mm_repository pRepository, BigDecimal pFactura) {

		Repository lRepo = new Repository();
		lRepo.setMmId(pRepository.getMmId());
		lRepo.setEndpoint(pRepository.getEndPoint());
		lRepo.setTipo(pRepository.getTipo());
		lRepo.setMetodo(pRepository.getMetodo());
		lRepo.setConfig(pRepository.getConfig());
		lRepo.setAccion(pRepository.getAccion());
		lRepo.setCampoValor(pRepository.getCampoValor());
		lRepo.setCampoMensaje(pRepository.getCampoMensaje());
		Factura pFacturaObj = new Factura();
		pFacturaObj.setIdFactura(pFactura);
		lRepo.setFactura(pFacturaObj);
		System.out.println("3.getRequest::" + pRepository.toString());
		return lRepo;

	}

}
