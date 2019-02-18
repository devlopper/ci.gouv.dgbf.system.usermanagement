package ci.gouv.dgbf.system.usermanagement.client.controller.entities.account;

import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractFormDataImpl;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class RoleCategoryEditFormImpl extends AbstractFormDataImpl<RoleCategory> implements RoleCategoryEditForm,Serializable {
	private static final long serialVersionUID = 1L;
	
}
