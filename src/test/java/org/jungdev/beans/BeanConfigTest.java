package org.jungdev.beans;

import org.jungdev.models.Company;
import org.jungdev.models.Revenue;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BeanConfigTest {
    @Test
    public void checkMyCompany() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Company co1 = (Company) context.getBean("myCompany");
        Assert.assertEquals(co1.getCompanyName(), "Amazon.com, Inc.");
        for (Revenue revenue : co1.getRevenueSources()) {
            System.out.println(revenue.getSourceName() + ": $" + revenue.getSouceAmount() + " billions");
        }
    }

}
