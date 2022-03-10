package com.projeto.catalagodeviagens.repositories;


import com.projeto.catalagodeviagens.entities.Destinos;
import com.projeto.catalagodeviagens.entities.Formulario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinosRepository extends JpaRepository<Destinos, Integer> {

}
