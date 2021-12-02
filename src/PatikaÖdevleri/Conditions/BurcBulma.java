package PatikaÖdevleri.Conditions;

import java.util.Scanner;

public class BurcBulma {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print(" Lütfen Doğduğunuz Ayı Girin : ");
        int a = scan.nextInt();

        System.out.print(" Lütfen Doğduğunuz Günü Girin : ");
        int b = scan.nextInt();

        String burc = "Burcunuz : ";
        boolean isError = false;

        switch (a) {
            case 1:
                if (1 <= b && b <= 31) {
                    if (b < 22) {
                        System.out.println(burc + " Oğlak Burcu");
                    } else {
                        System.out.println(burc + " Kova Burcu");
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:
                if (1 <= b && b <= 28) {
                    if (b < 20) {
                        System.out.println(burc + " Kova Burcu");
                    } else {
                        System.out.println(burc + " Balık Burcu");
                    }
                } else {
                    isError = true;
                }
                break;
            case 3:
                if (1 <= b && b <= 31) {
                    if (b < 21) {
                        System.out.println(burc + " Balık Burcu");
                    } else {
                        System.out.println(burc + " Koç Burcu");
                    }
                } else {
                    isError = true;
                }
                break;
            case 4:
                if (1 <= b && b <= 30) {
                    if (b < 21) {
                        System.out.println(burc + " Koç Burcu");
                    } else {
                        System.out.println(burc + " Boğa Burcu");
                    }
                } else {
                    isError = true;
                }
                break;
            case 5:
                if (1 <= b && b <= 31) {
                    if (b < 22) {
                        System.out.println(burc + " Boğa Burcu");
                    } else {
                        System.out.println(burc + " İkizler Burcu");
                    }
                } else {
                    isError = true;
                }
                break;

            case 6:
                if (1 <= b && b <= 30) {
                    if (b < 23) {
                        System.out.println(burc + " İkizler Burcu");
                    } else {
                        System.out.println(burc + " Yengeç Burcu");
                    }
                } else {
                    isError = true;
                }
                break;
            case 7:
                if (1 <= b && b <= 31) {
                    if (b < 23) {
                        System.out.println(burc + " Yengeç Burcu");
                    } else {
                        System.out.println(burc + " Aslan Burcu");
                    }
                } else {
                    isError = true;
                }
                break;

            case 8:
                if (1 <= b && b <= 30) {
                    if (b < 22) {
                        System.out.println(burc + " Aslan Burcu");
                    } else {
                        System.out.println(burc + " Başak Burcu");
                    }
                } else {
                    isError = true;
                }
                break;

            case 9:
                if (1 <= b && b <= 31) {
                    if (b < 23) {
                        System.out.println(burc + " Başak Burcu");
                    } else {
                        System.out.println(burc + " Terazi Burcu");
                    }
                } else {
                    isError = true;
                }
                break;

            case 10:
                if (1 <= b && b <= 30) {
                    if (b < 23) {
                        System.out.println(burc + " Terazi Burcu");
                    } else {
                        System.out.println(burc + " Akrep Burcu");
                    }
                } else {
                    isError = true;
                }
                break;

            case 11:
                if (1 <= b && b <= 31) {
                    if (b < 22) {
                        System.out.println(burc + " Akrep Burcu");
                    } else {
                        System.out.println(burc + " Yay Burcu");
                    }
                } else {
                    isError = true;
                }
                break;

            case 12:
                if (1 <= b && b <= 30) {
                    if (b < 22) {
                        System.out.println(burc + " Yay Burcu");
                    } else {
                        System.out.println(burc + " Oğlak Burcu");
                    }
                } else {
                    isError = true;
                }
                break;
        }
    }
}

