package com.allaboutjava.basicconcepts.designpatterns;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Mobile {

  private String os;
  private String display;
  private int ram;
  private String model;

  public Mobile(String os, String display, int ram, String model) {
    this.os = os;
    this.display = display;
    this.ram = ram;
    this.model = model;
  }

  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public int getRam() {
    return ram;
  }

  public void setRam(int ram) {
    this.ram = ram;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  @NotNull
  @Override
  public String toString() {
    return "Mobile{" +
        "os='" + os + '\'' +
        ", display='" + display + '\'' +
        ", ram=" + ram +
        ", model='" + model + '\'' +
        '}';
  }

  @JsonInclude(Include.NON_NULL)
  public static MobileBuilder builder() {
    return new MobileBuilder();
  }

  public static class MobileBuilder {

    private String os;
    private String display;
    private int ram;
    private String model;

    public MobileBuilder() {
    }

    public MobileBuilder os(String os) {
      this.os = os;
      return this;
    }

    public MobileBuilder display(String display) {
      this.display = display;
      return this;
    }

    public MobileBuilder model(String model) {
      this.model = model;
      return this;
    }

    public MobileBuilder ram(int ram) {
      this.ram = ram;
      return this;
    }

    public Mobile build() {
      return new Mobile(os, display, ram, model);
    }
  }
}

