package ci.gouv.dgbf.system.usermanagement.client.controller.entities.account;

import org.cyk.utility.client.controller.data.Data;

public interface RoleCategory extends Data {

	@Override RoleCategory setIdentifier(Object identifier);
	@Override RoleCategory setCode(String code);
	
	/**/
	
	String PROPERTY_NAME = "name";
}
