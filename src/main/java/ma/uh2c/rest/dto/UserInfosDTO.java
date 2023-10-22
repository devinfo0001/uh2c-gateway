package ma.uh2c.rest.dto;
/**
 * 
 * @author moham
 *
 */
public class UserInfosDTO {
	private String firstName;
	private String lastName;

	/**
	 * Default construtor
	 */
	public UserInfosDTO() {
		super();
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
