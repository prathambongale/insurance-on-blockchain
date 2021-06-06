package info.blockchain.insurance.dataobjects.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class RegisterUserRequest implements Serializable {

    private String firstName;
    private String lastName;
    private String passportNo;
    private Integer cellNo;
    private String email;
}
