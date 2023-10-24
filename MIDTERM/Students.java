package students;
class Students{
//Attributes
      String first_name = "";
      String middle_name = "";
      String last_name = "";
      String suffix = "";
      int student_age = 22;
      
      public Students() {
      }
      
      //Getters
      public String getFirstName() {
         return first_name;
      }
      public String getMiddleName() {
         return middle_name;
      }
      public String getLastName() {
         return last_name;
      }
      public String getSuffix() {
         return suffix;
      }
      
      public int getAge() {
         return student_age;
      }
      
      //Setters
      public void setFirstName(String fName){
         first_name = fName;
      }
      public void setMiddleName(String mName){
         middle_name = mName;
      }
      public void setLastName(String lName){
         last_name = lName;
      }
      public void setSuffix(String s){
         suffix = s;
      }
      public void setAge(int age){
         student_age = this.student_age;
      }
}