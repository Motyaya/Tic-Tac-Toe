package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------");
        System.out.println("| " + "_" + " " + "_" + " " + "_" + " |");
        System.out.println("| " + "_" + " " + "_" + " " + "_" + " |");
        System.out.println("| " + "_" + " " + "_" + " " + "_" + " |");
        System.out.println("---------");
        String[][] field = new String[3][3];
        boolean turn = false;
        int win = 0, x = 0, o = 0;
        boolean end = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = String.valueOf("_");
            }
        }
        for (; ; ) {
            System.out.print("Enter the coordinates: ");
            int coordinata1 = scanner.nextInt();
            int coordinata2 = scanner.nextInt();
            if (coordinata1 > 3 || coordinata2 > 3 || coordinata1 < 1 || coordinata2 < 1) {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            } else {
                if (coordinata1 == 1) {
                    if (coordinata2 == 3 && field[0][0].equals("_")) {
                        if (turn == false) {
                            field[0][0] = "X";
                            turn = true;
                        } else {
                            field[0][0] = "O";
                            turn = false;
                        }
                    } else if (coordinata2 == 2 && field[1][0].equals("_")) {
                        if (turn == false) {
                            field[1][0] = "X";
                            turn = true;
                        } else {
                            field[1][0] = "O";
                            turn = false;
                        }
                    } else if (coordinata2 == 1 && field[2][0].equals("_")) {
                        if (turn == false) {
                            field[2][0] = "X";
                            turn = true;
                        } else {
                            field[2][0] = "O";
                            turn = false;
                        }
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                    }
                } else if (coordinata1 == 2) {
                    if (coordinata2 == 3 && field[0][1].equals("_")) {
                        if (turn == false) {
                            field[0][1] = "X";
                            turn = true;
                        } else {
                            field[0][1] = "O";
                            turn = false;
                        }
                    } else if (coordinata2 == 2 && field[1][1].equals("_")) {
                        if (turn == false) {
                            field[1][1] = "X";
                            turn = true;
                        } else {
                            field[1][1] = "O";
                            turn = false;
                        }
                    } else if (coordinata2 == 1 && field[2][1].equals("_")) {
                        if (turn == false) {
                            field[2][1] = "X";
                            turn = true;
                        } else {
                            field[2][1] = "O";
                            turn = false;
                        }
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                    }
                } else if (coordinata1 == 3) {
                    if (coordinata2 == 3 && field[0][2].equals("_")) {
                        if (turn == false) {
                            field[0][2] = "X";
                            turn = true;
                        } else {
                            field[0][2] = "O";
                            turn = false;
                        }
                    } else if (coordinata2 == 2 && field[1][2].equals("_")) {
                        if (turn == false) {
                            field[1][2] = "X";
                            turn = true;
                        } else {
                            field[1][2] = "O";
                            turn = false;
                        }
                    } else if (coordinata2 == 1 && field[2][2].equals("_")) {
                        if (turn == false) {
                            field[2][2] = "X";
                            turn = true;
                        } else {
                            field[2][2] = "O";
                            turn = false;
                        }
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        continue;
                    }
                }
                System.out.println("---------");
                System.out.println("| " + field[0][0] + " " + field[0][1] + " " + field[0][2] + " |");
                System.out.println("| " + field[1][0] + " " + field[1][1] + " " + field[1][2] + " |");
                System.out.println("| " + field[2][0] + " " + field[2][1] + " " + field[2][2] + " |");
                System.out.println("---------");

                if (x > o + 1 || o > x + 1) {
                    System.out.println("Impossible");
                    end = true;
                }
                if (!end) {
                    for (int i = 0; i < 3; i++) {
                        if (field[i][0].equals("X") && field[i][1].equals("X") && field[i][2].equals("X")) {
                            if (field[i][0].equals("X")) {
                                System.out.println("X wins");
                                end = true;
                                break;
                            }
                        } else if (field[i][0].equals("O") && field[i][1].equals("O") && field[i][2].equals("O")) {
                            System.out.println("O wins");
                            end = true;
                            break;
                        }
                    }
                }
                if (end == true) {
                    break;
                }
            }
            if (!end) {
                int opa = 0, opapa = 0;
                for (int j = 0; j < 3; j++) {
                    if (field[0][j].equals("X") && field[1][j].equals("X") && field[2][j].equals("X")) {
                        opa = 1;
                        end = true;
                    } else if (field[0][j].equals("O") && field[1][j].equals("O") && field[2][j].equals("O")) {
                        opapa = 1;
                        end = true;
                    }
                }
                if (opa == 1 && opapa == 1) {
                    System.out.println("Impossible");
                } else if (opa == 1 && opapa == 0) {
                    System.out.println("X wins");
                    break;
                } else if (opa == 0 && opapa == 1) {
                    System.out.println("O wins");
                    break;
                }
            }
            if (!end) {
                if (field[0][0].equals(field[1][1]) && field[1][1].equals(field[2][2]) || field[0][2].equals(field[1][1]) && field[1][1].equals(field[2][0])) {
                    if (field[1][1].equals("O")) {
                        System.out.println("O wins");
                        end = true;
                        break;
                    } else if (field[1][1].equals("X")) {
                        System.out.println("X wins");
                        end = true;
                        break;
                    }

                }
                if (!end) {
                    int count = 0;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (field[i][j].equals("_")) {
                                count++;
                            }
                        }
                    }
                    if (count == 0) {
                        System.out.println("Draw");
                        end = true;
                        break;
                    }
                }
            }
        }
    }
}