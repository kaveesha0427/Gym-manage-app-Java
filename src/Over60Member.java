
public class Over60Member extends  DefaultMember {

    private int Age;



    public Over60Member() {
        super();
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
    public String toString() {
        return " Membership Number = " +getmemberID()+
                " ,  memberID Member Name= " + getName()+
                " , member Address= " + getAddress()+
                " , Member Gender= " + getGender() +
                " , PhoneNo= " + getMemberPhoneNo();
    }
}






