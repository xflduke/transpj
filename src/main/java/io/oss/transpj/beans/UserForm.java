package io.oss.transpj.beans;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

public class UserForm {

    @NotNull
    @Size(min=4, max=4)
    private String name;

    @NotNull
    @Length(min=32, max=32)
    private String randomKey;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRandomKey() {
        return randomKey;
    }

    public void setRandomKey(String randomKey) {
        this.randomKey = randomKey;
    }
    
    public String toString() {
        return this.getClass().toString();
    }
}