package com.company.Lesson16_Exception;

/**
 * Created by Саша on 13.12.2016.
 * checked - проверяемое (IOException, RemoteException, FileNotFoundException, URISyntaxException)
 * unchecked - (NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException)
 *
 *
 * try
 * catch
 * finally
 * throws
 * throw
 *
 * Throwable checked/unchecked
 *
 * - Exception - checked/unchecked
 *    - RuntimeException unchecked
 *    - IOException checked
 * - Error - unchecked
 */
public class Test_Exception {
    public static void main(String[] args) {
            try {
                String s = null;
                s.toUpperCase();
                System.out.println("TEXT");
            } catch (NullPointerException e){
                System.out.println("Problem1!");
            } catch (ArithmeticException e){
                System.out.println("Problem2!");
            }  catch (Exception e){
                System.out.println("Problem3!");
            }finally {
                System.out.println("Ok!!!!!!");
            }



        System.out.println("OK");
        System.out.println("OK");
        System.out.println("OK");
        System.out.println("OK");
        System.out.println("OK");
        System.out.println("OK");
    }
}
