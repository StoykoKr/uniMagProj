package city.proj;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;
public class Main {

	public static void main(String[] args) {
Runtime runtime = Runtime.instance();		
		
		Profile profile = new ProfileImpl();
		
		profile.setParameter(profile.MAIN_HOST, "localhost");
		profile.setParameter(profile.MAIN_PORT, "9899");
		profile.setParameter(profile.GUI, "true");
				
		AgentContainer mainContainer = runtime.createMainContainer(profile);
		
		try {
			AgentController cityAdmin = mainContainer.createNewAgent("CityAdministrator", CityAdminAgent.class.getName(), null);			
			cityAdmin.start();			
			
		} catch (StaleProxyException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
