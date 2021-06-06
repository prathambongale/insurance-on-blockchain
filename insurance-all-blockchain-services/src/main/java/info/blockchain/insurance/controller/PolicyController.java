package info.blockchain.insurance.controller;

import info.blockchain.insurance.dataobjects.request.CreateCarPolicyRequest;
import info.blockchain.insurance.dataobjects.response.ResponseEntity;
import info.blockchain.insurance.services.impl.PolicyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller("/policy")
public class PolicyController {
    
    private final PolicyServiceImpl policyServiceImpl;

    @Autowired
    public PolicyController(PolicyServiceImpl policyServiceImpl) {

        this.policyServiceImpl = policyServiceImpl;
    }

    @PutMapping("/createCarPolicy")
    public ResponseEntity createCarPolicy(@RequestBody CreateCarPolicyRequest createCarPolicyRequest) {
        return policyServiceImpl.createCarPolicy(createCarPolicyRequest);
    }
}
