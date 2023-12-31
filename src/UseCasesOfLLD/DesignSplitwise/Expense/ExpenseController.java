package UseCasesOfLLD.DesignSplitwise.Expense;

import UseCasesOfLLD.DesignSplitwise.BalanceSheetController;
import UseCasesOfLLD.DesignSplitwise.Expense.Split.ExpenseSplit;
import UseCasesOfLLD.DesignSplitwise.Expense.Split.Split;
import UseCasesOfLLD.DesignSplitwise.User.User;

import java.util.List;

public class ExpenseController {
    BalanceSheetController balanceSheetController;

    public ExpenseController() {
        this.balanceSheetController = new BalanceSheetController();
    }
    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser){
        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(splitType);
        expenseSplit.validateSplitRequest(splitDetails, expenseAmount);

        Expense expense = new Expense(expenseId, description, expenseAmount, paidByUser, splitType, splitDetails);
        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser, splitDetails, expenseAmount);
        return expense;
    }
}
