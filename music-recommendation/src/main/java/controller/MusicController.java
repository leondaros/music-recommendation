/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import model.Artista;
import model.Estilo;
import model.Genero;
import model.Musica;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLNamedIndividual;

/**
 *
 * @author Leon
 */
public class MusicController {
    
    OWLController oWLController;
    ArrayList<Musica> musicas;

    public MusicController() {
        this.musicas = new ArrayList<>();
    }
    
}
