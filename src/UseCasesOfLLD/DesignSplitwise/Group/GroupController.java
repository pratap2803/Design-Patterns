package UseCasesOfLLD.DesignSplitwise.Group;

import UseCasesOfLLD.DesignSplitwise.User.User;

import java.util.ArrayList;
import java.util.List;
public class GroupController {
    List<Group> groupList;
    public GroupController(){
        groupList = new ArrayList<>();
    }

    // create group
    public void createNewGroup(String groupId, String groupName, User createdByUser){

        // create a new group
        Group group = new Group();
        group.setGroupId(groupId);
        group.setGroupName(groupName);

        // add the user into the group as it is created by the user
        group.addMember(createdByUser);

        // add the group in the list of overall groups
        groupList.add(group);
    }

    public Group getGroup(String groupid){
        for(Group group: groupList){
            if(group.getGroupId().equals(groupid)){
                return group;
            }
        }
        return null;
    }
}
