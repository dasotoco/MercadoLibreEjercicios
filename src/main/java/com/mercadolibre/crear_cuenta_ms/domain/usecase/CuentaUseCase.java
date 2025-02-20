package com.mercadolibre.crear_cuenta_ms.domain.usecase;

import com.mercadolibre.crear_cuenta_ms.domain.model.Cuenta;
import com.mercadolibre.crear_cuenta_ms.domain.model.CuentaGateway;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CuentaUseCase {

    private CuentaGateway cuentaGateway;

    public void crearCuenta(Cuenta cuenta){
        cuentaGateway.crearCuenta(cuenta);
    }
}
