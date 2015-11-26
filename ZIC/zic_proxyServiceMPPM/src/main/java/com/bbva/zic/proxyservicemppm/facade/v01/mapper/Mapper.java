package com.bbva.zic.proxyservicemppm.facade.v01.mapper;

import org.springframework.beans.BeanUtils;

import com.bbva.zic.proxyservicemppm.business.dto.DTOIntPeticionTransaccionMPPMV01;
import com.bbva.zic.proxyservicemppm.business.dto.DTOIntRespuestaTransaccionMPPMV01;
import com.bbva.zic.proxyservicemppm.facade.v01.dto.PeticionTransaccionMPPMV01;
import com.bbva.zic.proxyservicemppm.facade.v01.dto.RespuestaTransaccionMPPMV01;


public class Mapper {

		
 public static PeticionTransaccionMPPMV01 PeticionTransaccionMap(DTOIntPeticionTransaccionMPPMV01 dtoIntPeticionTransaccion) { 
 		PeticionTransaccionMPPMV01 PeticionTransaccion = new PeticionTransaccionMPPMV01(); 
 		BeanUtils.copyProperties(dtoIntPeticionTransaccion, PeticionTransaccion); 
 		return PeticionTransaccion; 
 } 

		
 public static DTOIntPeticionTransaccionMPPMV01 dtoIntPeticionTransaccionMap(PeticionTransaccionMPPMV01 PeticionTransaccion) { 
 		DTOIntPeticionTransaccionMPPMV01 dtoIntPeticionTransaccion = new DTOIntPeticionTransaccionMPPMV01(); 
 		BeanUtils.copyProperties(PeticionTransaccion, dtoIntPeticionTransaccion); 
 		return dtoIntPeticionTransaccion; 
 } 

		
 public static RespuestaTransaccionMPPMV01 RespuestaTransaccionMap(DTOIntRespuestaTransaccionMPPMV01 dtoIntRespuestaTransaccion) { 
 		RespuestaTransaccionMPPMV01 RespuestaTransaccion = new RespuestaTransaccionMPPMV01(); 
 		BeanUtils.copyProperties(dtoIntRespuestaTransaccion, RespuestaTransaccion); 
 		return RespuestaTransaccion; 
 } 

		
 public static DTOIntRespuestaTransaccionMPPMV01 dtoIntRespuestaTransaccionMap(RespuestaTransaccionMPPMV01 RespuestaTransaccion) { 
 		DTOIntRespuestaTransaccionMPPMV01 dtoIntRespuestaTransaccion = new DTOIntRespuestaTransaccionMPPMV01(); 
 		BeanUtils.copyProperties(RespuestaTransaccion, dtoIntRespuestaTransaccion); 
 		return dtoIntRespuestaTransaccion; 
 } 

	
	
}

