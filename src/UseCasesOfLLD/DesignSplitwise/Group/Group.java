package UseCasesOfLLD.DesignSplitwise.Group;

import UseCasesOfLLD.DesignSplitwise.Expense.Expense;
import UseCasesOfLLD.DesignSplitwise.Expense.ExpenseController;
import UseCasesOfLLD.DesignSplitwise.Expense.ExpenseSplitType;
import UseCasesOfLLD.DesignSplitwise.Expense.Split.Split;
import UseCasesOfLLD.DesignSplitwise.User.User;

import java.util.ArrayList;
import java.util.List;

public class Group {
    String groupId;
    String groupName;
    List<User> groupMembers;
    List<Expense> expenseList;
    ExpenseController expenseController;

    public Group() {
        this.groupMembers = new ArrayList<>();
        this.expenseList = new ArrayList<>();
        this.expenseController = new ExpenseController();
    }
    // add member to group
    public void addMember(User member){
        groupMembers.add(member);
    }

    public String getGroupId(){
        return groupId;
    }

    public void setGroupId(String groupId){
        this.groupId = groupId;
    }

    public void setGroupName(String groupName){
        this.groupName = groupName;
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser){
        Expense expense = expenseController.createExpense(expenseId, description, expenseAmount, splitDetails, splitType, paidByUser);
        expenseList.add(expense);
        return expense;
    }
}
