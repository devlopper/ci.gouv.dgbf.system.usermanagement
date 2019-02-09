package ci.gouv.dgbf.system.usermanagement.server.business.impl.account;

import javax.inject.Singleton;

import org.cyk.utility.server.business.AbstractBusinessEntityImpl;

import ci.gouv.dgbf.system.usermanagement.server.business.api.account.RoleBusiness;
import ci.gouv.dgbf.system.usermanagement.server.persistence.api.account.RolePersistence;
import ci.gouv.dgbf.system.usermanagement.server.persistence.entities.account.Role;

@Singleton
public class RoleBusinessImpl extends AbstractBusinessEntityImpl<Role, RolePersistence> implements RoleBusiness {
	private static final long serialVersionUID = 1L;

	@Override
	protected Class<Role> __getEntityClass__() {
		return Role.class;
	}
	
}
