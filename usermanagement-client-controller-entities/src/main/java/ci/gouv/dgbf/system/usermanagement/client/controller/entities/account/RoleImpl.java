package ci.gouv.dgbf.system.usermanagement.client.controller.entities.account;

import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractDataImpl;

public class RoleImpl extends AbstractDataImpl implements Role,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public Role setIdentifier(Object identifier) {
		return (Role) super.setIdentifier(identifier);
	}
	
	@Override
	public Role setCode(String code) {
		return (Role) super.setCode(code);
	}
	
}
