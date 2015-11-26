package com.bbva.zic.accountsv02.dao.model.b402;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bbva.jee.arq.spring.core.host.ExcepcionTransaccion;
import com.bbva.jee.arq.spring.core.host.ServicioTransacciones;
import com.bbva.jee.arq.spring.core.host.InvocadorTransaccion;

/**
 * Invocador de la transacci&oacute;n <code>B402</code>
 * 
 * @see PeticionTransaccionB402
 * @see RespuestaTransaccionB402
 */
@Component
public class TransaccionB402 implements InvocadorTransaccion<PeticionTransaccionB402,RespuestaTransaccionB402> {
	
	@Autowired
	private ServicioTransacciones servicioTransacciones;
	
	@Override
	public RespuestaTransaccionB402 invocar(PeticionTransaccionB402 transaccion) throws ExcepcionTransaccion {
		return servicioTransacciones.invocar(PeticionTransaccionB402.class, RespuestaTransaccionB402.class, transaccion);
	}
	
	@Override
	public RespuestaTransaccionB402 invocarCache(PeticionTransaccionB402 transaccion) throws ExcepcionTransaccion {
		return servicioTransacciones.invocar(PeticionTransaccionB402.class, RespuestaTransaccionB402.class, transaccion);
	}
	
	@Override
	public void vaciarCache() {}	
}