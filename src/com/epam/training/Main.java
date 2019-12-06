package com.epam.training;

public class Main {

    public static void main(String[] args) {
        int size = 16;
        int j;
        //all A
        for (int i = 0; i < size / 2; i++) {
            for (j = 0; j < size / 2 - i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        // the outline of A
        for (int i = 0; i < size / 2; i++) {
            if (i == 0) {
                for (j = 0; j < size / 2 - i; j++) {
                    System.out.print("*  ");
                }
            } else {
                for (j = 0; j < size / 2 - i; j++) {
                    if (j == 0 || j == size / 2 - i - 1) {
                        System.out.print("*  ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
        //all D
        for (int i = 0; i < size / 2; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        //outline of D
        for (int i = 0; i < size / 2; i++) {
            if (i == size / 2 - 1) {
                for (j = 0; j <= i; j++) {
                    System.out.print("*  ");
                }
            } else {
                for (j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        System.out.print("*  ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
        //All F
        for (int i = 0; i < size / 2; i++) {
            for (j = 0; j < size / 2 - (i + 1); j++) {
                System.out.print("   ");
            }
            for (j = size / 2 - i - 1; j < size / 2; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        //the outline of F
        for (int i = 0; i < size / 2; i++) {
            if (i == size / 2 - 1) {
                for (j = 0; j <= i; j++) {
                    System.out.print("*  ");
                }
            } else {
                for (j = 0; j < size / 2 - (i + 1); j++) {
                    System.out.print("   ");
                }
                for (j = size / 2 - i - 1; j < size / 2; j++) {
                    if (j == size / 2 - i - 1 || j == size / 2 - 1)
                        System.out.print("*  ");
                    else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
        //All C
        for (int i = 0; i < size / 2; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("   ");
            }
            for (j = i; j < size / 2; j++) {
                System.out.print("*  ");
            }
            System.out.println();

        }
        //outline of C
        for (int i = 0; i < size / 2; i++) {
            if (i == 0) {
                for (j = 0; j < size / 2; j++) {
                    System.out.print("*  ");
                }
            } else {
                for (j = 0; j < i; j++) {
                    System.out.print("   ");
                }
                for (j = i; j < size / 2; j++) {
                    if (j == i || j == size / 2 - 1)
                        System.out.print("*  ");
                    else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
        //all B
        for (int i = 0; i < 8; i++) {
            for (j = 0; j < 15; j++) {
                if (j == 15 / 2) {
                    System.out.print("*  ");
                } else if (j < 7 - i || j > 7 + i) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
        // the outline of B
        for (int i = 0; i < 8; i++) {
            for (j = 0; j < 15; j++) {
                if (i == 7) {
                    System.out.print("*  ");
                } else if (j < 7 - i || j > 7 + i) {
                    System.out.print("   ");
                } else if (j == 7 - i || j == 7 + i) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        //All E
        for (int i = 0; i < 8; i++) {
            for (j = 0; j < 15; j++) {
                if (j == 15 / 2) {
                    System.out.print("*  ");
                }else if (j >=i && j < 15-i) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        //outline of E
        for (int i = 0; i < 8; i++) {
            for (j = 0; j < 15; j++) {
                if (i == 0) {
                    System.out.print("*  ");
                } else if (j >i && j <15-i-1) {
                    System.out.print("   ");
                } else if (j == i || j ==15- i-1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }



    }
}

