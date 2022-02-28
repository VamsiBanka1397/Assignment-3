package com.assgn2rr;

//import com.sun.javafx.UnmodifiableArrayList;
//import com.sun.javafx.fxml.expression.KeyPath;
//
//import java.nio.charset.StandardCharsets;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class numMailmain {

        public String FirstName;
        public String LastName;

        public String getFirstName() {
            return FirstName;
        }

        public void setFirstName(String firstName) {
            FirstName = firstName;
        }

        public String getLastName() {
            return LastName;
        }

        public void setLastName(String lastName) {
            LastName = lastName;
        }

        public String getPhoneNumber() {
            return PhoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            PhoneNumber = phoneNumber;
        }

        public static String getEmail(String email) {
            return Email;
        }

        public static void setEmail(String email) {
            Email = email;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }

        public String getState() {
            return State;
        }

        public void setState(String state) {
            State = state;
        }

        public String getCountry() {
            return Country;
        }

        public void setCountry(String country) {
            Country = country;
        }

        public String PhoneNumber;
        public static String Email;
        public String Address;
        public String State;
        public String Country;


        public static void main(String[] args) {
            List<numMail> list = Arrays.asList
                    (new numMail("Abhinay", "M", "0000000000", "abhi1@gmail.com", "atp", "ts", "India"),
                    (new numMail("Kishore", "k", "1111111111", "kkishore12@gmail.com", "Sivajinagar", "telangana", "India")),
                    (new numMail("Vamsi", "B", "2222222222", "BankaVamsi@gmail.com", "karnataka", "ap", "India")),
                    (new numMail("Alia", "Bhatt", "970482893", "Alia56767@gmail.com", "hasan", "", "India")));
            Scanner sc1 = new Scanner(System.in);
            System.out.println("enter phonenumber");
            String phonenumber1 = sc1.nextLine();

            for (numMail i : list) {
                if (phonenumber1.equals(i.PhoneNumber)) {
                    System.out.println("User Details =" + i.FirstName + i.LastName + i.Address + i.Country + i.State);
                }
                if (Email.equals(i.Email)){
                    System.out.println("User Details = "+i.FirstName + i.LastName + i.Address + i.Country + i.State);
                }
            }
        }
    }

