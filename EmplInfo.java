public class EmplInfo {
    public static void main(String[] args) {
        // Employee details for 5 persons
        String[][] employees = {
            {"Ahmad Ziya", "ahmad@123.com", "EMP001", "123-456-7890"},
            {"Sparsh", "saprsh@322.com", "EMP002", "234-567-8901"},
            {"Tanish", "tanish@834.com", "EMP003", "345-678-9012"},
            {"Umer", "umer@456.com", "EMP004", "456-789-0123"},
            {"Sayyed", "sayyed@346.com", "EMP005", "567-890-1234"}
        };

        
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Name: " + employees[i][0]);
            System.out.println("Mail-ID: " + employees[i][1]);
            System.out.println("Employee Code: " + employees[i][2]);
            System.out.println("Phone: " + employees[i][3]);
            System.out.println(); 
        }
    }
}
