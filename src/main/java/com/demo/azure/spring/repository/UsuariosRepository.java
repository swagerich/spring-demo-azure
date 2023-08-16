package com.demo.azure.spring.repository;

import com.demo.azure.spring.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuariosRepository extends CrudRepository<Usuario,Long> {
}
