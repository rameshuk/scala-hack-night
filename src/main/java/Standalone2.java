package main.java;

/**
 * Created by ramesh on 26/04/2016.
 */
public class Standalone2 {

    public static void main(String args[]) {
        System.out.println(ops(10,5,"+"));
        System.out.println(ops(10,5,"-"));
        System.out.println(ops(10,5,"*"));
        System.out.println(ops(10,5,"/"));
        System.out.println(ops(10,5,"unknown-ops"));
    }

    public static Integer ops(Integer x, Integer y, String ops) {

        if(ops == "+") {
            return x+y;
        }else if(ops == "-"){
            return x-y;
        }else if (ops == "*"){
            return x*y;
        }else if(ops == "/"){
            return x/y;
        }

       return -1; //invalid options
    }
}
