package ar.com.ada.api.aladas.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.ada.api.aladas.entities.Vuelo;

public interface VueloRepository extends JpaRepository <Vuelo, Integer>  {
    
}
