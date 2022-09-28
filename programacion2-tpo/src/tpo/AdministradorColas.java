package tpo;
import apis.DiccionarioSimpleTDA;

public interface AdministradorColas {

	void inicializar(int cantidad);
	int acolar(int prioridad);
	void acolar(int id, int prioridad);
	int desacolar(int puesto);
	int cantPuestos();
	int primero();
	int prioridad();
	int puestoDelElem(int idElemento);
	boolean colaVacia();
	
}
