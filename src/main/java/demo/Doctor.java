package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.SQLOutput;
@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {
    @Override
    public String toString() {
        return "Doctor{" +
                "qualifcations='" + qualifcations + '\'' +
                '}';
    }

    private String qualifcations;

    public String getQualifcations() {
        return qualifcations;
    }

    public void setQualifcations(String qualifcations) {
        this.qualifcations = qualifcations;
    }

    public void assisst(){
        System.out.println("Doctor");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName called");
    }
    @PostConstruct
    public void postconstruct(){
        System.out.println("Post construct is called");
    }
}

