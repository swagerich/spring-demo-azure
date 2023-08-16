package com.demo.azure.spring.service;

import com.demo.azure.spring.entity.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> findAll();
    Usuario save(Usuario usuario);
}
