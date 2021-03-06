package com.projeto.catalagodeviagens.controller;

import com.projeto.catalagodeviagens.entities.Destinos;
import com.projeto.catalagodeviagens.entities.Formulario;
import com.projeto.catalagodeviagens.repositories.DestinosRepository;
import com.projeto.catalagodeviagens.repositories.FormularioRepository;
import com.projeto.catalagodeviagens.useCases.DestinosImagensUsecase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class FormulariosController {


    private final FormularioRepository formularioRepository;
    private final DestinosRepository destinosRepository;
    private final DestinosImagensUsecase destinosImagensUsecase;

    public FormulariosController(FormularioRepository formularioRepository, DestinosRepository destinosRepository, DestinosImagensUsecase destinosImagensUsecase) {
        this.formularioRepository = formularioRepository;
        this.destinosRepository = destinosRepository;
        this.destinosImagensUsecase = destinosImagensUsecase;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/formulario")
    public ResponseEntity<Formulario> salvarFormulario(@RequestBody Formulario formulario) {

        return ResponseEntity.ok(formularioRepository.save(formulario));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/formulario/destinos")
    public ResponseEntity<Destinos> salvarDestinos(@RequestBody Destinos destinos) {

        return ResponseEntity.ok(destinosRepository.save(destinos));
    }

    @GetMapping("/listar/destinos")
    public ResponseEntity<List<Destinos>> listarDestinos(){
        return ResponseEntity.ok(destinosRepository.findAll());
    }

    @GetMapping("/listar/destinos/{id}")
    public Optional<Destinos> listaDestinosId(@PathVariable(value="id") Integer id){
        return destinosRepository.findById(id);
    }

    @RequestMapping(value="/foto/destinos", method=RequestMethod.POST)
    public ResponseEntity<Void> uploadPicture(@RequestParam(name = "file") MultipartFile file) {
        URI uri = destinosImagensUsecase.uploadPicture(file);
        return ResponseEntity.created(uri).build();
    }
}
