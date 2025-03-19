package es.cie.proyectopersonalLara.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import es.cie.proyectopersonalLara.negocio.Ordenador;
import io.micrometer.common.lang.NonNull;

public class OrdenadorRowMapper implements RowMapper<Ordenador> {

    @Override

    public Ordenador mapRow( @NonNull ResultSet rs, int rowNum) throws SQLException {

        return new Ordenador(rs.getInt("numero"), rs.getString("marca"), rs.getString("modelo"), rs.getInt("precio"));
    }

}
