package ci.gouv.dgbf.system.usermanagement.server.representation.impl.integration.account;

import org.cyk.utility.server.representation.AbstractEntityCollection;
import org.cyk.utility.server.representation.test.TestRepresentationCreate;
import org.cyk.utility.server.representation.test.arquillian.AbstractRepresentationArquillianIntegrationTestWithDefaultDeploymentAsSwram;
import org.junit.Test;

import ci.gouv.dgbf.system.usermanagement.server.business.api.account.RoleCategoryBusiness;
import ci.gouv.dgbf.system.usermanagement.server.persistence.entities.account.RoleCategory;
import ci.gouv.dgbf.system.usermanagement.server.representation.api.account.RoleCategoryRepresentation;
import ci.gouv.dgbf.system.usermanagement.server.representation.entities.account.RoleCategoryDto;

public class RoleCategoryFunctionIntegrationTest extends AbstractRepresentationArquillianIntegrationTestWithDefaultDeploymentAsSwram {
	private static final long serialVersionUID = 1L;
	
	@Test
	public void createOneRoleCategory() throws Exception{
		RoleCategoryDto roleCategory = new RoleCategoryDto().setCode("rc01");
		__inject__(TestRepresentationCreate.class).addObjects(roleCategory).execute();
	}
	
	@Test
	public void updateOneRoleCategory() throws Exception{
		RoleCategory roleCategory = new RoleCategory().setCode("rc01ToEdit").setName("n01ToEdit");
		__inject__(RoleCategoryBusiness.class).create(roleCategory);
		
		RoleCategoryDto roleCategoryDto = (RoleCategoryDto) __inject__(RoleCategoryRepresentation.class).getOne("rc01ToEdit", "business").getEntity();
		assertionHelper.assertEquals("n01ToEdit", roleCategoryDto.getName());
		
		roleCategoryDto.setName("n01");
		__inject__(RoleCategoryRepresentation.class).updateOne(roleCategoryDto, null);
		RoleCategoryDto updatedRoleCategoryDto = (RoleCategoryDto) __inject__(RoleCategoryRepresentation.class).getOne("rc01ToEdit", "business").getEntity();
		assertionHelper.assertEquals("n01ToEdit", updatedRoleCategoryDto.getName());
		
		roleCategoryDto.setName("n01");
		__inject__(RoleCategoryRepresentation.class).updateOne(roleCategoryDto, "name");
		updatedRoleCategoryDto = (RoleCategoryDto) __inject__(RoleCategoryRepresentation.class).getOne("rc01ToEdit", "business").getEntity();
		assertionHelper.assertEquals("n01", updatedRoleCategoryDto.getName());
		
		//__inject__(TestRepresentationUpdate.class).addObjects(roleCategory).execute();
	}
	
	@Override
	protected <ENTITY> Class<? extends AbstractEntityCollection<ENTITY>> __getEntityCollectionClass__(Class<ENTITY> aClass) {
		return null;
	}
	

}
