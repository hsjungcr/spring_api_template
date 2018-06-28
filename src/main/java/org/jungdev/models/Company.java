package org.jungdev.models;

import lombok.Data;

import java.util.List;

/**
 *  Change the object name to whatever to make your app make sense
 */
@Data
public class Company {
    public Company(){

    }
    public Company(Integer id, String companyName){
        this.companyId = id;
        this.companyName = companyName;
    }
    private Integer companyId;
    private String companyName;
    private Double sharePrice;
    private Long volume;
    private Double marketCap;
    private List<Revenue> revenueSources;
}
