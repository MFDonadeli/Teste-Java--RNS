package com.rns.testes.java.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.rns.testes.java.dto.FilialProdutoDto;
import com.rns.testes.java.model.FilialProduto;

@Mapper
public interface FilialProdutoMapper {
    FilialProdutoMapper MAPPER = Mappers.getMapper( FilialProdutoMapper.class );

    @Mapping( source = "nome", target = "nome" )
    FilialProduto toTarget( FilialProdutoDto s );

}