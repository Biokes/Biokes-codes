public class HealthProfile{
	private String firstName;
	private String lastName;
	private int mOB;
	private int dOB;
	private int yOB;
	private String gender;
 	private double height;
	private double weight;

public HealthProfile(String firstName, String lastName,int mOB,int dOB,int yOB,String gender,double height,double weight){
this.firstName = firstName;
this.lastName = lastName;
this.mOB = mOB;
this.dOB = dOB;
this.yOB = yOB;
this.gender = gender;
this.height = height;
this.weight = weight;}

public void setFirstName(String firstName){
this.firstName = firstName;}

public String getFirstname(){
return firstName;
}

public void setLastName(String lastName){
this.lastName = lastName;}
public String getLastname(){
return lastName;
}

public void setMOB(int mOB){
if(mOB > 12){System.out.print("invalid month!!!.please enter a valid month.");
}else{
this.mOB = mOB;}
}
public int getMOB(){
return mOB;
}

public void setDOB(int dOB){
if(dOB > 31){System.out.print("invalid day number!!!.please enter a valid day number.");
}else{
this.dOB = dOB;}
}
public int getDOB(){
return dOB;
}

public void setYOB(int yOB){
this.yOB = yOB;
}
public int getYOB(){
return yOB;
}

public void setGender(String gender){
this.gender = gender;}
public String getGender(){
return gender;
}

public void setHeight(double height){
this.height = height;}
public double getHeight(){
return height;
}

public void setWeight(double weight){
this.weight = weight;}
public double getWeight(){
return weight;
}
private int age;
public void setAge(int yOB){
int age = 2023- yOB;
this.age = age;
}
public int getAge(){
int age = 2023- yOB;
return age;
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
private double bodyMass;;
public double getBMI(){
double bodyMass = (weight*703)/(height *height);
return bodyMass;
}

}