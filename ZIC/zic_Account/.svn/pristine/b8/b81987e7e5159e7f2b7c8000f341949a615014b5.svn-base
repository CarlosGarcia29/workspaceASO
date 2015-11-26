package com.bbva.zic.accountsv02.dao.model.b431;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bbva.jee.arq.spring.core.host.ExcepcionTransaccion;
import com.bbva.jee.arq.spring.core.host.ServicioTransacciones;
import com.bbva.jee.arq.spring.core.host.InvocadorTransaccion;

/**
 * Invocador de la transacci&oacute;n <code>B431</code>
 * 
 * @see PeticionTransaccionB431
 * @see RespuestaTransaccionB431
 */
@Component
public class TransaccionB431 implements InvocadorTransaccion<PeticionTransaccionB431,RespuestaTransaccionB431> {
	
	@Autowired
	private ServicioTransacciones servicioTransacciones;
	
	@Override
	public RespuestaTransaccionB431 invocar(PeticionTransaccionB431 transaccion) throws ExcepcionTransaccion {
		return servicioTransacciones.invocar(PeticionTransaccionB431.class, RespuestaTransaccionB431.class, transaccion);
	}
	
	@Override
	public RespuestaTransaccionB431 invocarCache(PeticionTransaccionB431 transaccion) throws ExcepcionTransaccion {
		return servicioTransacciones.invocar(PeticionTransaccionB431.class, RespuestaTransaccionB431.class, transaccion);
	}
	
	@Override
	public void vaciarCache() {}	
}