package ci.gouv.dgbf.system.usermanagement.server.persistence.impl.account;

import java.io.Serializable;

import javax.inject.Singleton;

import org.cyk.utility.server.persistence.jpa.AbstractPersistenceEntityImpl;

import ci.gouv.dgbf.system.usermanagement.server.persistence.api.account.AccountPersistence;
import ci.gouv.dgbf.system.usermanagement.server.persistence.entities.account.Account;

@Singleton
public class AccountPersistenceImpl extends AbstractPersistenceEntityImpl<Account> implements AccountPersistence,Serializable {
	private static final long serialVersionUID = 1L;
	
}
