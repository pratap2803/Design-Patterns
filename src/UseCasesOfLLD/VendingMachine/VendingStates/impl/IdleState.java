package UseCasesOfLLD.VendingMachine.VendingStates.impl;

import UseCasesOfLLD.VendingMachine.Coin;
import UseCasesOfLLD.VendingMachine.Item;
import UseCasesOfLLD.VendingMachine.VendingStates.State;
import UseCasesOfLLD.VendingMachine.VendingStates.VendingMachine;

import java.util.List;

public class IdleState implements State {
    public IdleState(){
        System.out.println("Currently Vending machine is in IdleState");
    }
    public IdleState(VendingMachine machine){
        System.out.println("Currently Vending machine is in IdleState");
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("you can not insert Coin in idle state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("you can not choose product in idle state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not get change in idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product cannot be dispensed in idle state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("you can not get refund in idle state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.getInventory().addItem(item, codeNumber);
    }
}
