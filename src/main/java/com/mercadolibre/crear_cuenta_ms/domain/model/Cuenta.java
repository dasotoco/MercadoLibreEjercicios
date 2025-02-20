package com.mercadolibre.crear_cuenta_ms.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cuenta {
    private Integer id;
    private Integer idCliente;
    private Integer idUsuario;
    private String nombreUsuario;
}
