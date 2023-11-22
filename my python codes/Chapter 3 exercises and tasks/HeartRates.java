public class HeartRates{
	private String firstName;
	private String lastName;
	private int mOB;
	private int dOB;
	private int yOB;
public HeartRates(String firstName, String lastName,int mOB,int dOB,int yOB){
this.firstName = firstName;
this.lastName = lastName;
this.mOB = mOB;
this.dOB = dOB;
this.yOB = yOB;
}
public void setFirstName(String firstName){
this.firstName = firstName;
}
public void setLastName(String lastName){
this.lastName = lastName;
}
public void setMOB(int mOB){
this.mOB = mOB;
}
public void setDOB(int dOB){
this.dOB =  dOB;
}
public void setYOB(int yOB){
this.yOB = yOB;
}
public String getFirstName(){
return firstName;
}

public String getLastName(){
return lastName;
}

public int getMOB(){
return mOB;
}

public int getDOB(){
return dOB;
}

public int getYOB(){
return yOB;
}

public int getAge(){
return 2023 - getYOB();
}
private int maxHeartRate;
public void setMaxHeartRate(int yOB){
int artRate = 2023-yOB;
int maxHeartRate = 220- artRate;
this.maxHeartRate = maxHeartRate;
}
public double getMaxHeartRate(){
return maxHeartRate;
}

public double getMinTargetHeartRate(){
double targetHeartRate1 = 0.5 * maxHeartRate;
return targetHeartRate1;
}
public double getMaxTargetHeartRate(){
double targetHeartRate2 = 0.8 * maxHeartRate;
return targetHeartRate2;
}
}