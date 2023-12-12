package com.tecsup.Eva04.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "users")
public class users implements Serializable {
    @Id
    @Column(name = "id_")
    private Long id;
    private String ipAddress;
    private String username;
    private String password;
    private String email;
    private String activationSelector;
    private String activationCode;
    private String forgottenPasswordSelector;
    private String forgottenPasswordCode;
    private Integer forgottenPasswordTime;
    private String rememberSelector;
    private String rememberCode;
    private Integer createdOn;
    private Integer lastLogin;
    private Boolean active;
    private String firstName;
    private String lastName;
    private String company;
    private String phone;
}