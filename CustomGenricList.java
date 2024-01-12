import java.util.Arrays;
public class CustomGenricList < T > {
  private Object[]data;		//made it private so that it cannot be accessed from out side;
  private int size = 0;		//size is being used as a current pointer
  private int initialCapacity = 10;
    CustomGenricList ()
  {
    data = new Object[initialCapacity];
  }
  CustomGenricList (int capacity)
  {				//to give size dynamically
    data = new Object[capacity];
  }
  public void add (T val)
  {
    if (isFull ())
      resize ();
    data[size] = val;
    size++;
  }
  public T removeLast ()
  {
    T removed = (T) (data[size - 1]);	// used casting explicitly for the first time wow!!
    data[--size] = null;
    return removed;
  }
  public int size ()
  {
    return size;
  }
  private boolean isFull ()
  {
    return size >= data.length;
  }
  private void resize ()
  {
    Object[] temp = new Object [data.length * 2];
    for (int i = 0; i < size; i++)
      {
	temp[i] = data[i];	//both are objects so no type casting is required 
      }
    data = temp;
  }
  public void set(int index,T val){
      while(index>=data.length){
          resize();
      }
      data[index]=val;//data is object type no casting is required
      
  }
  public T get(int index){
      return (T)(data[index]);//data has Object type so need type casting
  }

public String toString(){
    System.out.println(Arrays.toString(data));
    System.out.print("[ ");
    for(int i=0;i<size-1;i++){
        System.out.print(data[i]+", ");
    }
    System.out.print(data[size-1]);
    System.out.println("] ");
    return ("size: "+size);
}







}
