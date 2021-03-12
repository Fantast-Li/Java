package com.li;
    class Student {
        String name ;
        public Student(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
    public class ToStringTest {
        public static void main(String[] args) {
            Student student = new Student("ming");
            System.out.println(student);
        }
    }
