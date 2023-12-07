package Pay.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Entity
@Data
@NoArgsConstructor
@Setter
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

//	@Pattern(regexp = "^[a-zA-Z]+$", message = "Name must contain only letters")
//	@NotEmpty(message = "must not be empty")
	private String userName;

//	@Email(message="must be in proper format")
//	private String email;

//	@Pattern(regexp = "^[0-9]+$", message = "Must contain only numbers")
//	@NotEmpty(message = "must not be empty")
//	private String countryCode;

//	@Pattern(regexp="[0-9]{10}$", message = "10 digits only")
////	@Size(min=11,max = 13)
//	@NotEmpty(message = "must not be empty")
	private String phoneNumber;
	
//	@Pattern(regexp = "^(?!\\s)[A-Za-z\\d!@#$%^&*()_+{}:;<>,.?~\\-=|\\[\\]]{8,}$", message = "Password must be at least 8 characters long, contain at least one letter, one digit, and no spaces.")
//	@Size(min = 8, message = "Password must be at least 8 characters long")
////	@Pattern(regexp="^\\s+$\n",message = "No space in password.")
//	@NotEmpty(message = "must not be empty")
	private String password;

//	@Pattern(regexp = "^(?!\\s)[A-Za-z\\d!@#$%^&*()_+{}:;<>,.?~\\-=|\\[\\]]{8,}$", message = "Password must be at least 8 characters long, contain at least one letter, one digit, and no spaces.")
//	@Size(min = 8, message = "Password must be at least 8 characters long")
//	@Pattern(regexp="^\\s+$\n",message = "No space in password.")
//	@NotEmpty(message = "must not be empty")
	private String cprNumber;

//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//	public void setPhoneNumber(String phoneNumber) {
//		this.phoneNumber = phoneNumber;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public void setCprNumber(String cprNumber) {
//		this.cprNumber = cprNumber;
//	}
//
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", userName=" + userName + ", phoneNumber=" + phoneNumber + ", password=" + password
//				+ ", cprNumber=" + cprNumber + "]";
//	}
//
//	public User(int id,
//			@Pattern(regexp = "^[a-zA-Z]+$", message = "Name must contain only letters") @NotEmpty(message = "must not be empty") String userName,
//			@Pattern(regexp = "[0-9]{10}$", message = "10 digits only") @NotEmpty(message = "must not be empty") String phoneNumber,
//			@Pattern(regexp = "^(?!\\s)[A-Za-z\\d!@#$%^&*()_+{}:;<>,.?~\\-=|\\[\\]]{8,}$", message = "Password must be at least 8 characters long, contain at least one letter, one digit, and no spaces.") @Size(min = 8, message = "Password must be at least 8 characters long") @Pattern(regexp = "^\\s+$\n", message = "No space in password.") @NotEmpty(message = "must not be empty") String password,
//			@NotEmpty(message = "must not be empty") String cprNumber) {
//		super();
//		this.id = id;
//		this.userName = userName;
//		this.phoneNumber = phoneNumber;
//		this.password = password;
//		this.cprNumber = cprNumber;
//	}
//
	
	}
