package com.empresa.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Disponibilidad;
import com.empresa.repository.DisponibilidadRepository;

@Service
public class DisponibilidadServiceImpl implements DisponibilidadService {

	@Autowired
	private DisponibilidadRepository repositorio;

	@Override
	public Disponibilidad insertaDisponibilidad(Disponibilidad obj) {
		return repositorio.save(obj);
	}


}
