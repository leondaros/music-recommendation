/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Set;
import model.Estilo;
import model.Musica;
import org.semanticweb.owlapi.model.OWLNamedIndividual;

/**
 *
 * @author Leon
 */
public class EstiloController {
    
    OWLController oWLController;
    ArrayList<Estilo> estilos;

    public EstiloController() {
        this.estilos = new ArrayList<>();
    }
    
}
