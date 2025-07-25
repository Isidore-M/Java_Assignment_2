package animal;

public class Duck extends Animal {
  private String eggColor;
  private String duckName;

  public Duck(String type) {
      super(type); 
  }

  public String getDetails() {
    return "Egg Color: " +this.eggColor + ", Duck Name" +this.duckName;
  }
  public String geteggColor() {
    return this.eggColor;
  }
  public String getduckName() {
    return this.duckName;
  }

  public void seteggColor(String eggColor) {
    this.eggColor = eggColor;
  }
  public void setduckName(String duckName) {
    this.duckName = duckName;
  }

} 