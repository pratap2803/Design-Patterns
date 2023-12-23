package UseCasesOfLLD.VendingMachine.VendingStates.impl;


import UseCasesOfLLD.VendingMachine.Coin;
import UseCasesOfLLD.VendingMachine.Item;
import UseCasesOfLLD.VendingMachine.VendingStates.State;
import UseCasesOfLLD.VendingMachine.VendingStates.VendingMachine;

import java.util.List;

public class DispenseState implements State {
    DispenseState(VendingMachine machine, int codeNumber)throws Exception{

        System.out.println("Currently Vending machine is in DispenseState");
        dispenseProduct(machine, codeNumber);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {

    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {

    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {

    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {

    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        return 0;
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        return null;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        return null;
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {

    }
}
