package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.util.Date;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import modelo.Color;
import modelo.Partido;
import modelo.Temporada;
import controlador.Controlador;

@ManagedBean(name = "beanCrearAlineacion")
@SessionScoped
public class BeanCrearAlineacion {

	private String nombre;

	private int tanteo;

	private Color color;
	
	private Partido partidoId;
	
	private Collection<Partido> partidos;

	
}
