import java.util.Scanner;

public class Array {
    private int[] array;
    int size;
    int length;

    public Array(int size){
        this.size = size;
        this.array = new int[size];
    }

    public void create(){
        System.out.println("Enter Number of Elements: ");
        Scanner noOfElements = new Scanner(System.in);
        this.length = noOfElements.nextInt();
        System.out.println("Enter the array Elements: ");
        for(int i = 0; i < this.length; i++){
            Scanner element = new Scanner(System.in);
            this.array[i] = element.nextInt();
        }
    }

    public void append(int element){
        if(this.length == this.size){
            System.out.println("Array Size Exceeded");
            return;
        }
        this.array[this.length] = element;
        this.length++;
    }

    public void insert(int index, int element){
        if(index >= this.size || this.length == this.size){
            System.out.println("Array Size Exceeded");
            return;
        }
        for(int i = this.length; i > index; i--){
            this.array[i] = this.array[i - 1];
        }
        this.array[index] = element;
        this.length++;
    }

    public int linearSearch(int element){
        for(int i = 0; i < this.length; i++){
            if(this.array[i] == element){
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int element){
        int lo = 0;
        int hi = this.length;
        int mid;
        while(lo <= hi){
            mid = (lo + hi) / 2;
            if(element == this.array[mid]){
                return mid;
            } else if(element < this.array[mid]){
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }

    public void delete(int index){
        for(int i = index; i < this.length - 1; i++){
            this.array[i] = this.array[i + 1];
        }
        this.length--;
    }

    public void display(){
        for(int i = 0; i < this.length; i++){
            System.out.println(this.array[i]);
        }
    }

    public void reverse(){
        int temp;
        for(int i = 0; i < this.length/2; i++){
            temp = this.array[i];
            this.array[i] = this.array[this.length - 1 - i];
            this.array[this.length - 1 - i] = temp;
        }
    }

    public void leftShift(){
        int firstElement = this.array[0];
        for(int i = 0; i < this.length - 1; i++){
            this.array[i] = this.array[i+1];
        }
        this.array[this.length - 1] = firstElement;
    }

    public void selectionSortAsc(){
        // for i = start to len - 1
        //      minimum = i
        //      for j = i+2 to len - 1
        //          if arr[minimum] > arr[j]
        //              minimum = arr[j]
        //      Swap arr[i] and arr[minimum]
        int minimum;
        for(int i = 0; i < this.length; i++){
            minimum = i;
            for(int j = i+1; j < this.length; j++){
                if(this.array[minimum] > this.array[j]){
                    minimum = j;
                }
            }
            int temp = this.array[i];
            this.array[i] = this.array[minimum];
            this.array[minimum] = temp;
        }
    }

    public void selectionSortDesc(){
        int maximum;
        for(int i = 0; i < this.length; i++){
            maximum = i;
            for(int j = i+1; j < this.length; j++){
                if(this.array[maximum] < this.array[j]){
                    maximum = j;
                }
            }
            int temp = this.array[i];
            this.array[i] = this.array[maximum];
            this.array[maximum] = temp;
        }
    }

    public void bubbleSort(){
        for(int i = 0; i < this.length - 1; i++){
            for(int j = 0; j < this.length - i - 1; j++){
                if(this.array[j] > this.array[j + 1]){
                    int temp = this.array[j];
                    this.array[j] = this.array[j + 1];
                    this.array[j + 1] = temp;
                }
            }
        }
    }

    public void insertionSort(){
        // for i = 1 to len - 1
        //      current = arr[i]
        //      for j = i - 1 to start
        //          if current < arr[j]
        //              Swap arr[j + 1] and arr[j]
        //          else
        //              break
        for(int i = 1; i < this.length; i++){
            int current = this.array[i];
            for(int j = i - 1; j >= 0; j--){
                if(current < this.array[j]){
                    this.array[j + 1] = this.array[j];
                    this.array[j] = current;
                } else {
                    break;
                }
            }
        }
    }

    public void bubbleSortV2(){
        for(int i = this.length - 1; i >= 0; i--){
            for(int j = 0; j < i; j++){
                if(this.array[j] > this.array[j + 1]){
                    int temp = this.array[j];
                    this.array[j] = this.array[j + 1];
                    this.array[j + 1] = temp;
                }
            }
        }
    }

    public void mergeSort(){
        divide(this.array, 0, this.size - 1);
    }

    private void divide(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int mid = (low + high) / 2;
        divide(arr, low, mid);
        divide(arr, mid + 1, high);
        merge(arr, low, high, mid);
    }

    private void merge(int[] arr, int low, int high, int mid){
        int[] temp = new int[(high+1) - low];

        int left = low;
        int right = mid + 1;
        int i = 0;
        while(left <= mid && right <= high){
            if(arr[left] < arr[right]){
                temp[i] = arr[left];
                left++;
            } else {
                temp[i] = arr[right];
                right++;
            }
            i++;
        }

        while(left <= mid){
            temp[i] = arr[left];
            left++;
            i++;
        }

        while(right <= high){
            temp[i] = arr[right];
            right++;
            i++;
        }

        i = 0;
        int j = low;
        while(i < temp.length && j <= high){
            arr[j] = temp[i];
            i++;
            j++;
        }
    }

}
