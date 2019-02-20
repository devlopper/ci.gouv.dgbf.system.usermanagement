package ci.gouv.dgbf.system.usermanagement.client.controller.api.account;

import java.io.Serializable;

import org.cyk.utility.__kernel__.function.AbstractFunctionRunnableImpl;
import org.cyk.utility.__kernel__.function.FunctionRunnableMap;
import org.cyk.utility.__kernel__.properties.Properties;
import org.cyk.utility.client.controller.proxy.ProxyClassUniformResourceIdentifierStringProvider;
import org.cyk.utility.client.controller.proxy.ProxyClassUniformResourceIdentifierStringProviderImpl;
import org.cyk.utility.client.controller.test.TestControllerCreate;
import org.cyk.utility.client.controller.test.arquillian.AbstractControllerArquillianIntegrationTestWithDefaultDeploymentAsSwram;
import org.cyk.utility.random.RandomHelper;
import org.junit.Test;

import ci.gouv.dgbf.system.usermanagement.client.controller.entities.account.Role;

public class RoleControllerFunctionIntegrationTest extends AbstractControllerArquillianIntegrationTestWithDefaultDeploymentAsSwram {
	private static final long serialVersionUID = 1L;
	
	/* Create */
	
	@Test
	public void createOneRole() throws Exception{
		__inject__(FunctionRunnableMap.class).set(ProxyClassUniformResourceIdentifierStringProviderImpl.class, ProxyClassUniformResourceIdentifierStringProviderFunctionRunnableImpl.class,100);
		
		String code = __inject__(RandomHelper.class).getAlphabetic(3);
		
		Role role = __inject__(Role.class).setCode(code);
		__inject__(TestControllerCreate.class).setIsCatchThrowable(Boolean.FALSE).addObjects(role).execute();
	}
	
	@Test
	public void updateOneRole() throws Exception{
		__inject__(FunctionRunnableMap.class).set(ProxyClassUniformResourceIdentifierStringProviderImpl.class, ProxyClassUniformResourceIdentifierStringProviderFunctionRunnableImpl.class,100);
		
		String code = __inject__(RandomHelper.class).getAlphabetic(3);
		
		Role role = __inject__(Role.class).setCode(code).setName("admin");
		__inject__(RoleController.class).create(role);
		
		role = __inject__(RoleController.class).readOneByBusinessIdentifier(code);
		assertionHelper.assertEquals("admin", role.getName());
		role.setName("administrateur");
		Properties properties = new Properties();
		properties.setFields("name");
		__inject__(RoleController.class).update(role,properties);
		
		role = __inject__(RoleController.class).readOneByBusinessIdentifier(code);
		assertionHelper.assertEquals("administrateur", role.getName());
	}
	
	@Test
	public void deleteOneRole() throws Exception{
		__inject__(FunctionRunnableMap.class).set(ProxyClassUniformResourceIdentifierStringProviderImpl.class, ProxyClassUniformResourceIdentifierStringProviderFunctionRunnableImpl.class,100);
		
		String code = __inject__(RandomHelper.class).getAlphabetic(3);
		Role role = __inject__(RoleController.class).readOneByBusinessIdentifier(code);
		assertionHelper.assertNull(role);
		role = __inject__(Role.class).setCode(code);
		__inject__(RoleController.class).create(role);
		role = __inject__(RoleController.class).readOneByBusinessIdentifier(code);
		assertionHelper.assertNotNull(role);
		__inject__(RoleController.class).delete(role);
		role = __inject__(RoleController.class).readOneByBusinessIdentifier(code);
		assertionHelper.assertNull(role);
	}
	
	/**/
	
	public static class ProxyClassUniformResourceIdentifierStringProviderFunctionRunnableImpl extends AbstractFunctionRunnableImpl<ProxyClassUniformResourceIdentifierStringProvider> implements Serializable {
		private static final long serialVersionUID = 1L;
		
		public ProxyClassUniformResourceIdentifierStringProviderFunctionRunnableImpl() {
			setRunnable(new Runnable() {
				@Override
				public void run() {
					setOutput("http://localhost:8080/usermanagement/server/");
				}
			});
		}
		
	}
	
}
