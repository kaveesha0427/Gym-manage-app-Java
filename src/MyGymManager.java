import java.util.ArrayList;
import java.util.Scanner;

public class MyGymManager {
    private static int  UserSelection;
    private static Scanner sc = new Scanner(System.in);
    static ArrayList<DefaultMember> MemberDetailsList = new ArrayList<DefaultMember>(100);
    private static int membersCount;
    private static String memberInfo;
    static  String userId;
    public static void menu() throws Exception {
        System.out.println();
        System.out.println();
        System.out.println("            -        Gym Management System        -");
        System.out.println("            ----------------------------------------");
        System.out.println();
        System.out.println("         1. Add a new member            ");
        System.out.println("         2. Delete a member             ");
        System.out.println("         3. Print the list of members   ");
        System.out.println("         4. Sort the item               ");
        System.out.println("         5. Write/Save in a file        ");
        System.out.println("         6. Open a GUI                  ");
        System.out.println("         7. Exit                        ");
        System.out.println();
        UserSelection = sc.nextInt();

        switch (UserSelection) {
            case 1:
                AddMember();
                MainMenu.Write_SaveFile(memberInfo);
                break;

            case 2:
                MainMenu.DeleteMember();
                break;

            case 3:
                MainMenu.PrintMemberList();
                break;

            case 4:
                MainMenu.SortMemberDetails();
                break;

            case 5:
                MainMenu.Write_SaveFile(memberInfo);
                break;

            case 6:
               //GUIMAinPage.ma();
                break;

            case 7:
                System.out.println("Thank you");
                System.exit(0);
                break;

            default:
                System.out.println("invalid input!");
                menu();

        }
    }

    public static void AddMember() throws Exception {

        MyGymManager.membersCount = MemberDetailsList.size();


        System.out.println("          1. Default member             ");
        System.out.println("          2. Student member             ");
        System.out.println("          3. Over60 member              ");
        System.out.println("          4. Back                       ");
        System.out.println();
        System.out.println("Available free space : "+(100-MemberDetailsList.size()));
        int userSelection = sc.nextInt();

        switch (userSelection) {
            case 1:
                if (membersCount < 100) {
                   addDefaultMember();
                } else {
                    System.out.println("Sorry! All the slots are full !");
                    menu();
                }
                break;

            case 2:
                if (membersCount < 100) {
                    addStudentMember();
                } else {
                    System.out.println("Sorry! All the slots are full !");
                    menu();
                }
                break;

            case 3:
                if (membersCount < 100) {
                    addOver60Member();
                } else {
                    System.out.println("Sorry! All the slots are full !");
                    menu();
                }
                break;

            case 4:
                menu();

            default:
                System.out.println("invalid input!");
                AddMember();

        }

    }


    private static void addOver60Member() throws Exception {
        Over60Member over60Member = new Over60Member();
        System.out.print("Enter new membership number : ");
        userId = sc.next();
        over60Member.setmemberID(userId);
        Validation.ValidateById(userId);


        System.out.println("Enter new member's name : ");
        over60Member.setName(sc.next());

        System.out.println("Enter new member's Phone Number : ");
        over60Member.setPhoneNo(sc.next());

        System.out.println("Enter member's gender : ");
        over60Member.setGender(sc.next());

        System.out.println("Enter new member's address : ");
        over60Member.setAddress(sc.next());

        System.out.println("Enter start membership date : ");
        System.out.print("Enter year : "); int year =sc.nextInt();
        System.out.print("Enter month :");int month =sc.nextInt();
        System.out.print("Enter Date :"); int date =sc.nextInt();
        String str1 = Integer.toString(year);
        String str2 = Integer.toString(month);
        String str3 = Integer.toString(date);
        over60Member.setStartDate(str1 + str2 +str3);


        Date datecalidation = new Date();
        datecalidation.setDay(date);
        datecalidation.setMonths(month);
        datecalidation.setYear(year);



        System.out.println("Enter End membership date : ");
        System.out.print("Enter year : ");  year =sc.nextInt();
        System.out.print("Enter month :");      month =sc.nextInt();
        System.out.print("Enter Date :");  date =sc.nextInt();

        datecalidation.setDay(date);
        datecalidation.setMonths(month);
        datecalidation.setYear(year);
        String str5 = Integer.toString(year);
        String str6 = Integer.toString(month);
        String str7 = Integer.toString(date);
        over60Member.setFinishDate(str5 + str6 +str7);

        System.out.println("Enter membership Price : ");
        over60Member.setPrice(sc.nextInt());
        MemberDetailsList.add(over60Member);
        memberInfo=" Membership Number : " + over60Member.getmemberID() +"  , Name : " + over60Member.getName() +" , Age "+over60Member.getAge()+
                "  , Gender : "+ over60Member.getGender()+"   ,Address : "+over60Member.getAddress()+"  , Phone No : "+ over60Member.getMemberPhoneNo()+
                "  ,  Membership Start Date : "+ over60Member.getStartDate();


    }

    private static void addStudentMember() throws Exception {
        StudentMember studentMember = new StudentMember();

        System.out.print("Enter new membership number : ");
        userId = sc.next();
        studentMember.setmemberID(userId);
        Validation.ValidateById(userId);

        System.out.print("Enter new member's name : ");
        studentMember.setName(sc.next());

        System.out.print("Enter new member's Phone Number : ");
        studentMember.setPhoneNo(sc.next());

        System.out.print("Enter member's gender : ");
        studentMember.setGender(sc.next());

        System.out.print("Enter new member's address : ");
        studentMember.setAddress(sc.next());

        System.out.println("Enter start membership date : ");
        System.out.print("Enter year : "); int year =sc.nextInt();
        System.out.print("Enter month :"); int month =sc.nextInt();
        System.out.print("Enter Date :"); int date =sc.nextInt();
        String str1 = Integer.toString(year);
        String str2 = Integer.toString(month);
        String str3 = Integer.toString(date);
       studentMember.setStartDate(str1 + str2 +str3);


        Date datecalidation = new Date();
        datecalidation.setDay(date);
        datecalidation.setMonths(month);
        datecalidation.setYear(year);


        System.out.println("Enter End membership date : ");
        System.out.print("Enter year : ");year =sc.nextInt();
        System.out.print("Enter month :");month =sc.nextInt();
        System.out.print("Enter Date :");date =sc.nextInt();

        datecalidation.setDay(date);
        datecalidation.setMonths(month);
        datecalidation.setYear(year);
        String str4 = Integer.toString(year);
        String str5 = Integer.toString(month);
        String str6 = Integer.toString(date);
        studentMember.setFinishDate(str4 + str5 +str6);


        System.out.print("Enter membership Price : ");
        studentMember.setPrice(sc.nextInt());

        System.out.print("Student Member's School Name : ");
        studentMember.setSchoolName(sc.next());

        System.out.print("Student Member's School Address : ");
        studentMember.setSchoolAddress(sc.next());
        MemberDetailsList.add(studentMember);
        memberInfo=" Membership Number : " + studentMember.getmemberID() +"  , Name : " + studentMember.getName() +
                "  , Gender : "+ studentMember.getGender()+"   ,Address : "+studentMember.getAddress()+"  , Phone No : "+ studentMember.getMemberPhoneNo()+" , School Name" +studentMember.getSchoolName()+" , School Address " + studentMember.getAddress()+
                "  ,  Membership Start Date : "+ studentMember.getStartDate();

    }

    private static void addDefaultMember() throws Exception {
        DefaultMember defaultMember = new DefaultMember();

        System.out.print("Enter new membership number: ");
        userId = sc.next();
       defaultMember.setmemberID(userId);
        Validation.ValidateById(userId);

        System.out.print("Enter new member's name : ");
        defaultMember.setName(sc.next());

        System.out.print("Enter new member's Phone Number : ");
        defaultMember.setPhoneNo(sc.next());

        System.out.print("Enter member's gender : ");
        defaultMember.setGender(sc.next());

        System.out.print("Enter new member's address : ");
        defaultMember.setAddress(sc.next());

        System.out.println("Enter start membership date : ");
        System.out.print("Enter year : ");int year =sc.nextInt();
        System.out.print("Enter month :");     int month =sc.nextInt();
        System.out.print("Enter Date :");    int date =sc.nextInt();
        String str1 = Integer.toString(year);
        String str2 = Integer.toString(month);
        String str3 = Integer.toString(date);
        defaultMember.setStartDate(str1 + str2 +str3);


        Date datecalidation = new Date();
        datecalidation.setDay(date);
        datecalidation.setMonths(month);
        datecalidation.setYear(year);


        System.out.println("Enter End membership date : ");

        System.out.print("Enter year : ");year =sc.nextInt();
        System.out.print("Enter month :"); month =sc.nextInt();
        System.out.print("Enter Date :");   date =sc.nextInt();
        datecalidation.setDay(date);
        datecalidation.setMonths(month);
        datecalidation.setYear(year);
        String str4 = Integer.toString(year);
        String str5 = Integer.toString(month);
        String str6 = Integer.toString(date);
        defaultMember.setFinishDate(str4 + str5 +str6);

        System.out.print("Enter membership Price : ");
        int memPrice = sc.nextInt();
        defaultMember.setPrice(memPrice);


        MemberDetailsList.add(defaultMember);

        memberInfo=" Membership Number : " + defaultMember.getmemberID() +"  , Name : " + defaultMember.getName() +
                "  , Gender : "+ defaultMember.getGender()+"   ,Address : "+defaultMember.getAddress()+"  , Phone No : "+ defaultMember.getMemberPhoneNo()+
                "  ,  Membership Start Date : "+ defaultMember.getStartDate();

    }
    public static void main(String[] args) throws Exception {
        do{menu();}
        while (UserSelection!=7);

    }


}


