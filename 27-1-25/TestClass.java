


import java.util.TreeSet;
public class TestClass{
    public static void main(String args[]){
        TreeSet<Integer> tset = new TreeSet<>();
        tset.add(4);
        tset.add(2);
        tset.add(1);
        tset.add(3);
        tset.add(5);
       // System.out.println("the treeset is:"+ tset);
       System.out.println("the treeset is:");
       Iterator<Integer> it=tset.iterator();
       while(it.hasNext()){
        System.out.println(it.next()+" ,");
       }
     //remove
        //tset.remove(3);
        //System.out.println(tset);
       //System.out.println("first element is :" + tset.first());
        //System.out.println("first element is :" + tset.last());
         //System.out.println("first element is :" + tset.pollFirst());
          //System.out.println("first element is :" + tset.pollLast());
    }

          }
        

    

    

