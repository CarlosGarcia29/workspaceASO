package com.bbva.zic.proxyservicemppm.dao.model.mppm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bbva.jee.arq.spring.core.host.ExcepcionTransaccion;
import com.bbva.jee.arq.spring.core.host.ServicioTransacciones;
import com.bbva.jee.arq.spring.core.host.InvocadorTransaccion;

/**
 * Invocador de la transacci&oacute;n <code>MPPM</code>
 * 
 * @see PeticionTransaccionMppm
 * @see RespuestaTransaccionMppm
 */
@Component
public class TransaccionMppm implements InvocadorTransaccion<PeticionTransaccionMppm,RespuestaTransaccionMppm> {
	
	@Autowired
	private ServicioTransacciones servicioTransacciones;
	
	@Override
	public RespuestaTransaccionMppm invocar(PeticionTransaccionMppm transaccion) throws ExcepcionTransaccion {
		return servicioTransacciones.invocar(PeticionTransaccionMppm.class, RespuestaTransaccionMppm.class, transaccion);
	}
	
	@Override
	public RespuestaTransaccionMppm invocarCache(PeticionTransaccionMppm transaccion) throws ExcepcionTransaccion {
		return servicioTransacciones.invocar(PeticionTransaccionMppm.class, RespuestaTransaccionMppm.class, transaccion);
	}
	
	@Override
	public void vaciarCache() {}	
}