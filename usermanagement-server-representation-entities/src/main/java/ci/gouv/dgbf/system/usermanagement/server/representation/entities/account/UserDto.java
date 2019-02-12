package ci.gouv.dgbf.system.usermanagement.server.representation.entities.account;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.cyk.utility.server.representation.AbstractEntityFromPersistenceEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@XmlRootElement @Getter @Setter @Accessors(chain=true) @NoArgsConstructor
public class UserDto extends AbstractEntityFromPersistenceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String electronicMailAddress;
	private UserNaturalPersonDto person;
	
	@Override
	public UserDto setCode(String code) {
		return (UserDto) super.setCode(code);
	}
	
}
