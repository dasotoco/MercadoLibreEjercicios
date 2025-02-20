package com.mercadolibre.crear_cuenta_ms.infraestructure.entrypoints;

import com.fasterxml.jackson.databind.JsonNode;
import com.mercadolibre.crear_cuenta_ms.domain.model.Cuenta;
import com.mercadolibre.crear_cuenta_ms.domain.usecase.CuentaUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/cuentas")
public class CuentaController {

    private final CuentaUseCase cuentaUseCase;

    @PostMapping
    public void crearCuenta(@RequestBody JsonNode json){
        cuentaUseCase.crearCuenta(Cuenta.builder()
                        .id(json.at("id").asInt())
                        .idCliente(json.at("cliente").asInt())
                .build());
    }
}
