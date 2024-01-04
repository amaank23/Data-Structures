
public class Main {
    public static void main(String[] args) {


        DoublyList myRoomList = new DoublyList();

        myRoomList.insert(205, "This is Room no 205");
        myRoomList.insert(201, "This is Room no 201");
        myRoomList.insert(202, "This is Room no 202");
        myRoomList.insert(203, "This is Room no 202");
        myRoomList.insert(206, "This is Room no 202");
        myRoomList.insert(204, "This is Room no 202");
        myRoomList.insert(209, "This is Room no 202");
        myRoomList.displayList();
    }
}