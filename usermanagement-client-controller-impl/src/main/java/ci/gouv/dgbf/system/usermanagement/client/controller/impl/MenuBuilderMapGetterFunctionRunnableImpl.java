package ci.gouv.dgbf.system.usermanagement.client.controller.impl;

import java.io.Serializable;

import javax.faces.context.FacesContext;

import org.cyk.utility.__kernel__.function.AbstractFunctionRunnableImpl;
import org.cyk.utility.__kernel__.properties.Properties;
import org.cyk.utility.client.controller.component.menu.MenuBuilder;
import org.cyk.utility.client.controller.component.menu.MenuBuilderMap;
import org.cyk.utility.client.controller.component.menu.MenuBuilderMapGetter;
import org.cyk.utility.client.controller.component.menu.MenuItemBuilder;
import org.cyk.utility.client.controller.component.menu.MenuRenderTypeRowBar;
import org.cyk.utility.scope.ScopeSession;
import org.cyk.utility.system.action.SystemActionCreate;
import org.cyk.utility.system.action.SystemActionList;

import ci.gouv.dgbf.system.usermanagement.client.controller.entities.account.RoleCategory;
import ci.gouv.dgbf.system.usermanagement.server.persistence.entities.account.UserAccount;

public class MenuBuilderMapGetterFunctionRunnableImpl extends AbstractFunctionRunnableImpl<MenuBuilderMapGetter> implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public MenuBuilderMapGetterFunctionRunnableImpl() {
		setRunnable(new Runnable() {
			@Override
			public void run() {
				Object principal = FacesContext.getCurrentInstance().getExternalContext().getUserPrincipal();
				MenuBuilder menuBuilder = __inject__(MenuBuilder.class).setRenderType(__inject__(MenuRenderTypeRowBar.class));
				if(principal == null) {
					menuBuilder.addItems(
						__inject__(MenuItemBuilder.class).setCommandableName("Comptes utilisateurs").setCommandableOutputProperty(Properties.ICON, "fa fa-users").addChild(
								__inject__(MenuItemBuilder.class).setCommandableName("Créer un compte utilisateur").setCommandableOutputProperty(Properties.ICON, "fa fa-user-plus")
								.setCommandableNavigationIdentifierBuilderSystemAction(__inject__(SystemActionCreate.class).setEntityClass(UserAccount.class))
								,__inject__(MenuItemBuilder.class).setCommandableName("Catégorie de role")
								.setCommandableNavigationIdentifierBuilderSystemAction(__inject__(SystemActionList.class).setEntityClass(RoleCategory.class))
						)									
					);	
				}else {
					
				}
				setOutput(__inject__(MenuBuilderMap.class).set(ScopeSession.class,menuBuilder));
			}
		});
	}
	
}