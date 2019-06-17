package LabWork_2_2.Lab224;

public class Person {
  public String PersonDemo (String firstName , String lastName , String gender){
      System.out.println("FirstName: "+firstName+", lastName: "+lastName+" , Gender: "+gender);
      return firstName+lastName+gender;
  }

  public String PersonDemo (String firstName , String lastName ){
      System.out.println("FirstName: "+firstName+", lastName: "+lastName);
      return firstName+lastName;
  }

  public String PersonDemo1 (String lastName , String gender){
      System.out.println("LastName: "+lastName+" , Gender: "+gender);
      return lastName+gender;
  }


  public int PersonDemo( int age, int phoneNumber ){
      System.out.println( "Age: "+age+", phoneNumber: "+phoneNumber);
      return age+phoneNumber ;
  }


    public int PersonDemo( int age){
        System.out.println( "Age: "+age);
        return age;
    }

    public String PersonDemo (String firstName , int age){
        System.out.println("FirstName: "+firstName+", Age: "+age);
        return firstName+age;
    }
}
