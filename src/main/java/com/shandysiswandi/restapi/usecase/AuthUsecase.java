package com.shandysiswandi.restapi.usecase;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.shandysiswandi.restapi.entity.User;
import com.shandysiswandi.restapi.exception.UnauthorizeException;
import com.shandysiswandi.restapi.lib.BCrypt;
import com.shandysiswandi.restapi.model.LoginInput;
import com.shandysiswandi.restapi.model.LoginOutput;
import com.shandysiswandi.restapi.model.RegistrationInput;
import com.shandysiswandi.restapi.repository.UserRepository;

@Service
public class AuthUsecase {

    @Autowired
    private ValidationService validation;

    @Autowired
    private UserRepository userRepo;

    @Transactional
    public LoginOutput login(LoginInput req) {

        validation.validate(req);

        Optional<User> user = userRepo.findByUsername(req.getUsername());
        if (!user.isPresent()) {
            throw new UnauthorizeException("invalid credential");
        }

        if (!BCrypt.checkpw(req.getPassword(), user.get().getPassword())) {
            throw new UnauthorizeException("invalid credential");
        }

        // generate token

        return LoginOutput.builder()
                .token("eyJhbGciOiJSUzI1NiIsImtpZCI6InB1YmxpYzpiYzNmMWVjNC1mZjgyLTRhNzMtYTFmNy1lNWUzMTYxMWMyY2MiLCJ0eXAiOiJKV1QifQ")
                .type("Bearer")
                .expiredAt(System.currentTimeMillis())
                .build();
    }

    public boolean registration(RegistrationInput req) {

        return true;
    }

    public boolean logout(User user) {
        return true;
    }

}
