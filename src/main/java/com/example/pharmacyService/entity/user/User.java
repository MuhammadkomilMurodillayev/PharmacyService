package com.example.pharmacyService.entity.user;

import com.example.pharmacyService.entity.Auditable;
import com.example.pharmacyService.enums.UserRole;
import com.example.pharmacyService.enums.user.Position;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.net.SocketException;
import java.net.UnknownHostException;

@Getter
@Setter
@Entity
@Table(schema = "users")
public class User extends Auditable {

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column
    private Position position;

    @Column(name = "role", nullable = false)
    @Enumerated(EnumType.STRING)
    private UserRole role;

    public User()  {
        super();
        this.position = Position.NONE;
        this.role = UserRole.ANONYMOUS;
    }

    public User(String username, String password, String firstName, String lastName) throws SocketException, UnknownHostException {
        this();
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String username, String password, String firstName, String lastName, UserRole role) throws SocketException, UnknownHostException {
        this(username, password, firstName, lastName);
        this.role = role;
    }



}
