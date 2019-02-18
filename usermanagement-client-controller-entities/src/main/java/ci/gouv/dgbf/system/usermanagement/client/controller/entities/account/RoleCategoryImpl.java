package ci.gouv.dgbf.system.usermanagement.client.controller.entities.account;

import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractDataImpl;

public class RoleCategoryImpl extends AbstractDataImpl implements RoleCategory,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public RoleCategory setIdentifier(Object identifier) {
		return (RoleCategory) super.setIdentifier(identifier);
	}
	
	@Override
	public RoleCategory setCode(String code) {
		return (RoleCategory) super.setCode(code);
	}
	
}
