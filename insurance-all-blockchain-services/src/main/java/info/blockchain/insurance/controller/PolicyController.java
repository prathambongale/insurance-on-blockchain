package info.blockchain.insurance.controller;

import info.blockchain.insurance.dataobjects.request.CreatePolicyRequest;

@Controller("/policy")
public class PolicyController {
    
    private final PolicyService policyService;

    @Autowired
    public PolicyController(PolicyService policyService) {
        this.policyService = policyService;
    }

    public ResponseEntity createPolicy(CreatePolicyRequest request) {

    }
}
