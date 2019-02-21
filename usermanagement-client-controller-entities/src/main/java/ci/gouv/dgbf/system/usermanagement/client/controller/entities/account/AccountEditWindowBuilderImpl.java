package ci.gouv.dgbf.system.usermanagement.client.controller.entities.account;
import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.cyk.utility.client.controller.component.annotation.Input;
import org.cyk.utility.client.controller.component.annotation.InputString;
import org.cyk.utility.client.controller.component.annotation.InputStringLineOne;
import org.cyk.utility.client.controller.component.view.ViewBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderEditDataImpl;
import org.cyk.utility.client.controller.data.Data;
import org.cyk.utility.client.controller.data.Form;
import org.cyk.utility.system.action.SystemAction;

public class AccountEditWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderEditDataImpl implements AccountEditWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
	
	@Input @InputString @InputStringLineOne @NotNull
	private String pass;
	
	@Override
	protected void __listenPostConstruct__() {
		super.__listenPostConstruct__();
		setFormClass(AccountEditForm.class);
	}
	
	@Override
	protected void __execute__(Form form,SystemAction systemAction,Data data,ViewBuilder viewBuilder) {
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, Account.PROPERTY_CODE);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, Account.PROPERTY_PASS);
	}
	
}
