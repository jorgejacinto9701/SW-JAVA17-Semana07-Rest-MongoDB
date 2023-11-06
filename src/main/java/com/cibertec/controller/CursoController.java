package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.entity.Curso;
import com.cibertec.service.CursoService;

@RestController
@RequestMapping("/rest/curso")
public class CursoController {

	@Autowired
	private CursoService service;
	
	@ResponseBody
	@GetMapping("/listaCurso")
	public List<Curso>  lista(){
		List<Curso> lstSalida = service.listaCurso();
		return lstSalida;
	}

}






