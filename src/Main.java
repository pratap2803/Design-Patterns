import UseCasesOfLLD.TicTacToe.TicTacToeGame;

public class Main {
    public static void main(String[] args) {
//        store.mainStore();// oberverPattern
//        mainClass.mainCl();// strategyPattern
//        mainCl.mainClass();// DesignPatterns.DecoratorPattern

        //Factory Pattern
//        ShapeFactory shapeFactoryObj = new ShapeFactory();
//        Shape shapeObj = shapeFactoryObj.getShape("CIRCLE");
//        shapeObj.draw();

        // tic-tac-toe game
        TicTacToeGame game = new TicTacToeGame();
        System.out.println("game winner is:" + game.startGame());
    }
}