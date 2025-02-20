package com.mercadolibre.crear_cuenta_ms.infraestructure.drivenadapters;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Cuenta")
public class CuentaEntity {

    @Id
    private Integer id;
    private Integer idCliente;
    private Integer idUsuario;
    private String nombreUsuario;
}
