package com.oop.collections.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {
    ArrayList<Student> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    @Override
    public void addPerson(Student p) {
        if (searchByNumber(p.phone) == null) {
            phoneBook.add(p);
        }
    }

    @Override
    public Student searchByName(String name) {
        for (Student student : phoneBook) {
            if (student.name.equals(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastname(String lastname) {
        for (Student student : phoneBook) {
            if (student.lastname.equals(lastname)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String number) {
        for (Student student : phoneBook) {
            if (student.phone.equals(number)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String number) {
        Student student = searchByNumber(number);
        if (student != null) {
            phoneBook.remove(student);
        }
    }
}