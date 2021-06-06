package info.blockchain.insurance.services;

public interface ClientService {
    
    ResponseEntity createClaim();
    ResponseEntity getPolicyDetails();
    ResponseEntity givePermission();
}
