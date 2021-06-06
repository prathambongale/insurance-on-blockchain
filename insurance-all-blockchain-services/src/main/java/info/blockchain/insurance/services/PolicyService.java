package info.blockchain.insurance.services;

import info.blockchain.insurance.dataobjects.request.CreatePolicyRequest;
import info.blockchain.insurance.dataobjects.response.ResponseEntity;

public interface PolicyService {

    ResponseEntity createPolicy(CreatePolicyRequest createPolicyRequest);
}
