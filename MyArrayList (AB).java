public class MyArrayList<T> implements MyList<T>{

    private Object[] arr;
    private int length = 0;
    private int capacity = 3;

    public MyArrayList() {
        arr = new Object[capacity];
    }

    @Override
    public void add(T item) {
        if (length == capacity)
            increaseCapacity();

        arr[length++] = item;
    }

    @Override
    public void add(T item, int index) {
        if (index < 0 || index > length) {
            System.out.println("index out of boundary");
            return;
        }
        for(int i=length; i>index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = item;
        length++;
    }

    @Override
    public boolean remove(T item) {
        if(contains(item)==true){
            remove(indexOf(item));
            return true;
        }else{
            return false;
        }

    }

    @Override
    public T remove(int index) {
        Object ans = null;
        if(index < 0 || index >= size()){
            System.out.println("some troubles");
        }else{
            ans = arr[index];
            arr[index] = null;
            length = length - 1;
        }
        return (T)ans;

    }

