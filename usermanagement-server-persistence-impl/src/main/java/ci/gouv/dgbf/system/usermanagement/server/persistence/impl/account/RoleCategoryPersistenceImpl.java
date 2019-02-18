package ci.gouv.dgbf.system.usermanagement.server.persistence.impl.account;

import java.io.Serializable;

import javax.inject.Singleton;

import org.cyk.utility.server.persistence.jpa.AbstractPersistenceEntityImpl;

import ci.gouv.dgbf.system.usermanagement.server.persistence.api.account.RoleCategoryPersistence;
import ci.gouv.dgbf.system.usermanagement.server.persistence.entities.account.RoleCategory;

@Singleton
public class RoleCategoryPersistenceImpl extends AbstractPersistenceEntityImpl<RoleCategory> implements RoleCategoryPersistence,Serializable {
	private static final long serialVersionUID = 1L;
	
}
