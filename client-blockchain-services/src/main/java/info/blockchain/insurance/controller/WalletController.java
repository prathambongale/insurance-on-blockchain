package info.blockchain.insurance.controller;

import info.blockchain.insurance.dataobjects.request.RegisterUserRequest;
import info.blockchain.insurance.dataobjects.response.ResponseEntity;
import info.blockchain.insurance.services.impl.RegisterUserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller("/wallet")
public class WalletController {

    private final RegisterUserImpl registerUserImpl;

    @Autowired
    public WalletController(RegisterUserImpl registerUserImpl) {
        this.registerUserImpl = registerUserImpl;
    }

    @PutMapping("/register")
    public ResponseEntity registerUser(@RequestBody RegisterUserRequest registerUserRequest) {
        return registerUserImpl.registerUser(registerUserRequest);
    }
}
