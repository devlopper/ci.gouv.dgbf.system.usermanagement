package ci.gouv.dgbf.system.usermanagement.client.controller.entities.account;
import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractRowDataImpl;

public class RoleCategoryReadRowImpl extends AbstractRowDataImpl<RoleCategory> implements RoleCategoryReadRow,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public RoleCategoryReadRow setData(RoleCategory data) {
		return (RoleCategoryReadRow) super.setData(data);
	}
	
}
