package checkers.checkers;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
//package views;

import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

public class BoardView extends BorderPane {
    private static final int BOARD_SIZE = 10;
    private static final int CELL_SIZE = 60;
    public BoardView() {
        GridPane boardGrid = createBoardGrid();
        setCenter(boardGrid);
        setPadding(new Insets(10)); // Отступ вокруг игрового поля
    }
    private GridPane createBoardGrid() {
        GridPane boardGrid = new GridPane();
        // Создаем клетки игрового поля
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                Rectangle cell = createCell(row, col);
                boardGrid.add(cell, col, row);
            }
        }
        return boardGrid;
    }

    private Rectangle createCell(int row, int col) {
        Rectangle cell = new Rectangle(CELL_SIZE, CELL_SIZE);
        // Задаем цвет клеток
        if ((row + col) % 2 == 0) {
            cell.setFill(Color.WHITE);
        } else {
            cell.setFill(Color.GRAY);
        }
        // Добавляем рамку вокруг игрового поля
        if (row == 0 || row == BOARD_SIZE -1 || col == 0 || col == BOARD_SIZE - 1) {
            cell.setFill(Color.BLACK);
        }
        return cell;
    }
}