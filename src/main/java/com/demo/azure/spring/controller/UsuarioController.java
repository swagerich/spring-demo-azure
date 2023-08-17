package com.demo.azure.spring.controller;

import com.demo.azure.spring.entity.Usuario;
import com.demo.azure.spring.service.impl.UsuariosServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usuarios")
@CrossOrigin("*")
public class UsuarioController {

    private final UsuariosServiceImpl usuariosService;

    public UsuarioController(UsuariosServiceImpl usuariosService) {
        this.usuariosService = usuariosService;
    }

    @GetMapping
    public List<?> getUsuarios() {
        return usuariosService.findAll();
    }

    @PostMapping
    public Usuario save(@RequestBody Usuario usuario){
        return this.usuariosService.save(usuario);
    }
}
