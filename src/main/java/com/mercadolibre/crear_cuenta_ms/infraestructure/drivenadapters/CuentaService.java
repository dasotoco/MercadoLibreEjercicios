package com.mercadolibre.crear_cuenta_ms.infraestructure.drivenadapters;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mercadolibre.crear_cuenta_ms.domain.model.Cuenta;
import com.mercadolibre.crear_cuenta_ms.domain.model.CuentaGateway;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CuentaService implements CuentaGateway {

    private final CuentaRepository cuentaRepository;
    private ObjectMapper mapper;

    @Override
    public void crearCuenta(Cuenta cuenta) {
        cuentaRepository.save(mapper.convertValue(cuenta, CuentaEntity.class));
    }
}
