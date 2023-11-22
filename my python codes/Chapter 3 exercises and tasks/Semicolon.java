public class Semicolon{
  private int numberOfStudents;
  private int numberOfCohorts;
 public Semicolon(int numberOfStudents,int numberOfCohorts){
 this.numberOfStudents =  numberOfStudents;
 this.numberOfCohorts = numberOfCohorts;
}
public void setNumberOfStudents(int numberOfStudents){
 this.numberOfStudents = numberOfStudents;
}
public void setNumberOfCohorts(int numberOfCohorts){
 this.numberOfCohorts = numberOfCohorts;
}

public int getNumberOfCohorts(){
 return numberOfCohorts;
}
public int getNumberOfStudents(){
 return numberOfStudents;
}
}