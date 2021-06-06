package info.blockchain.insurance.controller;

import info.blockchain.insurance.dataobjects.request.CreatePolicyRequest;
import info.blockchain.insurance.dataobjects.response.ResponseEntity;
import info.blockchain.insurance.services.impl.PolicyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;

@Controller("/policy")
public class PolicyController {
    
    private final PolicyServiceImpl policyServiceImpl;

    @Autowired
    public PolicyController(PolicyServiceImpl policyServiceImpl) {

        this.policyServiceImpl = policyServiceImpl;
    }

    @PutMapping("/createPolicy")
    public ResponseEntity createPolicy(CreatePolicyRequest createPolicyRequest) {
        return policyServiceImpl.createPolicy(createPolicyRequest);
    }
}
