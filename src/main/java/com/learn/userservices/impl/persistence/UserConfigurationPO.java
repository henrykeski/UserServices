package com.learn.userservices.impl.persistence;

import javax.persistence.*;

@Entity
@Table(name = "UserConfiguration", schema = "")
public class UserConfigurationPO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userConfigurationId")
    private Integer userConfigurationId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String authorizationType;

    @Column
    private Integer portfolioId;


    public Integer getUserConfigurationId() {
        return userConfigurationId;
    }


    public void setUserConfigurationId(Integer userConfigurationId) {
        this.userConfigurationId = userConfigurationId;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public Integer getPortfolioId() {
        return portfolioId;
    }


    public void setPortfolioId(Integer portfolioId) {
        this.portfolioId = portfolioId;
    }


    public String getAuthorizationType() {
        return authorizationType;
    }


    public void setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
    }
}
