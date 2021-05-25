
public  class DefaultMember {
    private String memberName;
    private String memberGender;
    private String memberID;
    private String memberAddress;
    private String memberPhoneNo;
    private int membershipPrice;
    private String startDate;
    private String finishDate;


    public DefaultMember( String memberID,String memberName, String memberGender, String memberAddress, String memberPhoneNo, int membershipPrice, String startDate, String finishDate) {
        this.memberName = memberName;
        this.memberGender = memberGender;
        this.memberID = memberID;
        this.memberAddress = memberAddress;
        this.memberPhoneNo = memberPhoneNo;
        this.membershipPrice = membershipPrice;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public DefaultMember() {
        super();
    }

    public String getName(){

        return memberName;
    }

    public void setName(String name){
        this.memberName=name;
    }

    public String getGender(){

        return memberGender;
    }

    public void setGender(String gender){
        String s = gender.toLowerCase();
if (s.equals("male") || s.equals("female")){
        this.memberGender= gender;}
else{
    System.out.println("--      Invalid Gender Group      --");
}
    }

    public String getAddress(){
        return memberAddress;
    }
    public void setAddress(String memAddress){
        this.memberAddress = memAddress;
    }

    public String getStartDate(){
        return startDate;
    }
    public void setStartDate(String strDate){
        this.startDate = strDate;
    }


    public String getFinishDate() {
        return finishDate;

    }
    public void setFinishDate(String finDate){
        this.finishDate = finDate;
    }

    public String getMemberPhoneNo(){
        return memberPhoneNo;
    }
    public void setPhoneNo(String memPhoneNo){
        if(memPhoneNo.length()==10){
        this.memberPhoneNo = memPhoneNo ;}
        else{
            System.out.println("--      Invalid Phone number    --");
        }
    }

    public int getMembershipPrice(){
        return membershipPrice;
    }
    public void setPrice(int memPrice){
        try{
        if(memPrice>0){
        this.membershipPrice = memPrice;}
        else {
            System.out.println("    Price Error !   ");
        }}catch (Exception e)
        {
            throw new IllegalArgumentException("    Invalid !  ");
    }}
    public void setmemberID(String memID){
        this.memberID = memID;
    }
    public String getmemberID(){
        return memberID;
    }

    public String toString() {
        return " Membership Number = " +memberID+
                " ,  memberID Member Name= " + memberName+
                " , member Address= " + memberAddress+
                " , Member Gender= " + memberGender +
                " , PhoneNo= " + memberPhoneNo ;
    }

}


