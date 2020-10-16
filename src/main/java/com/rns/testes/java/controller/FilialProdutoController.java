package com.rns.testes.java.controller;

import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import com.rns.testes.java.dto.mapper.FilialProdutoMapper;
import com.rns.testes.java.dto.FilialProdutoDto;
import com.rns.testes.java.model.FilialProduto;
import com.rns.testes.java.dao.FilialProdutoDao;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


import java.util.List;

@RestController
@RequestMapping
public class FilialProdutoController {

	private static final String template = "Hello, %s!";
        
        @Autowired
        FilialProdutoDao service;

    @GetMapping("/filialproduto")
   // @ResponseStatus(value = HttpStatus.OK)
	public ResponseEntity<List<FilialProduto>> findAll() {
         return ResponseEntity.ok(service.findAll());
        }

        @PostMapping("/filialproduto")
        @ResponseStatus(value = HttpStatus.OK)
        public ResponseEntity<FilialProduto> filialproduto(@RequestBody FilialProdutoDto dto)
        {
                System.out.println(FilialProdutoMapper.MAPPER.toTarget( dto ));
                //System.out.println(FilialProdutoMapper.MAPPER.dtoToEntity( dto ));
                return ResponseEntity.ok(service.save(FilialProdutoMapper.MAPPER.toTarget( dto )));
        }
        /* 
         @PostMapping("/filialproduto", produces = MediaType.APPLICATION_JSON_VALUE)
        //@ResponseStatus(value = HttpStatus.OK)
        public ResponseEntity<FilialProduto> insert(@RequestBody FilialProdutoDto dto) {
                
                return ResponseEntity.ok(service.save(FilialProdutoMapper.MAPPER.dtoToEntity(dto)));
        }  
        */
        
       
}