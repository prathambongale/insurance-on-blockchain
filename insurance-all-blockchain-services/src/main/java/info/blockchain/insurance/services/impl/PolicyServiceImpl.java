package info.blockchain.insurance.services.impl;

import info.blockchain.insurance.dataobjects.request.CreatePolicyRequest;
import info.blockchain.insurance.services.PolicyService;
import info.blockchain.insurance.dataobjects.response.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PolicyServiceImpl implements PolicyService {

    @Override
    public ResponseEntity createPolicy(CreatePolicyRequest createPolicyRequest) {
        return null;
    }
}
