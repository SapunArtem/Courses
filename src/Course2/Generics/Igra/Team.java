package Course2.Generics.Igra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Partivipant>{
    private String name;
    private List <T> partivipants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void aaddNewPartivipant(T partivipant){
        partivipants.add(partivipant);
        System.out.println("V komandu " + name + " bil dobavlen noviy uchastnik po imeni " +partivipant.getName());
    }

    public void playWith(Team team){
        String winnerName;
        Random random = new Random();
        int  i = random.nextInt(2);
        if (i==0){
            winnerName=this.name;
        }else {
            winnerName= team.name;
        }
        System.out.println("Viygrala comanda "+ winnerName);
    }
}
