package tpo;

import apis.ConjuntoTDA;
import apis.DiccionarioSimpleTDA;
import impl.ConjuntoLD;
import impl.DicSimpleL;

public class AdminColas implements AdministradorColas {
	
	NodoPrioridad mayorPrioridad;
	int [] prioridades;
	int identificador;
	int valor;
	int puestos;
	
	private static DiccionarioSimpleTDA dict;


	public void inicializar(int cantidad) {
		valor = 0;
		mayorPrioridad = null;
		identificador = 0;
		puestos = cantidad;
		
		dict = new DicSimpleL();
		dict.inicializarDiccionario();
		
		ConjuntoTDA conjunto = new ConjuntoLD();
		conjunto.inicializarConjunto();
		
		for (int i = 1; i <= cantidad; i++) {
			conjunto.agregar(i);
		}	
	}
	
	public void inicializar() {
		mayorPrioridad = null;
	}
	@Override
	public int acolar(int prioridad) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void acolar(int id, int prioridad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int desacolar(int puesto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int cantPuestos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int tiempoEstimado() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int primero() {
			return mayorPrioridad.info;
		}
	}

	@Override
	public int prioridad() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int puestoDelElem(int idElemento) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean colaVacia() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
	
	


