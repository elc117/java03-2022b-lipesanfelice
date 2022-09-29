import java.util.ArrayList;

public class ListOfTeamMates {

  public static void main(String[] args) {
    ArrayList<TeamMate> list = new ArrayList<TeamMate>();
    
    TeamMate t, p, m;
    t = new TeamMate();
    t.setuserId("Aninha");
    t.setname("Ana");
    t.setonline(true);
    list.add(t);

    p = new TeamMate("Giovanni_", "Giovani", true);
    list.add(p);

    m = new TeamMate("Felipe_S", "Felipe");
    list.add(m);

    for (TeamMate item : list) {
      System.out.println(item.getname());
    }

    for (TeamMate item : list) {
      if(item.getonline() == true){
        System.out.println(item.getuserId());
      }
      
    }
    
  }
}