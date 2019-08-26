package bilan_max.NestedClasse;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhoneBook {
    // lab 2_12_1
    private PhoneNumber[] arrayPhone = new PhoneNumber[10];

    static class PhoneNumber {
        private String name,
                phone;

        public PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "PhoneNumber: name=" + name + ", phone=" + phone;
        }
    }

    public void addPhoneNumber(String name, String phone) {
        for (int freePosition = 0; freePosition < arrayPhone.length; freePosition++) {
            if (arrayPhone[freePosition] == null) {
                arrayPhone[freePosition] = new PhoneNumber(name, phone);
                break;
            }
        }
    }

    public void printPhoneBook() {
        int index = 0;
        while (index < arrayPhone.length && arrayPhone[index] != null) {
            System.out.println(arrayPhone[index++]);
        }
    }

    public void sortByName() {
        Arrays.sort(arrayPhone, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                PhoneNumber obj_1 = (PhoneNumber) o1;
                PhoneNumber obj_2 = (PhoneNumber) o2;
                String name_1 = obj_1.getName();
                String name_2 = obj_2.getName();
                return name_1.compareTo(name_2);
            }
        });
    }

    public void sortByPhoneNumber() {
        Arrays.sort(arrayPhone, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String phone_1 = ((PhoneNumber) o1).getPhone();
                String phone_2 = ((PhoneNumber) o2).getPhone();
                return phone_1.compareTo(phone_2);
            }
        });
    }
}
