package es.cie.proyectopersonalLara.repositories;

import java.util.List;

import es.cie.proyectopersonalLara.negocio.Ordenador;

public interface OrdenadorRepository {

    List<Ordenador> buscarTodos();

    void insertar (Ordenador ordenador);
    void borrar (Ordenador ordenador);

}

