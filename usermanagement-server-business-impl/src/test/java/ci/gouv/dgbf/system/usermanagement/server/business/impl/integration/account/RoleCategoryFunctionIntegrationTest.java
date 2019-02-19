package ci.gouv.dgbf.system.usermanagement.server.business.impl.integration.account;

import org.cyk.utility.server.business.test.TestBusinessCreate;
import org.cyk.utility.server.business.test.arquillian.AbstractBusinessArquillianIntegrationTestWithDefaultDeploymentAsSwram;
import org.junit.Test;

import ci.gouv.dgbf.system.usermanagement.server.persistence.entities.account.RoleCategory;

public class RoleCategoryFunctionIntegrationTest extends AbstractBusinessArquillianIntegrationTestWithDefaultDeploymentAsSwram {
	private static final long serialVersionUID = 1L;
	
	/* Create */
	
	@Test
	public void createOneRoleCategory() throws Exception{
		RoleCategory roleCategory = new RoleCategory().setCode("rc01");
		__inject__(TestBusinessCreate.class).addObjects(roleCategory).execute();
	}
	

}
