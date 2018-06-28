package org.jungdev.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *  Change the object name to whatever to make your app make sense
 */
@Component
@Data @AllArgsConstructor @NoArgsConstructor
public class Company {

    public Company(int companyId, String companyName){
        this.companyId = companyId;
        this.companyName = companyName;
    }
    private Integer companyId;
    private String companyName;
    private Double sharePrice;
    private Long volume;
    private Double marketCap;
    private List<Revenue> revenueSources;
}
