package structural.composite.exercise;

public class Main {
    public static void main(String[] args) {
        var team = new Team();
        var subteam1 = new Team();
        var subteam2 = new Team();
        subteam1.add(new Truck());
        subteam1.add(new Human());
        subteam1.add(new Human());
        subteam2.add(new Truck());
        subteam2.add(new Human());
        subteam2.add(new Human());
        team.add(subteam1);
        team.add(subteam2);
        team.attack();
    }
}
