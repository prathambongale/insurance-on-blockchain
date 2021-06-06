package info.blockchain.insurance.services.impl;

import info.blockchain.insurance.dataobjects.request.CreateCarPolicyRequest;
import info.blockchain.insurance.dataobjects.response.ResponseEntity;
import info.blockchain.insurance.services.PolicyService;
import org.springframework.stereotype.Service;

@Service
public class PolicyServiceImpl implements PolicyService {

    @Override
    public ResponseEntity createCarPolicy(CreateCarPolicyRequest createCarPolicyRequest) {
        return null;
    }
}
