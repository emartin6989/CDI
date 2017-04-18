package presentation;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import service.IService;
import service.ServiceImpl;

public class Lanceur {

	public static void main(String[] args) {
		// 1 Chargement du container
		WeldContainer weld = new Weld().initialize();

		// 2 S�lection de la classe service via la d�claration de l'interface
		// service
		IService service = weld.instance().select(ServiceImpl.class).get();

		// 3 appel de la m�thode appel Dao
		String resultat = service.appelDao();
		System.out.println(resultat);

		// 4 Destruction des objets
		weld.instance().destroy(service);
		
		//weld.shutdown();
	
	}
}
