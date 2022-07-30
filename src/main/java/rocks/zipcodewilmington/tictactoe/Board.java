package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] position;
    public Board(Character[][] matrix) {
        position = matrix;
    }

    public Boolean isInFavorOfX() {

        if (position[0][0] == 'X' && position[0][1] == 'X' && position[0][2] == 'X') {
            return true;
        } else if (position[1][0] == 'X' && position[1][1] == 'X' && position[1][2] == 'X') {
            return true;
        } else if (position[2][0] == 'X' && position[2][1] == 'X' && position[2][2] == 'X') {
            return true;
        } else if (position[0][0] == 'X' && position[1][0] == 'X' && position[2][0] == 'X') {
            return true;
        } else if (position[0][1] == 'X' && position[1][1] == 'X' && position[2][1] == 'X') {
            return true;
        } else if (position[0][2] == 'X' && position[1][2] == 'X' && position[2][2] == 'X') {
            return true;
        } else if (position[0][0] == 'X' && position[1][1] == 'X' && position[2][2] == 'X') {
            return true;
        } else if (position[2][0] == 'X' && position[1][1] == 'X' && position[0][2] == 'X') {
            return true;
        } else {
            return false;
        }

    }


    public Boolean isInFavorOfO() {

        if (position[0][0] == 'O' && position[0][1] == 'O' && position[0][2] == 'O') {
            return true;
        } else if (position[1][0] == 'O' && position[1][1] == 'O' && position[1][2] == 'O') {
            return true;
        } else if (position[2][0] == 'O' && position[2][1] == 'O' && position[2][2] == 'O') {
            return true;
        } else if (position[0][0] == 'O' && position[1][0] == 'O' && position[2][0] == 'O') {
            return true;
        } else if (position[0][1] == 'O' && position[1][1] == 'O' && position[2][1] == 'O') {
            return true;
        } else if (position[0][2] == 'O' && position[1][2] == 'O' && position[2][2] == 'O') {
            return true;
        } else if (position[0][0] == 'O' && position[1][1] == 'O' && position[2][2] == 'O') {
            return true;
        } else if (position[2][0] == 'O' && position[1][1] == 'O' && position[0][2] == 'O') {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isTie() {

        return isInFavorOfO() == isInFavorOfX();
    }

    public String getWinner() {

        if (this.isInFavorOfX()) {
            return "X";
        } else if (this.isInFavorOfO()) {
            return "O";

        } else return "";

    }

}
