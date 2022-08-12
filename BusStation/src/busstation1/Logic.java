package busstation1;

import java.util.HashMap;
import java.util.Scanner; 

public class Logic implements Interface{

    HashMap userInfo;
    HashMap driverInfo;
    private static String file;
    private static String tempUsername;
    private static String tempPassword;
    private Scanner x;

    public Logic() {
        userInfo = new HashMap();
        userInfo.put("Nada", "1234");
        userInfo.put("Mariam", "2345");
        userInfo.put("Rawda", "3456");
        driverInfo = new HashMap();
        driverInfo.put("Driver1", "1111");
        driverInfo.put("Driver2", "2222");
        driverInfo.put("Driver3", "3333");

    }

    public boolean loginCustomerVerification(String username, String password) {
        boolean found;
        String fetchedPassword = (String) userInfo.get(username);
        if (fetchedPassword != null) {
            found = fetchedPassword.equals(password);
            if (found == true) {
                tempUsername = username;
            }
        } else {
            found = false;
        }

        return found;
    }

    public boolean loginDriverVerification(String username, String password) {
        boolean found;
        String fetchedPassword = (String) driverInfo.get(username);
        if (fetchedPassword != null) {
            found = fetchedPassword.equals(password);
            tempUsername = username;
            if ("Driver1".equals(username)) {
                file = "C:\\Users\\mariam\\Documents\\NetBeansProjects\\BusStation1\\Driver1.txt";
            } else if ("Driver2".equals(username)) {
                file = "C:\\Users\\mariam\\Documents\\NetBeansProjects\\BusStation1\\Driver2.txt";
            } else if ("Driver3".equals(username)) {
                file = "C:\\Users\\mariam\\Documents\\NetBeansProjects\\BusStation1\\Driver3.txt";
            }
        } else {
            found = false;
        }
        return found;
    }

    public boolean loginManagerVerification(String username, String password) {
        boolean found = false;
        tempUsername = username;
        if ("Manager".equals(username) && "0000".equals(password)) {
            file = "C:\\Users\\mariam\\Documents\\NetBeansProjects\\BusStation1\\Trips.txt";
            found = true;
        }
        return found;
    }

    public String GetFilePath() {
        if (tempUsername.equals("Nada")) {
            file = "C:\\Users\\mariam\\Documents\\NetBeansProjects\\BusStation1\\Nada.txt";
        } else if (tempUsername.equals("Mariam")) {
            file = "C:\\Users\\mariam\\Documents\\NetBeansProjects\\BusStation1\\Mariam.txt";
        }
        if (tempUsername.equals("Rawda")) {
            file = "C:\\Users\\mariam\\Documents\\NetBeansProjects\\BusStation1\\Rawda.txt";
        }
        if (tempUsername.equals("Driver1")) {
            file = "C:\\Users\\mariam\\Documents\\NetBeansProjects\\BusStation1\\Driver1.txt";
        }
        if (tempUsername.equals("Driver2")) {
            file = "C:\\Users\\mariam\\Documents\\NetBeansProjects\\BusStation1\\Driver2.txt";
        }
        if (tempUsername.equals("Driver3")) {
            file = "C:\\Users\\mariam\\Documents\\NetBeansProjects\\BusStation1\\Driver3.txt";
        }
        if (tempUsername.equals("Manager")) {
            file = "C:\\Users\\mariam\\Documents\\NetBeansProjects\\BusStation1\\Trips.txt";
        }
        return file;
    }

    public String getFile() {
        return file;
    }

    public static void setTempUsername(String tempUsername) {
        Logic.tempUsername = tempUsername;
    }

    public static String getTempUsername() {
        return tempUsername;
    }

}
