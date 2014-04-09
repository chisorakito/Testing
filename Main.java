package edu.cmu.cs.cs214.hw0;

public class Main 
{
    public static void main(String[] args) 
    {
        FriendGraph graph = new FriendGraph();
        
        /*
         *  test <code>Person</code> constructor
         */
        Person rachel = new Person("Rachel");
        System.out.println("created " + rachel.getName());
        
        Person ross = new Person("Ross");
        System.out.println("created " + ross.getName());
        
        Person ben = new Person("Ben");
        System.out.println("created " + ben.getName());
        
        Person kramer = new Person("Kramer");
        System.out.println("created " + kramer.getName());
        
        /*
         *  test <code>addPerson</code>
         */
        graph.addPerson(rachel);
        System.out.println("added " + rachel.getName());
        
        graph.addPerson(ross);
        System.out.println("added " + ross.getName());
        
        graph.addPerson(ben);
        System.out.println("added " + ben.getName());
        
        graph.addPerson(kramer);
        System.out.println("added " + kramer.getName());
     
        System.out.println();
        
        /*
         *  test <code>addFriendship</code>
         */
        graph.addFriendship("Rachel", "Ross");
        System.out.println("Rachel and Ross are friends");
        System.out.println();
        
        graph.addFriendship("Ross", "Ben");
        System.out.println("Ross and Ben are friends");
        
        System.out.println();
        
        /*
         *  test <code>getDistance</code>
         */
        System.out.print("Rachel -> Ross = ");
        System.out.println(graph.getDistance("Rachel", "Ross")); // 1
        
        System.out.print("Rachel -> Ben = ");
        System.out.println(graph.getDistance("Rachel", "Ben")); // 2
        
        System.out.print("Rachel -> Rachen = ");
        System.out.println(graph.getDistance("Rachel", "Rachel")); // 0
        
        System.out.print("Rachel -> Kramer = ");
        System.out.println(graph.getDistance("Rachel", "Kramer")); // -1

        System.out.println();

    }
}






