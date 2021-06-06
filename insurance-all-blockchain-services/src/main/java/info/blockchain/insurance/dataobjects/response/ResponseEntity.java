package info.blockchain.insurance.dataobjects.response;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseEntity<T> {
    
    private Integer statusCode;
    private String message;
    private T data;

}
