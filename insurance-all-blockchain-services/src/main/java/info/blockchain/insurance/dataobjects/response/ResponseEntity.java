package info.blockchain.insurance.dataobjects.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseEntity<T> {
    
    private Integer statusCode;
    private String message;
    private T data;

}
