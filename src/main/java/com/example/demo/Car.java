package com.example.demo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Car {
    @NotNull
    @Min(1)
    private long id;

    @NotNull
    @Size(min=3, max=20)
    private String carmake;

    @NotNull
    @Size(min=3, max=10)
    private String carmodel;

    @NotNull
    @Min(1900)
    @Max(2019)
    private int caryear;

    @NotNull
    @Size(min=10, max=30)
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCarmake() {
        return carmake;
    }

    public void setCarmake(String carmake) {
        this.carmake = carmake;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    public int getCaryear() {
        return caryear;
    }

    public void setCaryear(int caryear) {
        this.caryear = caryear;
    }
}
