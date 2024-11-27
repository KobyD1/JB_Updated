package seleniumTraining;

import java.io.DataInputStream;
import java.io.IOException;

public class readFromConsole {

    public static void main(String[] args) throws IOException {
        DataInputStream reader = new DataInputStream(System.in);

        System.out.println("please define user as string");
        String inputString = reader.readLine();
        System.out.println("please define num as int");
        int inputInt = Integer.parseInt(reader.readLine());
        System.out.println("test end");

    }
}
