
public class Main {
    public static void main(String[] args) {


        Tree myMoveDB = new Tree();
        myMoveDB.addNodeToRoot("Movies");
        myMoveDB.addNodeToRoot("Action");
        myMoveDB.addNodeToRoot("Comedy");
        myMoveDB.addNodeToRoot("Adventure");

        myMoveDB.addNodeToWhere("Action", "Mission Impossible");
        myMoveDB.addNodeToWhere("Action", "Avengers");

        myMoveDB.addNodeToWhere("Comedy", "American Pie");

        myMoveDB.addNodeToWhere("Avengers", "Avengers Infiniy War");

        myMoveDB.addNodeToWhere("American Pie", "American Pie Naked Mile");
        myMoveDB.addNodeToWhere("American Pie Naked Mile", "American Pie Naked Mile 1");

        myMoveDB.displayTree();
    }

}