package info.blockchain.insurance.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Getter
@Setter
@ToString
public class Customer {

    @Id
    private UUID digitalId;
    private String firstName;
    private String lastName;
    private String passportNo;
    private Integer cellNo;
    private String email;
}
