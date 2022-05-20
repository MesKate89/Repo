package service;

import model.Group;
import repositoriy.Grouprepositoriy;

import java.util.Arrays;
import java.util.List;

public class Groupservice {
    private Grouprepositoriy grouprepositoriy;

    public Groupservice(Grouprepositoriy grouprepositoriy) {
        this.grouprepositoriy = grouprepositoriy;
    }
public void removeGroups (List<Group> removeGroups) {
        removeGroups.forEach(a-> System.out.println(a));
        grouprepositoriy.removeGroups(removeGroups);

}

    public void addGroups(List<Group> newGroups) {
        newGroups.forEach(m -> System.out.println(m));
        grouprepositoriy.addGroups(newGroups);
    }

}
//изменение имени группы
//два сервиса для учителя и для стундента как с группой и метод вычисления з.п. в сервис учителя