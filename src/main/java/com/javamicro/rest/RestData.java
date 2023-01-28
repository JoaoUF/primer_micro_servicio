package com.javamicro.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javamicro.model.ModelData;

@RestController
@RequestMapping(path = "/rest/dataJR")
public class RestData {

	@GetMapping(path="/obtenDatos", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ModelData getData(@RequestParam(name = "msg") String message) {
		ModelData response = new ModelData();
		response.setCode(200);
		response.setStatus(true);
		response.setMensaje("Mensaje recibido: " + message);
		return response;
	}
}
