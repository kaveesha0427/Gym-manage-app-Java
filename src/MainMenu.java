import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.Scanner;

public class  MainMenu {
    private static Scanner sc = new Scanner(System.in);
static void SortMemberDetails() {

    MyGymManager.MemberDetailsList.sort(new Comparator<DefaultMember>() {
        @Override
        public int compare(DefaultMember objec1, DefaultMember objec2) {
            return objec1.getmemberID().compareTo(objec2.getmemberID()                                                   );
        }
    });
    MyGymManager.MemberDetailsList.forEach(System.out::println);
}

    static void PrintMemberList() throws Exception {
        System.out.println();
        for (int i=0; i<MyGymManager.MemberDetailsList.size();i++) {
            DefaultMember member = MyGymManager.MemberDetailsList.get(i);
            System.out.println( " Membership Number : " + member.getmemberID() +"  , Name :" + member.getName() +
                    "  , Gender : "+ member.getGender()+"   ,Address :"+member.getAddress()+"  , Phone No : "+ member.getMemberPhoneNo()+
                    "  ,  Membership Start Date : "+ member.getStartDate());

        }
        MyGymManager.menu();
    }


    static void Write_SaveFile(String Memberdetails) throws IOException {

        File file = new File("MemberDetails.txt");
        FileWriter fileWriter= null;
        PrintWriter printWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            printWriter = new PrintWriter(fileWriter,true);
            printWriter.print(Memberdetails);
            printWriter.println("\n\n");
            System.out.println("Successfully wrote to the file.");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            fileWriter.close();
            printWriter.close();
        }
    }


    static void OpenGUI() {

    }


    static void DeleteMember() throws Exception {
        System.out.println("");


        System.out.println("1. Delete default member");
        System.out.println("2. Delete student member");
        System.out.println("3. Delete over60 member");
        System.out.println("4. Back");
        System.out.println(" ");
        System.out.println("Enter Your Selection :");
        int select = sc.nextInt();
        switch (select) {
            case 1:
                System.out.println("Enter default memberId number : ");
                String defaultMemberId = sc.next();
                deleteMemberByMemberId(defaultMemberId);
                break;
            case 2:
                System.out.println("Enter student memberId number : ");
                String studentMemberId = sc.next();
                deleteMemberByMemberId(studentMemberId);
                break;
            case 3:
                System.out.println("Enter over60 memberId number : ");
                String over60MemberId = sc.next();
                deleteMemberByMemberId(over60MemberId);
                break;
            case 4:
                System.out.println("- Back to Menu -");
                MyGymManager.menu();
                break;
            default:
                System.out.println("invalid input  ! ");
                DeleteMember();
                break;
        }

    }
    public static void deleteMemberByMemberId(String membershipNo) {

        for (int i=0; i<MyGymManager.MemberDetailsList.size();i++) {
            if (membershipNo.equals(MyGymManager.MemberDetailsList.get(i) .getmemberID())) {
                MyGymManager.MemberDetailsList.remove(i);
            }
        }
        System.out.println("Successfully deleted the member  ! ");
        System.out.println();
        System.out.println();
    }

}

