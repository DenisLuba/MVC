package mvc.model;

import mvc.bean.User;

import java.util.LinkedList;
import java.util.List;

public class ModelData {
    private boolean displayDeletedUserList;
    private User activeUser;
    private List<User> users = new LinkedList<User>();

    public boolean isDisplayDeletedUserList() {
        return displayDeletedUserList;
    }

    public void setDisplayDeletedUserList(boolean displayDeletedUserList) {
        this.displayDeletedUserList = displayDeletedUserList;
    }

    public User getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }
}

