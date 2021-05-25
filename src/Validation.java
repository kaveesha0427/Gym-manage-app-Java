

public class Validation {
    public static void ValidateById(String membershipNo) throws Exception {
        for (int i = 0; i < MyGymManager.MemberDetailsList.size(); i++) {
            if (membershipNo.equals(MyGymManager.MemberDetailsList.get(i).getmemberID())) {
                System.out.println("This Id already exist. ");
                MyGymManager.menu();
            }

        }
    }

}
