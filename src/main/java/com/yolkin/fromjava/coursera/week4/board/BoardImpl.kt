package com.yolkin.fromjava.coursera.week4.board

fun createSquareBoard(width: Int): SquareBoard {
    return SquareBoardImpl(width)
}

fun <T> createGameBoard(width: Int): GameBoard<T> {
    return GameBoardImpl(width)
}

