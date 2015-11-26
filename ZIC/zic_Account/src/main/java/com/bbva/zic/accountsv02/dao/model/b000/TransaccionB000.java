package com.bbva.zic.accountsv02.dao.model.b000;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bbva.jee.arq.spring.core.host.ExcepcionTransaccion;
import com.bbva.jee.arq.spring.core.host.ServicioTransacciones;
import com.bbva.jee.arq.spring.core.host.InvocadorTransaccion;

/**
 * Invocador de la transacci&oacute;n <code>B000</code>
 * 
 * @see PeticionTransaccionB000
 * @see RespuestaTransaccionB000
 */
@Component
public class TransaccionB000 implements InvocadorTransaccion<PeticionTransaccionB000,RespuestaTransaccionB000> {
	
	@Autowired
	private ServicioTransacciones servicioTransacciones;
	
	@Override
	public RespuestaTransaccionB000 invocar(PeticionTransaccionB000 transaccion) throws ExcepcionTransaccion {
		return servicioTransacciones.invocar(PeticionTransaccionB000.class, RespuestaTransaccionB000.class, transaccion);
	}
	
	@Override
	public RespuestaTransaccionB000 invocarCache(PeticionTransaccionB000 transaccion) throws ExcepcionTransaccion {
		return servicioTransacciones.invocar(PeticionTransaccionB000.class, RespuestaTransaccionB000.class, transaccion);
	}
	
	@Override
	public void vaciarCache() {}	
}