package com.misolab.signle.common.jwt;

import com.auth0.jwt.algorithms.Algorithm;

import java.util.Date;

public interface JwtProperties {
    Algorithm algorithm();

    Date expirationTime();
}
