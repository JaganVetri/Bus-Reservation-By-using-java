package Busrev;

public class Bus {
  private int Busno;
  private boolean Ac;
  private int Capacity;//get and set
   
  Bus(int Busno,boolean Ac,int Capacity){
	  this.Busno=Busno;
	  this.Ac=Ac;
	  this.Capacity=Capacity;
  }

   public int getCapacity() {//accessor method
	return Capacity;
}

   public boolean isAc() {
	return Ac;
}

   public void setAc(boolean ac) {
	Ac = ac;
}

  public void setCapacity(int capacity) {//mutator
	Capacity = capacity;
}
  public void displayBusInfo() {
	  System.out.println("Busno :" + Busno + "Ac :" + Ac + "Capacity :" + Capacity);
  }

  
  
  
}
