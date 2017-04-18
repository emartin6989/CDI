package interceptor;

import java.util.Scanner;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Connected
public class Connector {

	@AroundInvoke
	public Object connect(InvocationContext context) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("Saisir login");

		String login = sc.next();

		System.out.println("Saisir mot de passe");

		String mdp = sc.next();

		sc.close();
		if (login.equalsIgnoreCase("root") && mdp.equalsIgnoreCase("root")) {
			System.out.println("Connecté");

			return context.proceed();
		} else {
			System.out.println("Accès refusé");
			return null;
		}
	}
}
