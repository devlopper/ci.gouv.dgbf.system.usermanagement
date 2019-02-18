package ci.gouv.dgbf.system.usermanagement.server.persistence.entities.account;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.cyk.utility.server.persistence.jpa.AbstractEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity @Getter @Setter @Accessors(chain=true) @Access(AccessType.FIELD)
@Table(name=RoleCategory.TABLE_NAME)
public class RoleCategory extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name=COLUMN_NAME) private String name;
	
	@Override
	public RoleCategory setCode(String code) {
		return (RoleCategory) super.setCode(code);
	}
	
	/**/
	
	public static final String FIELD_NAME = "name";
	
	public static final String TABLE_NAME = "rolecateg";
	
	public static final String COLUMN_NAME = "nom";
}
