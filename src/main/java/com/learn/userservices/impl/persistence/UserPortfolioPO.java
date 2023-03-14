package com.learn.userservices.impl.persistence;

import javax.persistence.*;

@Entity
@Table(name = "UserPortfolio")
public class UserPortfolioPO {

    @Id
    @Column(name = "PortfolioConfigurationID", columnDefinition = "BIGINT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer portfolioId;

    @Column
    public String portfolioImage;

    @Column
    public String projectName;

    @Column
    public Integer Rating;


    public String getPortfolioImage() {
        return portfolioImage;
    }

    public void setPortfolioImage(String portfolioImage) {
        this.portfolioImage = portfolioImage;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getRating() {
        return Rating;
    }

    public void setRating(Integer rating) {
        Rating = rating;
    }
}
