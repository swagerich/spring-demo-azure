package com.demo.azure.spring.service.impl;

import com.demo.azure.spring.entity.Usuario;
import com.demo.azure.spring.repository.UsuariosRepository;
import com.demo.azure.spring.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UsuariosServiceImpl implements UsuarioService {

    private final UsuariosRepository usuariosRepository;
    @Override
    public List<Usuario> findAll() {
        return Streamable.of(usuariosRepository.findAll())
                .stream().collect(Collectors.toList());
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuariosRepository.save(usuario);
    }
}
