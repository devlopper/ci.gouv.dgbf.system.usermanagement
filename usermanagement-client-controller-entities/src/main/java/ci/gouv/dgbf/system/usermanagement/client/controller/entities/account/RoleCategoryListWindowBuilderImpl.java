package ci.gouv.dgbf.system.usermanagement.client.controller.entities.account;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.grid.GridBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderListDataImpl;
import org.cyk.utility.client.controller.data.RowData;

public class RoleCategoryListWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderListDataImpl implements RoleCategoryListWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void __listenPostConstruct__() {
		super.__listenPostConstruct__();
		setRowClass(RoleCategoryReadRow.class);
		addGridColumnsFieldNamesWithPrefix(RowData.PROPERTY_DATA, RoleCategory.PROPERTY_CODE,RoleCategory.PROPERTY_NAME);
	}
	
	@Override
	protected void __execute__(GridBuilder gridBuilder) {
		
	}
	
}
