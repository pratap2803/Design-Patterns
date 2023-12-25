package UseCasesOfLLD.DesignATM.ATMStates;

import UseCasesOfLLD.DesignATM.ATM;
import UseCasesOfLLD.DesignATM.AmountWithrawal.CashWithdrawProcessor;
import UseCasesOfLLD.DesignATM.AmountWithrawal.FiveHundredWithdrawProcessor;
import UseCasesOfLLD.DesignATM.AmountWithrawal.OneHundredWithdrawProcessor;
import UseCasesOfLLD.DesignATM.AmountWithrawal.TwoThousandWithdrawProcessor;
import UseCasesOfLLD.DesignATM.Card;

public class CashWithdrawalState extends ATMState{
    public CashWithdrawalState(){
        System.out.println("Please enter the Withrawal Amount");
    }

    public void cashWithrawal(ATM atmObject, Card card, int withdrawalAmountRequest){
        if(atmObject.getAtmBalance() < withdrawalAmountRequest){
            System.out.println("Insufficient fund in the ATM Machine");
            exit(atmObject);
        } else if(card.getBankBalance() < withdrawalAmountRequest){
            System.out.println("Insufficient fund in your bank Account");
        } else {
            card.deductBankBalance(withdrawalAmountRequest);
            atmObject.deductATMBalance(withdrawalAmountRequest);

            // using chain of responsibility for this logic, how many 2k Rs notes, how many 500 rs notes etc, has to be withrawal
            CashWithdrawProcessor withdrawalProcessor = new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));
        }
    }
    @Override
    public void exit(ATM atmObject) {
        returnCard();
        atmObject.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }

}
