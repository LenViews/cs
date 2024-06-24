public class Team {
    Member member;
    public Team (Member member){
        this.member = member;
    }

    public static void main(String[]args){
        Member myMember = new Member("Lenox", "Student", 2, 1);
        Team myTeam = new Team(myMember);
        System.out.println(myTeam.member.getName());
        System.out.println(myTeam.member.getOccupation());
        System.out.println(myTeam.member.getYear());
        System.out.println(myTeam.member.getRank());
    }
}

class Member{
    private String name;
    private String occupation;
    private int year;
    private int rank;

    public Member(String name, String occupation, int year, int rank){
        this.name = name;
        this.occupation = occupation;
        this.year = year;
        this.rank = rank;
    }

    //get functions
    public String getName(){
        return this.name;
    }
    public String getOccupation(){
        return this.occupation;
    }
    public int getYear(){
        return this.year;
    }
    public int getRank(){
        return this.rank;
    }
}