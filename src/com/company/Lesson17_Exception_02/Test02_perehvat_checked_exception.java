package com.company.Lesson17_Exception_02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;

/**
 * Created by Саша on 18.12.2016.
 */

/* Перехват checked исключений
В методе processExceptions обработайте все checked исключения.
Нужно вывести на экран каждое возникшее checked исключение.
Можно использовать только один блок try..
IOException, RemoteException, FileNotFoundException
*/
public class Test02_perehvat_checked_exception {
    public static void main(String[] args) {
        processExceptions();
    }

    private static void processExceptions() {
        try {
            exept1();
            exept2();
            exept3();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (RemoteException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void exept1() throws IOException {
        throw new IOException();
    }

    private static void exept2() throws RemoteException {
        throw new RemoteException();
    }

    private static void exept3() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}
