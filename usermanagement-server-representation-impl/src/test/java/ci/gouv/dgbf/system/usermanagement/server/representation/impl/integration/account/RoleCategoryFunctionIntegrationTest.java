package ci.gouv.dgbf.system.usermanagement.server.representation.impl.integration.account;

import org.cyk.utility.server.representation.AbstractEntityCollection;
import org.cyk.utility.server.representation.test.TestRepresentationCreate;
import org.cyk.utility.server.representation.test.arquillian.AbstractRepresentationArquillianIntegrationTestWithDefaultDeploymentAsSwram;
import org.junit.Test;

import ci.gouv.dgbf.system.usermanagement.server.representation.entities.account.RoleCategoryDto;

public class RoleCategoryFunctionIntegrationTest extends AbstractRepresentationArquillianIntegrationTestWithDefaultDeploymentAsSwram {
	private static final long serialVersionUID = 1L;
	
	@Test
	public void createOneRoleCategory() throws Exception{
		RoleCategoryDto roleCategory = new RoleCategoryDto().setCode("rc01");
		__inject__(TestRepresentationCreate.class).addObjects(roleCategory).execute();
	}
	
	@Override
	protected <ENTITY> Class<? extends AbstractEntityCollection<ENTITY>> __getEntityCollectionClass__(Class<ENTITY> aClass) {
		return null;
	}
	

}
