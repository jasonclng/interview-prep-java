package uk.jasonng.algoexpert.recursion;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class SudokuSolverTest {
    private SudokuSolver sudokuSolver = new SudokuSolver();

    @Test
    public void TestCase1() {
        int[][] inputValues =
                new int[][]{
                        {7, 8, 0, 4, 0, 0, 1, 2, 0},
                        {6, 0, 0, 0, 7, 5, 0, 0, 9},
                        {0, 0, 0, 6, 0, 1, 0, 7, 8},
                        {0, 0, 7, 0, 4, 0, 2, 6, 0},
                        {0, 0, 1, 0, 5, 0, 9, 3, 0},
                        {9, 0, 4, 0, 6, 0, 0, 0, 5},
                        {0, 7, 0, 3, 0, 0, 0, 1, 2},
                        {1, 2, 0, 0, 0, 7, 4, 0, 0},
                        {0, 4, 9, 2, 0, 6, 0, 0, 7}
                };
        int[][] expectedValues =
                new int[][]{
                        {7, 8, 5, 4, 3, 9, 1, 2, 6},
                        {6, 1, 2, 8, 7, 5, 3, 4, 9},
                        {4, 9, 3, 6, 2, 1, 5, 7, 8},
                        {8, 5, 7, 9, 4, 3, 2, 6, 1},
                        {2, 6, 1, 7, 5, 8, 9, 3, 4},
                        {9, 3, 4, 1, 6, 2, 7, 8, 5},
                        {5, 7, 8, 3, 9, 4, 6, 1, 2},
                        {1, 2, 6, 5, 8, 7, 4, 9, 3},
                        {3, 4, 9, 2, 1, 6, 8, 5, 7}
                };

        checkResults(inputValues, expectedValues);
    }

    @Test
    public void TestCase2() {
        int[][] inputValues =
                new int[][]{
                        {0, 0, 0, 0, 3, 0, 0, 0, 9},
                        {0, 4, 0, 5, 0, 0, 0, 7, 8},
                        {2, 9, 0, 0, 0, 1, 0, 5, 0},
                        {0, 7, 8, 0, 0, 3, 0, 0, 6},
                        {0, 3, 0, 0, 6, 0, 0, 8, 0},
                        {6, 0, 0, 8, 0, 0, 9, 3, 0},
                        {0, 6, 0, 9, 0, 0, 0, 2, 7},
                        {7, 2, 0, 0, 0, 5, 0, 6, 0},
                        {8, 0, 0, 0, 7, 0, 0, 0, 0}
                };
        int[][] expectedValues =
                new int[][]{
                        {1, 8, 5, 7, 3, 6, 2, 4, 9},
                        {3, 4, 6, 5, 2, 9, 1, 7, 8},
                        {2, 9, 7, 4, 8, 1, 6, 5, 3},
                        {5, 7, 8, 2, 9, 3, 4, 1, 6},
                        {9, 3, 2, 1, 6, 4, 7, 8, 5},
                        {6, 1, 4, 8, 5, 7, 9, 3, 2},
                        {4, 6, 3, 9, 1, 8, 5, 2, 7},
                        {7, 2, 9, 3, 4, 5, 8, 6, 1},
                        {8, 5, 1, 6, 7, 2, 3, 9, 4}
                };

        checkResults(inputValues, expectedValues);
    }

    @Test
    public void TestCase3() {
        int[][] inputValues =
                new int[][]{
                        {5, 3, 8, 0, 1, 0, 0, 0, 0},
                        {0, 7, 9, 6, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 2, 0, 0, 0},
                        {0, 0, 7, 0, 2, 3, 4, 0, 0},
                        {0, 0, 5, 0, 8, 0, 0, 0, 9},
                        {4, 6, 0, 0, 9, 0, 0, 0, 1},
                        {0, 9, 0, 2, 3, 4, 1, 5, 0},
                        {0, 4, 1, 5, 0, 0, 2, 0, 0},
                        {0, 0, 0, 8, 6, 1, 0, 3, 0}
                };
        int[][] expectedValues =
                new int[][]{
                        {5, 3, 8, 9, 1, 7, 6, 4, 2},
                        {2, 7, 9, 6, 4, 8, 5, 1, 3},
                        {6, 1, 4, 3, 5, 2, 7, 9, 8},
                        {9, 8, 7, 1, 2, 3, 4, 6, 5},
                        {1, 2, 5, 4, 8, 6, 3, 7, 9},
                        {4, 6, 3, 7, 9, 5, 8, 2, 1},
                        {8, 9, 6, 2, 3, 4, 1, 5, 7},
                        {3, 4, 1, 5, 7, 9, 2, 8, 6},
                        {7, 5, 2, 8, 6, 1, 9, 3, 4}
                };

        checkResults(inputValues, expectedValues);
    }

    @Test
    public void TestCase4() {
        int[][] inputValues =
                new int[][]{
                        {0, 2, 0, 0, 9, 0, 1, 0, 0},
                        {0, 0, 7, 8, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 3, 6, 0},
                        {0, 0, 1, 9, 0, 4, 0, 0, 0},
                        {0, 0, 0, 6, 0, 5, 0, 0, 7},
                        {8, 0, 0, 0, 0, 0, 0, 0, 9},
                        {0, 0, 0, 0, 2, 0, 0, 0, 0},
                        {7, 0, 0, 0, 0, 0, 0, 8, 5},
                        {4, 9, 0, 0, 3, 0, 0, 0, 0}
                };
        int[][] expectedValues =
                new int[][]{
                        {5, 2, 4, 3, 9, 6, 1, 7, 8},
                        {3, 6, 7, 8, 4, 1, 9, 5, 2},
                        {1, 8, 9, 7, 5, 2, 3, 6, 4},
                        {2, 5, 1, 9, 7, 4, 8, 3, 6},
                        {9, 4, 3, 6, 8, 5, 2, 1, 7},
                        {8, 7, 6, 2, 1, 3, 5, 4, 9},
                        {6, 1, 5, 4, 2, 8, 7, 9, 3},
                        {7, 3, 2, 1, 6, 9, 4, 8, 5},
                        {4, 9, 8, 5, 3, 7, 6, 2, 1}
                };

        checkResults(inputValues, expectedValues);
    }

    private void checkResults(int[][] inputValues, int[][] expectedValues) {
        var actual = sudokuSolver.solveSudoku(inputValues);
        assertTrue(Arrays.deepEquals(actual, expectedValues));
    }
}