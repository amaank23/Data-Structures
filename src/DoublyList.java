public class DoublyList {
    private DoublyListNode head;
    private int totalNodes = 0;
    public DoublyList(){
        this.head = null;
    }

    public void insert(int roomNo, String roomDetails){
        Room newRoom = new Room(roomNo, roomDetails);
        DoublyListNode newRoomNode = new DoublyListNode(newRoom);
        if(this.isEmpty()){
            this.head = newRoomNode;
            totalNodes++;
        } else if(totalNodes == 1) {
            DoublyListNode head = this.head;
            if(newRoom.roomNo < head.data.roomNo){
                newRoomNode.next = head;
                head.prev = newRoomNode;
                this.head = newRoomNode;
            } else {
                head.next = newRoomNode;
                newRoomNode.prev = head;
            }
            totalNodes++;
        } else {
            DoublyListNode current = this.head;
            while(current.next != null){
                if(newRoom.roomNo < current.data.roomNo){
                    break;
                }
                current = current.next;
                if(current.next == null && newRoom.roomNo > current.data.roomNo){
                    current.next = newRoomNode;
                    newRoomNode.prev = current;
                    return;
                }
            }
            current.prev.next = newRoomNode;
            newRoomNode.prev = current.prev;
            newRoomNode.next = current;
            current.prev = newRoomNode;
            totalNodes++;
        }
    }

    public boolean isEmpty(){ return this.head == null; }

    public void displayList(){
        if(isEmpty()){
            System.out.println("There are no Rooms available.");
        } else {
            DoublyListNode current = this.head;
            int i = 0;
            while(current != null){
                System.out.println(i+1 + ": Room No: " + current.data.roomNo + ", " + "Room Details: " + current.data.roomDetails);
                current = current.next;
                i++;
            }
        }
    }
}
