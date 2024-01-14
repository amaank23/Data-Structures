
public class Main {
    public static void main(String[] args) {
        Array myArr = new Array(6);
        myArr.append(4);
        myArr.append(2);
        myArr.append(8);
        myArr.append(2);
        myArr.append(9);
        myArr.append(1);

        myArr.mergeSort();
        myArr.display();
    }

}