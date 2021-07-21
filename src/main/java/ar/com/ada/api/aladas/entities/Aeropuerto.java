package ar.com.ada.api.aladas.entities;

import javax.persistence.*;

@Entity
@Table(name = "aeropuerto")
public class Aeropuerto {
    @Id
    @Column(name = "aeropuerto_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer aeropuertoId;

    @Column(name = "nombre_aeropuerto")
    private String nombre;
    
    @Column(name = "codigo_iata")
    private String codigoIATA;
}
