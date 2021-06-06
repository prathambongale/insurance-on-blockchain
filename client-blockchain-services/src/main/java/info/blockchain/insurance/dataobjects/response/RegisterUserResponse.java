package info.blockchain.insurance.dataobjects.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
public class RegisterUserResponse implements Serializable {

    private UUID digitalId;
}
