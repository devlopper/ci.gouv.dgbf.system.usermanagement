package ci.gouv.dgbf.system.usermanagement.client.controller.entities.account;
import java.io.Serializable;
import java.util.Collection;

import javax.validation.constraints.NotNull;

import org.cyk.utility.client.controller.component.annotation.Input;
import org.cyk.utility.client.controller.component.annotation.InputString;
import org.cyk.utility.client.controller.component.annotation.InputStringLineOne;
import org.cyk.utility.client.controller.component.view.ViewBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderEditDataImpl;
import org.cyk.utility.client.controller.component.window.WindowBuilder;
import org.cyk.utility.client.controller.data.Data;
import org.cyk.utility.client.controller.data.Form;
import org.cyk.utility.system.action.SystemAction;

public class RoleCategoryEditWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderEditDataImpl implements RoleCategoryEditWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
	
	@Input @InputString @InputStringLineOne @NotNull
	private String name;
	
	@Override
	protected void __listenPostConstruct__() {
		super.__listenPostConstruct__();
		setFormClass(RoleCategoryEditForm.class);
	}
	
	@Override
	protected void __execute__(Form form,SystemAction systemAction,Data data,ViewBuilder viewBuilder) {
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, RoleCategory.PROPERTY_CODE);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, RoleCategory.PROPERTY_NAME);
	}
	
	@Override
	protected Collection<String> __getPersistenceEntityFieldNames__(WindowBuilder window, SystemAction systemAction,Class<? extends Form> formClass) {
		return __injectCollectionHelper__().instanciate(ci.gouv.dgbf.system.usermanagement.server.persistence.entities.account.RoleCategory.FIELD_NAME);
	}

}
