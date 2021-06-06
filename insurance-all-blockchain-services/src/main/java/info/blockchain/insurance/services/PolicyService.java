package info.blockchain.insurance.services;

import info.blockchain.insurance.dataobjects.request.CreateCarPolicyRequest;
import info.blockchain.insurance.dataobjects.response.ResponseEntity;

public interface PolicyService {

    ResponseEntity createCarPolicy(CreateCarPolicyRequest createCarPolicyRequest);
}
