package info.blockchain.insurance.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Block {

    private Long blockNo;
    private Date timestamp;
    private String previousHash;
    private String hash;
    private Object transaction;
}
