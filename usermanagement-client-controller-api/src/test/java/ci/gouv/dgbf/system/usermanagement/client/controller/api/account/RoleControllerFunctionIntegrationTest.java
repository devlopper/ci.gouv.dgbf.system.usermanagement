package ci.gouv.dgbf.system.usermanagement.client.controller.api.account;

import java.io.Serializable;
import java.util.Collection;

import org.cyk.utility.__kernel__.function.AbstractFunctionRunnableImpl;
import org.cyk.utility.__kernel__.function.FunctionRunnableMap;
import org.cyk.utility.client.controller.proxy.ProxyClassUniformResourceIdentifierStringProvider;
import org.cyk.utility.client.controller.proxy.ProxyClassUniformResourceIdentifierStringProviderImpl;
import org.cyk.utility.client.controller.test.TestControllerCreate;
import org.cyk.utility.client.controller.test.TestControllerRead;
import org.cyk.utility.client.controller.test.arquillian.AbstractControllerArquillianIntegrationTestWithDefaultDeploymentAsSwram;
import org.cyk.utility.collection.CollectionHelper;
import org.cyk.utility.value.ValueUsageType;
import org.junit.Test;

import ci.gouv.dgbf.system.usermanagement.client.controller.entities.account.Role;

public class RoleControllerFunctionIntegrationTest extends AbstractControllerArquillianIntegrationTestWithDefaultDeploymentAsSwram {
	private static final long serialVersionUID = 1L;
	
	/* Create */
	
	@Test
	public void createOneRole() throws Exception{
		__inject__(FunctionRunnableMap.class).set(ProxyClassUniformResourceIdentifierStringProviderImpl.class, ProxyClassUniformResourceIdentifierStringProviderFunctionRunnableImpl.class,100);
		Collection<Role> roles = __inject__(RoleController.class).read();
		assertionHelper.assertTrue(__inject__(CollectionHelper.class).isEmpty(roles));
		
		Role role = __inject__(Role.class).setCode("r01");
		__inject__(TestControllerCreate.class).addObjects(role).execute();
		
		roles = __inject__(RoleController.class).read();
		assertionHelper.assertEquals(1,__inject__(CollectionHelper.class).getSize(roles));
		
		TestControllerRead function = __inject__(TestControllerRead.class);
		//function.setIsCatchThrowable(Boolean.FALSE);
		function.setObjectClass(Role.class);
		function.setIdentifierValueUsageType(ValueUsageType.BUSINESS);
		function.addObjects("r01").execute();
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
