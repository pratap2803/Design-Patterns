package UseCasesOfLLD.DesignSplitwise.Expense.Split;

import java.util.List;

public class UnequalExpenseSplit implements ExpenseSplit{
    @Override
    public void validateSplitRequest(List<Split> splitList, double totalAmount) {
        // write logic for checking unequal split
    }
}
