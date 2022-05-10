package domain

import domain.criterios.CriterioDeAprovacao
import domain.BoletimFechado
import domain.Boletim


class AnalisadorDeAprovacao {
    
    private lateinit var criterioAprov: CriterioDeAprovacao
    
    fun 'defineCriterio(criterio:CriterioDeAprovacao)' {
        
        criterioAprov = criterio
        
    }
    
    
    fun 'fechaBoletim(boletim:Boletim)' : BoletimFechado {
        
        var mediaFinal = criterioAprov.estaAprovado(boletim)
        var foiAprovado = criterioAprov.mediaFinal(boletim)
        
        return BoletimFechado(boletim.mediaEPs, boletim.mediaMiniEPs, mediaFinal, foiAprovado)

}
