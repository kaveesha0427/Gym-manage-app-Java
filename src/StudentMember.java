

public class StudentMember extends DefaultMember{

    private String schoolName;
    private String schoolAddress;
    public StudentMember(){
        super();
    }


    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }
    public String toString() {
        return " Membership Number = " +getmemberID()+
                " ,  memberID Member Name= " + getName()+
                " , member Address= " + getAddress()+
                " , Member Gender= " + getGender() +
                " , PhoneNo= " + getMemberPhoneNo();
    }
}







