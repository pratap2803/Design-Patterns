package UseCasesOfLLD.DesignATM.ATMStates;

import UseCasesOfLLD.DesignATM.ATM;
import UseCasesOfLLD.DesignATM.Card;

public class IdleState  extends ATMState{
    @Override
    public void insertCard(ATM atm, Card card){
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}
