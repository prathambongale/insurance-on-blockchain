package info.blockchain.insurance.services;

import info.blockchain.insurance.dataobjects.request.RegisterUserRequest;
import info.blockchain.insurance.dataobjects.response.ResponseEntity;

public interface RegisterUser {

    ResponseEntity registerUser(RegisterUserRequest registerUserRequest);
}
