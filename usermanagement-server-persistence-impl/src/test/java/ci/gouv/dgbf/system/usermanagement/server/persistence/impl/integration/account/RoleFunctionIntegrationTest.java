package ci.gouv.dgbf.system.usermanagement.server.persistence.impl.integration.account;

import org.cyk.utility.server.persistence.test.TestPersistenceCreate;
import org.cyk.utility.server.persistence.test.arquillian.AbstractPersistenceArquillianIntegrationTestWithDefaultDeploymentAsSwram;
import org.junit.Test;

import ci.gouv.dgbf.system.usermanagement.server.persistence.entities.account.Role;

public class RoleFunctionIntegrationTest extends AbstractPersistenceArquillianIntegrationTestWithDefaultDeploymentAsSwram {
	private static final long serialVersionUID = 1L;
	
	/* Create */
	
	@Test
	public void createOneRole() throws Exception{
		__inject__(TestPersistenceCreate.class).addObjects(new Role().setCode("r01")).execute();
		
	}
	
}
