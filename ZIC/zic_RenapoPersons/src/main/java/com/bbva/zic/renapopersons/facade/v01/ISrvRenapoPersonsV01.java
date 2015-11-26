package com.bbva.zic.renapopersons.facade.v01;

import java.util.List;

import com.bbva.zic.renapopersons.facade.v01.dto.Person;


public interface ISrvRenapoPersonsV01 {
	
	/**
	 * realiza la busqueda de las coincidencias de personas por medio de los datos recibidos.
	 * @param filter
	 * @param lastName
	 * @param name
	 * @param birthDate
	 * @return
	 */
 	public List<Person> listRenapoPersons(String filter, String lastName, String name, String birthDate);
 	
 	/**
 	 * realiza una busqueda de una persona por medio de su curp.
 	 * @param curp
 	 * @return
 	 */
 	public Person getRenapoPerson(String curp);

	
}