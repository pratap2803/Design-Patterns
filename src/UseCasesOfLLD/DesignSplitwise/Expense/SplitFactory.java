package UseCasesOfLLD.DesignSplitwise.Expense;

import UseCasesOfLLD.DesignSplitwise.Expense.Split.EqualExpenseSplit;
import UseCasesOfLLD.DesignSplitwise.Expense.Split.ExpenseSplit;
import UseCasesOfLLD.DesignSplitwise.Expense.Split.PercentageExpenseSplit;
import UseCasesOfLLD.DesignSplitwise.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {
    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType){
        switch (splitType){
            case EQUAL -> {
                return new EqualExpenseSplit();
            }
            case UNEQUAL -> {
                return new UnequalExpenseSplit();
            }
            case PERCENTAGE -> {
                return new PercentageExpenseSplit();
            }
            default -> {
                return null;
            }
        }
    }
}
