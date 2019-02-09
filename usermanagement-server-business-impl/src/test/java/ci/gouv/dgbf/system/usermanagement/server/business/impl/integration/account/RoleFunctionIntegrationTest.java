package ci.gouv.dgbf.system.usermanagement.server.business.impl.integration.account;

import org.cyk.utility.collection.CollectionHelper;
import org.cyk.utility.server.business.test.TestBusinessCreate;
import org.cyk.utility.server.business.test.arquillian.AbstractBusinessArquillianIntegrationTestWithDefaultDeploymentAsSwram;
import org.junit.Test;

import ci.gouv.dgbf.system.usermanagement.server.business.api.account.RoleBusiness;
import ci.gouv.dgbf.system.usermanagement.server.persistence.entities.account.Role;

public class RoleFunctionIntegrationTest extends AbstractBusinessArquillianIntegrationTestWithDefaultDeploymentAsSwram {
	private static final long serialVersionUID = 1L;
	
	/* Create */
	
	@Test
	public void createOneRole() throws Exception{
		__inject__(RoleBusiness.class).createMany(__inject__(CollectionHelper.class).instanciate(
				new Role().setCode("R01"),new Role().setCode("R02"),new Role().setCode("R03"),new Role().setCode("R04"),new Role().setCode("R05")
				));
		
		Role role = new Role();
		role.setCode("P01");
		__inject__(TestBusinessCreate.class).addObjects(role).execute();
	}
	

}
