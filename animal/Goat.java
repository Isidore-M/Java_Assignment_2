package animal;

public class Goat extends Animal {
  private int milkPerDay ;
  private String goatName;

  public Goat(String type) {
      super(type);
      
  }

  public void setmilkPerDay(int milkPerDay) {
    this.milkPerDay = milkPerDay;
  }
  public void setgoatName(String goatName) {
    this.goatName = goatName;
  }


  public int getmilkPerDay() {
    return this.milkPerDay;
  }
   public String getgoatName() {
    return this.goatName;
  }

  

}