package com.sxk.domain;

import lombok.Data;
import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private String password;
    private String hobby;
    private String address;

}
