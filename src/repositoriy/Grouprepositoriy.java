package repositoriy;

import model.Group;

import java.util.ArrayList;
import java.util.List;

public class Grouprepositoriy {
    private List<Group> groups=new ArrayList<>();
    public void removeGroups(List<Group> groups1){
        groups.removeAll(groups1);

    }
    public void addGroups(List<Group> newGroups){
        groups.addAll(newGroups);
    }
            public List<Group> getgroups(){
        return groups;
            }
}
