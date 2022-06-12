public class _30_Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ((age<0)||(100<age)){
            age=0;
        }
        this.age = age;
    }

    public boolean isTeen(){
        return ((12<age)&&(age<20));
    }

    public String getFullName(){
        if (firstName.isEmpty()){
            return lastName;
        }else if (lastName.isEmpty()){
            return firstName;
        }
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        _30_Person person = new _30_Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName= " + person.getFullName());
    }

}
