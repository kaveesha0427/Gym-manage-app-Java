
public class Date {
    private int year;
    private int months;
    private int day;

    public  Date(){
        super();
    }
    public Date(int year, int months, int day) {
        this.year = year;
        this.months = months;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        try {
        if(year<0){
            System.out.println("Invalid Year ");
        }else {
            this.year = year;
        }
    }catch (Exception e3){
            System.out.println("Date Error");
        }
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
       try {
           if(months<0){
               System.out.println("Invalid Month ");
           }else{
               this.months = months;
           }
       }catch (Exception e2){
        System.out.println("Date Error");}}

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        try {
        if(day<0){
            System.out.println("Invalid Day ");
        }else{
            this.day = day;
        }}catch (Exception e1){
            System.out.println("Date Error");
        }
    }

}