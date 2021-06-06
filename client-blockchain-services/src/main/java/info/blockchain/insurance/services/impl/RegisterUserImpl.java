package info.blockchain.insurance.services.impl;

import com.google.common.hash.Hashing;
import info.blockchain.insurance.dataobjects.request.RegisterUserRequest;
import info.blockchain.insurance.dataobjects.response.RegisterUserResponse;
import info.blockchain.insurance.dataobjects.response.ResponseEntity;
import info.blockchain.insurance.model.Block;
import info.blockchain.insurance.model.Customer;
import info.blockchain.insurance.repository.BlockRepository;
import info.blockchain.insurance.services.RegisterUser;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.UUID;

import static info.blockchain.insurance.constants.ClientConstants.SUCCESS_STATUS;


@Service
public class RegisterUserImpl implements RegisterUser {

    private final BlockRepository blockRepository;

    public RegisterUserImpl(BlockRepository blockRepository){
        this.blockRepository = blockRepository;
    }

    @Override
    public ResponseEntity registerUser(RegisterUserRequest registerUserRequest) {

        ResponseEntity responseEntity =  new ResponseEntity();
        RegisterUserResponse registerUserResponse = new RegisterUserResponse();
        Customer customer = new Customer();
        Block block = new Block();

        Block previousBlock = blockRepository.findLastBlock();

        if (previousBlock != null) {
            // Block Data
            long newBlockNo = previousBlock.getBlockNo() + 1;
            block.setBlockNo(newBlockNo);
            block.setPreviousHash(previousBlock.getPreviousHash());
        } else{
            // Genesis block
            block.setBlockNo(1000000000L);
            block.setPreviousHash("0");
        }

        block.setTimestamp(new Date());

        // Block Transaction data
        customer.setDigitalId(UUID.randomUUID());
        customer.setFirstName(registerUserRequest.getFirstName());
        customer.setLastName(registerUserRequest.getLastName());
        customer.setPassportNo(registerUserRequest.getPassportNo());
        customer.setCellNo(registerUserRequest.getCellNo());
        customer.setEmail(registerUserRequest.getEmail());

        block.setTransaction(customer);

        String dataToHash = block.getPreviousHash() + block.getTimestamp().toInstant().toString() + customer;
        String hash = Hashing.sha256().hashString(dataToHash, StandardCharsets.UTF_8).toString();
        block.setHash(hash);

        blockRepository.save(block);
        // Set Response
        responseEntity.setStatusCode(SUCCESS_STATUS);
        responseEntity.setMessage("User Created Successfully.");
        registerUserResponse.setDigitalId(customer.getDigitalId());
        responseEntity.setData(registerUserResponse);
        return responseEntity;
    }
}
