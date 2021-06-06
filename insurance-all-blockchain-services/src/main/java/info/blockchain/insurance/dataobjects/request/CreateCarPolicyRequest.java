package info.blockchain.insurance.dataobjects.request;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarPolicyRequest implements Serializable {

    private String userData;
    private String customerPublicKey;
}
