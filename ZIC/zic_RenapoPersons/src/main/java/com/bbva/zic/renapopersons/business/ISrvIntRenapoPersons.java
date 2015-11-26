package com.bbva.zic.renapopersons.business;

import java.util.List;

import com.bbva.zic.renapopersons.business.dto.DTOIntPerson;
import com.bbva.zic.renapopersons.facade.v01.dto.Person;

public interface ISrvIntRenapoPersons {

	/**
	 * realiza una peticion al ws de consulta de renapo pasandole parametros de la persona
	 * @param person
	 * @return
	 */
	public List<DTOIntPerson> listRenapoPersons(Person person);
	

	/**
	 * realiza una peticion al ws de consulta de renapo pasandole parametros de la persona
	 * @param person
	 * @return
	 */
	public List<DTOIntPerson> listRenapoPersonsDummy1(Person person);
	
	/**
	 * realiza una peticion al ws de consulta de renapo pasandole parametros de la persona
	 * @param person
	 * @return
	 */
	public List<DTOIntPerson> listRenapoPersonsDummy2(Person person);

	/**
	 * realiza una peticion al ws de consulta de renapo por curp, donde solo se envia la misma.
	 * @param person
	 * @return
	 */
	public DTOIntPerson getRenapoPerson(Person person);
	
	/**
	 * realiza una peticion al ws de consulta de renapo por curp, donde solo se envia la misma.
	 * @param person
	 * @return
	 */
	public DTOIntPerson getRenapoPersonDummy1(Person person);
	
	/**
	 * realiza una peticion al ws de consulta de renapo por curp, donde solo se envia la misma.
	 * @param person
	 * @return
	 */
	public DTOIntPerson getRenapoPersonDummy2(Person person);

}