package com.rns.testes.java.dto.mapper;

import com.rns.testes.java.dto.FilialProdutoDto;
import com.rns.testes.java.model.FilialProduto;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-16T14:14:53-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_261 (Oracle Corporation)"
)
public class FilialProdutoMapperImpl implements FilialProdutoMapper {

    @Override
    public FilialProduto toTarget(FilialProdutoDto s) {
        if ( s == null ) {
            return null;
        }

        FilialProduto filialProduto = new FilialProduto();

        filialProduto.setNome( s.getNome() );
        filialProduto.setLocal( s.getLocal() );
        filialProduto.setQuantidade( s.getQuantidade() );

        return filialProduto;
    }
}
